package com.flowmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "step")
public class Step {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "label")
	private String label;
	
	@Column(name = "text")
	private String text;
	
	//private Operation operation;
	//private Alternative alternative;
	//private Document referenceDoc;
	
	public Integer getStepId() {
		return id;
	}
	public void setStepId(Integer id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	/*public Operation getOperation() {
		return operation;
	}
	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	public Alternative getAlternative() {
		return alternative;
	}
	public void setAlternative(Alternative alternative) {
		this.alternative = alternative;
	}
	public Document getReferenceDoc() {
		return referenceDoc;
	}
	public void setReferenceDoc(Document referenceDoc) {
		this.referenceDoc = referenceDoc;
	}*/

}
