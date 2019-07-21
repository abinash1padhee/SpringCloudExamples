package com.abinash.cloud.datetimeapp;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;

@Service
public class DateTimeService {

    @Inject
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod="unknown")
    public String getCurrentDatetime() {
        return restTemplate
                .getForEntity("http://datetime-service/datetime", String.class)
                .getBody();
    }

    public String unknown() {
        return "unknown";
    }
}
