package com.escass.interfacetest.mappers;

import com.escass.interfacetest.entities.GreetingEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GreetingMapper {
    int insertGreeting(GreetingEntity greet);
}
