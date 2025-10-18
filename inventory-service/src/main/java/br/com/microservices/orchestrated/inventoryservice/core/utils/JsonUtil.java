package br.com.microservices.orchestrated.inventoryservice.core.utils;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.microservices.orchestrated.inventoryservice.core.dto.Event;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class JsonUtil {
    
    private final ObjectMapper objectMapper;

    public JsonUtil(ObjectMapper objectMapper){
        this.objectMapper = objectMapper;
    }

    public String toJson(Object object){
        try{
            return objectMapper.writeValueAsString(object);
        } catch(Exception ex){
            return "";
        }
    }

    public Event toEvent(String json){
        try{
            return objectMapper.readValue(json, Event.class);
        } catch(Exception ex){
            return null;
        }
    }
}
