package br.com.cielo.survey.converter;

import java.io.IOException;
import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.cielo.survey.entity.OwnerEntity;

public class OwnerConverter implements DynamoDBTypeConverter<String, OwnerEntity> {

	@Override
	public String convert(OwnerEntity object) {
		ObjectMapper objectMapper = new ObjectMapper();
        try {
            String objectsString = objectMapper.writeValueAsString(object);
            return objectsString;
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
	}

	@Override
	public OwnerEntity unconvert(String object) {
		ObjectMapper objectMapper = new ObjectMapper();
        try {
        	OwnerEntity ownerObject = objectMapper.readValue(object, new TypeReference<List<Object>>(){});
            return ownerObject;
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        } 
	}

}
