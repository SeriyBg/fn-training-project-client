package com.training.fnparser.service;

import com.training.fnparser.model.HostRequest;
import com.training.fnparser.model.HostResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class HostServiceTest {
    @Autowired
    private HostService hostService;

    @Test
    public void hostServiceTest() {
        HostRequest hostRequest = new HostRequest("127.0.0.1", "okolka", "jnjnuh");

        HostResponse hostResponse = hostService.startCollectHostData(hostRequest);

        assertNotNull("POST 'http:localhost:8086/host' failed", hostResponse);

        if (hostResponse != null) {
            assertNotNull("'id' field is empty", hostResponse.getId());
            assertNotNull("'status' field is empty", hostResponse.getStatus());
        }
    }
}



