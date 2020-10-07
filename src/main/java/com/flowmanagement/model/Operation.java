package com.flowmanagement.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
}
