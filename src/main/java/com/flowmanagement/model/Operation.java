package com.flowmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "operation")
public class Operation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "label")
	private String label;

	@Column(name = "visible")
    private Boolean visible;
	
	@Column(name = "preExecute")
    private Boolean preExecute;
	
	@Column(name = "comment")
	private String comment;
	
	@Column(name = "commentAtEndExecution")
	private String commentAtEndExecution;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "automatic")
    private Boolean automatic;
	
	@Column(name = "pauseExecution")
    private Boolean pauseExecution;
	
	@Column(name = "operationOrder")
    private Integer operationOrder;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Boolean getVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	public Boolean getPreExecute() {
		return preExecute;
	}

	public void setPreExecute(Boolean preExecute) {
		this.preExecute = preExecute;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCommentAtEndExecution() {
		return commentAtEndExecution;
	}

	public void setCommentAtEndExecution(String commentAtEndExecution) {
		this.commentAtEndExecution = commentAtEndExecution;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getAutomatic() {
		return automatic;
	}

	public void setAutomatic(Boolean automatic) {
		this.automatic = automatic;
	}

	public Boolean getPauseExecution() {
		return pauseExecution;
	}

	public void setPauseExecution(Boolean pauseExecution) {
		this.pauseExecution = pauseExecution;
	}

	public Integer getOperationOrder() {
		return operationOrder;
	}

	public void setOperationOrder(Integer operationOrder) {
		this.operationOrder = operationOrder;
	}
}
