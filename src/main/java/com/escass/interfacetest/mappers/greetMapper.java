package com.escass.interfacetest.mappers;

import com.escass.interfacetest.entities.greetEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface greetMapper {
    int insertGreet(greetEntity greet);

    greetEntity selectGreetByIndex(@Param("index") int index);
}
