package com.ts.codemetrics.entity;
// Generated 4 Feb, 2020 6:45:49 PM by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Cqprovider generated by hbm2java
 */
@Entity
@Table(name = "CQProvider")
public class Cqprovider implements java.io.Serializable {

	private Integer id;
	private String name;
	private String description;
	private String url;

	public Cqprovider() {
	}

	public Cqprovider(String name, String description, String url) {
		this.name = name;
		this.description = description;
		this.url = url;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "Name", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "Description", length = 500)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "URL", length = 1000)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
