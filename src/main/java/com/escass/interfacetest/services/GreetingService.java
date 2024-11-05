package com.escass.interfacetest.services;

import com.escass.interfacetest.entities.GreetingEntity;
import com.escass.interfacetest.mappers.GreetingMapper;
import com.escass.interfacetest.results.greeting.WriteResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class GreetingService {
    private final GreetingMapper greetingMapper;

    public WriteResult write(GreetingEntity greeting) {
        if (greeting == null ||
                greeting.getWriter() == null || greeting.getWriter().isEmpty() || greeting.getWriter().length() < 2 || greeting.getWriter().length() > 10 ||
                greeting.getContent() == null ||
                greeting.getContent().isEmpty() || greeting.getContent().length() > 100) {
            return WriteResult.FAILURE;
        }
        greeting.setCreatedAt(LocalDateTime.now());
        return this.greetingMapper.insertGreeting(greeting) > 0
                ? WriteResult.SUCCESS
                : WriteResult.FAILURE;
    }
}
