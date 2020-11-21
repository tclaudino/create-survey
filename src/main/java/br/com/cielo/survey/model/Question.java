package br.com.cielo.survey.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Question {
	
	private BigInteger id;
	private String label;
	private List<Option> options;
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
	public List<Option> getOptions() {
		if(options == null) {
			return new ArrayList<Option>();
		}
		return options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	
}
