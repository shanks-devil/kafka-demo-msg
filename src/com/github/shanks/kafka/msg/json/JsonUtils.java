package com.github.shanks.kafka.msg.json;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {

	public static String stringify(Object object) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.setSerializationInclusion(Include.NON_NULL);
			return mapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}

	public static <T> T parse(String json, Class<T> responseType) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(json, responseType);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
}
