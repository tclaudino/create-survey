package br.com.cielo.survey.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class QuestionEntity {
	
	private BigInteger id;
	private String label;
	private List<OptionEntity> options;
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
	public List<OptionEntity> getOptions() {
		if(options == null) {
			return new ArrayList<OptionEntity>();
		}
		return options;
	}
	public void setOptions(List<OptionEntity> options) {
		this.options = options;
	}
	
}
