package com.rest4hub;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.joda.JodaModule;

public class JsonUtil {

    public static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        mapper.registerModule(new JodaModule());
    }

    public static ObjectMapper getJsonMapper() {
        return mapper;
    }

    public static String toString(Object value) {
        try {
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(value);
        } catch (JsonProcessingException ex) {
            throw new RuntimeException(ex);
        }
    }

}
