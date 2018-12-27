package com.training.fnparser.service;

import com.google.gson.Gson;
import com.google.protobuf.util.JsonFormat;
import com.training.fnparser.model.HostRequest;
import com.training.fnparser.model.HostResponse;
import com.training.fnparser.model.Host;
import com.training.proto.gen.HostProto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HostServiceBean implements HostService {
    @Autowired
    private RestTemplate restTemplate;
    private final String COLLECT_HOST_DATA_URL = "http://localhost:8086/host";
    private HttpHeaders headers;

    HostServiceBean() {
        headers = new HttpHeaders();
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        headers.setContentType(MediaType.APPLICATION_JSON);
    }

    @Override
    public HostResponse startCollectHostData(HostRequest hostRequest) {
        HttpEntity<String> requestBody = new HttpEntity<>((new Gson().toJson(hostRequest)), headers);

        RestTemplate restTemplate = new RestTemplate();
        HostResponse response = null;
        try {
            response = restTemplate.postForObject(COLLECT_HOST_DATA_URL, requestBody, HostResponse.class);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return response;
    }

    @Override
    public HostProto.Host getHostById(Long hostId) {
        HostProto.Host response = null;
        try {
            response = restTemplate.getForObject(COLLECT_HOST_DATA_URL + "/" + hostId, HostProto.Host.class);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return response;
    }

    @Override
    public Host protoDeserialize(HostProto.Host hostProto) {
        JsonFormat.Printer jsonFormat = JsonFormat.printer();
        String hostProtoJson = null;

        try {
            hostProtoJson = jsonFormat.print(hostProto);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return (new Gson()).fromJson(hostProtoJson, Host.class);
    }
}
