package com.andres.curso.springboot.app.springboot_crud.security;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class SimpleGrantedAutorityJsonCreator {

    @JsonCreator
    public SimpleGrantedAutorityJsonCreator(@JsonProperty("authority") String roles){

    }

}
