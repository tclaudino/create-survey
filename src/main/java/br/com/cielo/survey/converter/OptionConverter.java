package br.com.cielo.survey.converter;

import java.io.IOException;
import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.cielo.survey.entity.OptionEntity;

public class OptionConverter implements DynamoDBTypeConverter<String, List<OptionEntity>> {

	@Override
	public String convert(List<OptionEntity> object) {
		ObjectMapper objectMapper = new ObjectMapper();
        try {
            String objectsString = objectMapper.writeValueAsString(object);
            return objectsString;
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
	}

	@Override
	public List<OptionEntity> unconvert(String object) {
		ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<OptionEntity> objects = objectMapper.readValue(object, new TypeReference<List<Object>>(){});
            return objects;
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        } 
	}
	
}
