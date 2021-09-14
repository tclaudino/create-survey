package br.com.cielo.survey;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.cielo.survey.entity.SurveyEntity;

/***
 * This class implements RequestHandler (AWS SDK) to handle the Lambda requests.
 * @author thiago
 */
public class CreateSurvey implements RequestHandler<SurveyEntity, SurveyEntity>{

	
	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	public String password = "y8JK3!#lzM9*wzEwEWMnds=";
	
	  @Override
	  public SurveyEntity handleRequest(SurveyEntity survey, Context context)
	  {
		    LambdaLogger logger = context.getLogger();
		    
		    AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();
		    
		    DynamoDBMapper mapper = new DynamoDBMapper(client);
		    
		    mapper.save(survey);
		    
		    logger.log("EVENT: " + gson.toJson(survey));
		  
		    logger.log("Password: " + password);
		    
		    return survey;
	  }
}
