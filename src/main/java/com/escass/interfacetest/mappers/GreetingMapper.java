package com.escass.interfacetest.mappers;

import com.escass.interfacetest.entities.GreetingEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GreetingMapper {
    int insertGreeting(GreetingEntity greet);

    GreetingEntity selectGreetingByIndex(@Param("index") int index);
}
