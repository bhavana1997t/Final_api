package com.onebill.customizer.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class Products {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name="plroduct_id")
	private int productId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="product_description")
	private String productDescription;
	
	@ManyToOne
	@JoinColumn(name="company_id")
	private Company company;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "product", fetch = FetchType.EAGER)
	Set<Plans> plan;


	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Set<Plans> getPlan() {
		return plan;
	}

	public void setPlan(Set<Plans> plan) {
		this.plan = plan;
	}

	
}
