package br.com.cielo.survey.entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "survey")
public class SurveyEntity {
	
	@DynamoDBHashKey
	@DynamoDBAutoGeneratedKey
	private String uuid;
	
	private String details;
    
	private OwnerEntity owner;
    
	private Calendar initDate;
    
    private Calendar endDate;
	
    private String label;
    
	private List<OptionEntity> options;


	public String getUuid() {
		return uuid;
	}


	public void setUuid(String uuid) {
		this.uuid = uuid;
	}


	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}


	public OwnerEntity getOwner() {
		return owner;
	}


	public void setOwner(OwnerEntity owner) {
		this.owner = owner;
	}


	public Calendar getInitDate() {
		return initDate;
	}


	public void setInitDate(Calendar initDate) {
		this.initDate = initDate;
	}


	public Calendar getEndDate() {
		return endDate;
	}


	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	public List<OptionEntity> getOptions() {
		if (options == null) {
			return new ArrayList<OptionEntity>();
		}
		
		return options;
	}


	public void setOptions(List<OptionEntity> options) {
		this.options = options;
	}
	
}
