package com.training.fnparser.service;

import com.training.fnparser.model.IpHost;
import com.training.fnparser.model.HostRequest;
import com.training.fnparser.model.HostResponse;

public interface HostService {
    HostResponse startCollectHostData(HostRequest hostRequest);
    IpHost getHostById(Long hostId);
}
