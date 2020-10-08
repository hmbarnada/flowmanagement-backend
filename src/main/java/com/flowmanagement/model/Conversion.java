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
@Table(name = "conversion")
public class Conversion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "conditionn")
	private String condition;
	
	@Column(name = "source_unit")
	private String sourceUnit;
	
	@Column(name = "destination_unit")
	private String destinationUnit;
	
	@ManyToOne
	@JoinColumn(name = "id_conversion_type", nullable = false, foreignKey = @ForeignKey(name = "FK_conversion_conversion_type"))
	private ConversionType conversionType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getSourceUnit() {
		return sourceUnit;
	}

	public void setSourceUnit(String sourceUnit) {
		this.sourceUnit = sourceUnit;
	}

	public String getDestinationUnit() {
		return destinationUnit;
	}

	public void setDestinationUnit(String destinationUnit) {
		this.destinationUnit = destinationUnit;
	}

	public ConversionType getConversionType() {
		return conversionType;
	}

	public void setConversionType(ConversionType conversionType) {
		this.conversionType = conversionType;
	}
}
