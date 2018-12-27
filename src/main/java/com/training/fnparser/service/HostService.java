package com.training.fnparser.service;

import com.training.fnparser.model.HostRequest;
import com.training.fnparser.model.HostResponse;
import com.training.fnparser.model.Host;
import com.training.proto.gen.HostProto;

public interface HostService {
    HostResponse startCollectHostData(HostRequest hostRequest);
    HostProto.Host getHostById(Long hostId);
    Host protoDeserialize(HostProto.Host hostProto);
}
