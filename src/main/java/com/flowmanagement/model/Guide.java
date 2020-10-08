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
@Table(name = "guide")
public class Guide {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name")
    private String name;
	
	@Column(name = "label")
	private String label;
	
	@Column(name = "mainStepId")
	private String mainStepId;
  
	
	@ManyToOne
	@JoinColumn(name = "id_step", nullable = false, foreignKey = @ForeignKey(name = "FK_guide_step"))
	private Step step;
	
	@ManyToOne
	@JoinColumn(name = "id_operation", nullable = false, foreignKey = @ForeignKey(name = "FK_guide_operation"))
	private Operation operation;
    
	public Integer getGuideId() {
		return id;
	}
	public void setGuideId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getMainStepId() {
		return mainStepId;
	}
	public void setMainStepId(String mainStepId) {
		this.mainStepId = mainStepId;
	}
	public Step getStep() {
		return step;
	}
	public void setStep(Step step) {
		this.step = step;
	}
	public Operation getOperation() {
		return operation;
	}
	public void setOperation(Operation operation) {
		this.operation = operation;
	}
}
