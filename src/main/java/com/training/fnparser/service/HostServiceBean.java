package com.training.fnparser.service;

import com.google.gson.Gson;
import com.training.fnparser.model.HostRequest;
import com.training.fnparser.model.HostResponse;
import com.training.fnparser.model.IpHost;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HostServiceBean implements HostService {
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
    public IpHost getHostById(Long hostId) {
        RestTemplate restTemplate = new RestTemplate();
        IpHost response = null;
        try {
            response = restTemplate.getForObject(COLLECT_HOST_DATA_URL + "/" + hostId, IpHost.class);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return response;
    }
}
