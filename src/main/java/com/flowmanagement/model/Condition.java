package com.flowmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "conditionn")
public class Condition {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "operationName")
    private String operationName;
	
	@Column(name = "stepId")
	private String stepId;
	
	@ManyToOne
	@JoinColumn(name = "id_condition_type", nullable = false, foreignKey = @ForeignKey(name = "FK_condition_type"))
	private ConditionType conditionType;
	
	//private ConditionElement conditionsEnableAlternative;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOperationName() {
		return operationName;
	}
	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}
	public String getStepId() {
		return stepId;
	}
	public void setStepId(String stepId) {
		this.stepId = stepId;
	}
	public ConditionType getConditionType() {
		return conditionType;
	}
	public void setConditionType(ConditionType conditionType) {
		this.conditionType = conditionType;
	}
//	public ConditionElement getConditionsEnableAlternative() {
//		return conditionsEnableAlternative;
//	}
//	public void setConditionsEnableAlternative(ConditionElement conditionsEnableAlternative) {
//		this.conditionsEnableAlternative = conditionsEnableAlternative;
//	}

}
