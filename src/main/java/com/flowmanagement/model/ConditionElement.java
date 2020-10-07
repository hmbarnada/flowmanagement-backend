package com.flowmanagement.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ConditionElement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "field")
    private String field;
	
	@Column(name = "fieldType")
	private String fieldType;
	
	@Column(name = "operator")
	private String operator;
	
	@Column(name = "value")
	private String value;
	
	@Column(name = "evaluated")
	private Boolean evaluated;
	
	@Column(name = "resultEvaluation")
	private Boolean resultEvaluation;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getFieldType() {
		return fieldType;
	}
	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Boolean getEvaluated() {
		return evaluated;
	}
	public void setEvaluated(Boolean evaluated) {
		this.evaluated = evaluated;
	}
	public Boolean getResultEvaluation() {
		return resultEvaluation;
	}
	public void setResultEvaluation(Boolean resultEvaluation) {
		this.resultEvaluation = resultEvaluation;
	}
}
