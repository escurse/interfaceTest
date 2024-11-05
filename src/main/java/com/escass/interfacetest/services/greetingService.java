package com.escass.interfacetest.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class greetingService {

    public boolean write() {
        return true;
    }
}
