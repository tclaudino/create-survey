package br.com.cielo.survey;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.cielo.survey.model.Survey;

/***
 * This class implements RequestHandler (AWS SDK) to handle the Lambda requests.
 * @author thiago
 */
public class CreateSurvey implements RequestHandler<Survey, Survey>{

	
	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	
	  @Override
	  public Survey handleRequest(Survey event, Context context)
	  {
		    LambdaLogger logger = context.getLogger();
		    // process event
		    logger.log("EVENT: " + gson.toJson(event));
		    logger.log("EVENT TYPE: " + event.getClass().toString());
		    return event;
	  }
}
