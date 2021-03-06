package com.ts.codemetrics.entity;
// Generated 4 Feb, 2020 6:45:49 PM by Hibernate Tools 5.1.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Account generated by hbm2java
 */
@Entity
@Table(name = "Account")
public class Account implements java.io.Serializable {

	private Integer id;
	private String name;
	private String code;
	private String uuid;
	private Set<JobMetric> jobMetrics = new HashSet<JobMetric>(0);

	public Account() {
	}

	public Account(String name, String code, String uuid, Set<JobMetric> jobMetrics) {
		this.name = name;
		this.code = code;
		this.uuid = uuid;
		this.jobMetrics = jobMetrics;
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

	@Column(name = "Code", length = 50)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "UUID", length = 100)
	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	public Set<JobMetric> getJobMetrics() {
		return this.jobMetrics;
	}

	public void setJobMetrics(Set<JobMetric> jobMetrics) {
		this.jobMetrics = jobMetrics;
	}

}
