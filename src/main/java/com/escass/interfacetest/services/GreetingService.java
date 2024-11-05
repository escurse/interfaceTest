package com.escass.interfacetest.services;

import com.escass.interfacetest.results.greeting.WriteResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GreetingService {

    public WriteResult write() {
        return WriteResult.SUCCESS;
    }
}
