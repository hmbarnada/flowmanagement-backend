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
@Table(name = "conversion_parameter")
public class ConversionParameter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name")
    private String name;
	
	@ManyToOne
	@JoinColumn(name = "id_conversion_type", nullable = false, foreignKey = @ForeignKey(name = "FK_conversion_parameter_conversion_type"))
	private ConversionType ConversionType;

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

	public ConversionType getConversionType() {
		return ConversionType;
	}

	public void setConversionType(ConversionType conversionType) {
		ConversionType = conversionType;
	}

}
