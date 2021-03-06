package br.com.cielo.survey.entity;

import java.math.BigInteger;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class OptionEntity {
	
	private BigInteger id;
	private String label;
	private BigInteger votes;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public BigInteger getVotes() {
		return votes;
	}
	public void setVotes(BigInteger votes) {
		this.votes = votes;
	}
	
}
