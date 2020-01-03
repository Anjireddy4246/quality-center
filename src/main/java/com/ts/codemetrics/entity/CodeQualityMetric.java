package com.ts.codemetrics.entity;
// Generated 3 Jan, 2020 1:55:17 PM by Hibernate Tools 5.1.10.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CodeQualityMetric generated by hbm2java
 */
@Entity
@Table(name = "CodeQualityMetric")
public class CodeQualityMetric implements java.io.Serializable {

	private Long id;
	private JobMetric jobMetric;
	private Integer complexity;
	private Integer cognitiveComplexity;
	private Integer violations;
	private Integer newViolations;
	private Integer openIssues;
	private Integer codeSmells;
	private Integer newCodeSmells;
	private String maintainabilityRating;
	private BigDecimal technicalDebt;
	private BigDecimal newTechnicalDebt;
	private BigDecimal technicalDebtRatio;
	private Integer newTechnicalDebtRatio;
	private String qualityGatewayStatus;
	private Integer bugs;
	private Integer newBugs;
	private String reliabilityRating;
	private Integer vulnerabilities;
	private Integer newVulnerabilities;
	private String securityRating;
	private Long linesofCode;
	private BigDecimal codeCoverage;
	private BigDecimal newCodeCoverage;
	private Integer noofUnitTest;
	private Integer noofUnitTestsFailed;
	private Integer noofUnitTestsPassed;
	private BigDecimal unitTestSuccessDensity;
	private Date createdDate;

	public CodeQualityMetric() {
	}

	public CodeQualityMetric(JobMetric jobMetric, Integer complexity, Integer cognitiveComplexity, Integer violations,
			Integer newViolations, Integer openIssues, Integer codeSmells, Integer newCodeSmells,
			String maintainabilityRating, BigDecimal technicalDebt, BigDecimal newTechnicalDebt,
			BigDecimal technicalDebtRatio, Integer newTechnicalDebtRatio, String qualityGatewayStatus, Integer bugs,
			Integer newBugs, String reliabilityRating, Integer vulnerabilities, Integer newVulnerabilities,
			String securityRating, Long linesofCode, BigDecimal codeCoverage, BigDecimal newCodeCoverage,
			Integer noofUnitTest, Integer noofUnitTestsFailed, Integer noofUnitTestsPassed,
			BigDecimal unitTestSuccessDensity, Date createdDate) {
		this.jobMetric = jobMetric;
		this.complexity = complexity;
		this.cognitiveComplexity = cognitiveComplexity;
		this.violations = violations;
		this.newViolations = newViolations;
		this.openIssues = openIssues;
		this.codeSmells = codeSmells;
		this.newCodeSmells = newCodeSmells;
		this.maintainabilityRating = maintainabilityRating;
		this.technicalDebt = technicalDebt;
		this.newTechnicalDebt = newTechnicalDebt;
		this.technicalDebtRatio = technicalDebtRatio;
		this.newTechnicalDebtRatio = newTechnicalDebtRatio;
		this.qualityGatewayStatus = qualityGatewayStatus;
		this.bugs = bugs;
		this.newBugs = newBugs;
		this.reliabilityRating = reliabilityRating;
		this.vulnerabilities = vulnerabilities;
		this.newVulnerabilities = newVulnerabilities;
		this.securityRating = securityRating;
		this.linesofCode = linesofCode;
		this.codeCoverage = codeCoverage;
		this.newCodeCoverage = newCodeCoverage;
		this.noofUnitTest = noofUnitTest;
		this.noofUnitTestsFailed = noofUnitTestsFailed;
		this.noofUnitTestsPassed = noofUnitTestsPassed;
		this.unitTestSuccessDensity = unitTestSuccessDensity;
		this.createdDate = createdDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "JobMetricId")
	public JobMetric getJobMetric() {
		return this.jobMetric;
	}

	public void setJobMetric(JobMetric jobMetric) {
		this.jobMetric = jobMetric;
	}

	@Column(name = "Complexity")
	public Integer getComplexity() {
		return this.complexity;
	}

	public void setComplexity(Integer complexity) {
		this.complexity = complexity;
	}

	@Column(name = "CognitiveComplexity")
	public Integer getCognitiveComplexity() {
		return this.cognitiveComplexity;
	}

	public void setCognitiveComplexity(Integer cognitiveComplexity) {
		this.cognitiveComplexity = cognitiveComplexity;
	}

	@Column(name = "Violations")
	public Integer getViolations() {
		return this.violations;
	}

	public void setViolations(Integer violations) {
		this.violations = violations;
	}

	@Column(name = "NewViolations")
	public Integer getNewViolations() {
		return this.newViolations;
	}

	public void setNewViolations(Integer newViolations) {
		this.newViolations = newViolations;
	}

	@Column(name = "OpenIssues")
	public Integer getOpenIssues() {
		return this.openIssues;
	}

	public void setOpenIssues(Integer openIssues) {
		this.openIssues = openIssues;
	}

	@Column(name = "CodeSmells")
	public Integer getCodeSmells() {
		return this.codeSmells;
	}

	public void setCodeSmells(Integer codeSmells) {
		this.codeSmells = codeSmells;
	}

	@Column(name = "NewCodeSmells")
	public Integer getNewCodeSmells() {
		return this.newCodeSmells;
	}

	public void setNewCodeSmells(Integer newCodeSmells) {
		this.newCodeSmells = newCodeSmells;
	}

	@Column(name = "MaintainabilityRating", length = 5)
	public String getMaintainabilityRating() {
		return this.maintainabilityRating;
	}

	public void setMaintainabilityRating(String maintainabilityRating) {
		this.maintainabilityRating = maintainabilityRating;
	}

	@Column(name = "TechnicalDebt", precision = 10)
	public BigDecimal getTechnicalDebt() {
		return this.technicalDebt;
	}

	public void setTechnicalDebt(BigDecimal technicalDebt) {
		this.technicalDebt = technicalDebt;
	}

	@Column(name = "NewTechnicalDebt", precision = 10)
	public BigDecimal getNewTechnicalDebt() {
		return this.newTechnicalDebt;
	}

	public void setNewTechnicalDebt(BigDecimal newTechnicalDebt) {
		this.newTechnicalDebt = newTechnicalDebt;
	}

	@Column(name = "TechnicalDebtRatio", precision = 10)
	public BigDecimal getTechnicalDebtRatio() {
		return this.technicalDebtRatio;
	}

	public void setTechnicalDebtRatio(BigDecimal technicalDebtRatio) {
		this.technicalDebtRatio = technicalDebtRatio;
	}

	@Column(name = "NewTechnicalDebtRatio")
	public Integer getNewTechnicalDebtRatio() {
		return this.newTechnicalDebtRatio;
	}

	public void setNewTechnicalDebtRatio(Integer newTechnicalDebtRatio) {
		this.newTechnicalDebtRatio = newTechnicalDebtRatio;
	}

	@Column(name = "QualityGatewayStatus", length = 45)
	public String getQualityGatewayStatus() {
		return this.qualityGatewayStatus;
	}

	public void setQualityGatewayStatus(String qualityGatewayStatus) {
		this.qualityGatewayStatus = qualityGatewayStatus;
	}

	@Column(name = "Bugs")
	public Integer getBugs() {
		return this.bugs;
	}

	public void setBugs(Integer bugs) {
		this.bugs = bugs;
	}

	@Column(name = "NewBugs")
	public Integer getNewBugs() {
		return this.newBugs;
	}

	public void setNewBugs(Integer newBugs) {
		this.newBugs = newBugs;
	}

	@Column(name = "ReliabilityRating", length = 5)
	public String getReliabilityRating() {
		return this.reliabilityRating;
	}

	public void setReliabilityRating(String reliabilityRating) {
		this.reliabilityRating = reliabilityRating;
	}

	@Column(name = "Vulnerabilities")
	public Integer getVulnerabilities() {
		return this.vulnerabilities;
	}

	public void setVulnerabilities(Integer vulnerabilities) {
		this.vulnerabilities = vulnerabilities;
	}

	@Column(name = "NewVulnerabilities")
	public Integer getNewVulnerabilities() {
		return this.newVulnerabilities;
	}

	public void setNewVulnerabilities(Integer newVulnerabilities) {
		this.newVulnerabilities = newVulnerabilities;
	}

	@Column(name = "SecurityRating", length = 5)
	public String getSecurityRating() {
		return this.securityRating;
	}

	public void setSecurityRating(String securityRating) {
		this.securityRating = securityRating;
	}

	@Column(name = "LinesofCode")
	public Long getLinesofCode() {
		return this.linesofCode;
	}

	public void setLinesofCode(Long linesofCode) {
		this.linesofCode = linesofCode;
	}

	@Column(name = "CodeCoverage", precision = 10)
	public BigDecimal getCodeCoverage() {
		return this.codeCoverage;
	}

	public void setCodeCoverage(BigDecimal codeCoverage) {
		this.codeCoverage = codeCoverage;
	}

	@Column(name = "NewCodeCoverage", precision = 10)
	public BigDecimal getNewCodeCoverage() {
		return this.newCodeCoverage;
	}

	public void setNewCodeCoverage(BigDecimal newCodeCoverage) {
		this.newCodeCoverage = newCodeCoverage;
	}

	@Column(name = "NoofUnitTest")
	public Integer getNoofUnitTest() {
		return this.noofUnitTest;
	}

	public void setNoofUnitTest(Integer noofUnitTest) {
		this.noofUnitTest = noofUnitTest;
	}

	@Column(name = "NoofUnitTestsFailed")
	public Integer getNoofUnitTestsFailed() {
		return this.noofUnitTestsFailed;
	}

	public void setNoofUnitTestsFailed(Integer noofUnitTestsFailed) {
		this.noofUnitTestsFailed = noofUnitTestsFailed;
	}

	@Column(name = "NoofUnitTestsPassed")
	public Integer getNoofUnitTestsPassed() {
		return this.noofUnitTestsPassed;
	}

	public void setNoofUnitTestsPassed(Integer noofUnitTestsPassed) {
		this.noofUnitTestsPassed = noofUnitTestsPassed;
	}

	@Column(name = "UnitTestSuccessDensity", precision = 10)
	public BigDecimal getUnitTestSuccessDensity() {
		return this.unitTestSuccessDensity;
	}

	public void setUnitTestSuccessDensity(BigDecimal unitTestSuccessDensity) {
		this.unitTestSuccessDensity = unitTestSuccessDensity;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreatedDate", length = 19)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}