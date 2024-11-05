package com.escass.interfacetest.mappers;

import com.escass.interfacetest.entities.greetingEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface greetingMapper {
    int insertGreeting(greetingEntity greet);

    greetingEntity selectGreetingByIndex(@Param("index") int index);
}
