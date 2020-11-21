package br.com.cielo.survey.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Survey {
	
	private BigInteger id;
	private String details;
	private Owner owner;
	private Calendar initDate;
	private Calendar endDate;
	private List<Question> questions;
	
	
	public BigInteger getId() {
		return id;
	}
	
	public void setId(BigInteger id) {
		this.id = id;
	}
	
	public String getDetails() {
		return details;
	}
	
	public void setDetails(String details) {
		this.details = details;
	}
	
	public Owner getOwner() {
		return owner;
	}
	
	public void setOwner(Owner owner) {
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
	
	public List<Question> getQuestions() {
		if (questions == null) {
			return new ArrayList<Question>();
		}
		return questions;
	}
	
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
		

}
