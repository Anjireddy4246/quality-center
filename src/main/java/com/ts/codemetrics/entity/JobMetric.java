package com.ts.codemetrics.entity;
// Generated 3 Jan, 2020 1:55:17 PM by Hibernate Tools 5.1.10.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * JobMetric generated by hbm2java
 */
@Entity
@Table(name = "JobMetric")
public class JobMetric implements java.io.Serializable {

	private Long id;
	private Account account;
	private String jobName;
	private String projectName;
	private String branchName;
	private String buildNumber;
	private String commitId;
	private String cqTaskId;
	private String cqAnalysisId;
	private String cqStatusUrl;
	private String jobStatus;
	private Date runDate;
	private Date jobStartedAt;
	private Date jobEndedAt;
	private String changedFiles;
	private String userName;
	private String userEmailId;
	private Set<CodeQualityMetric> codeQualityMetrics = new HashSet<CodeQualityMetric>(0);

	public JobMetric() {
	}

	public JobMetric(Account account, String jobName, String projectName, String branchName, String buildNumber,
					 String commitId, String cqTaskId, String cqAnalysisId, String cqStatusUrl, String jobStatus, Date runDate,
					 Date jobStartedAt, Date jobEndedAt, String changedFiles, String userName, String userEmailId,
					 Set<CodeQualityMetric> codeQualityMetrics) {
		this.account = account;
		this.jobName = jobName;
		this.projectName = projectName;
		this.branchName = branchName;
		this.buildNumber = buildNumber;
		this.commitId = commitId;
		this.cqTaskId = cqTaskId;
		this.cqAnalysisId = cqAnalysisId;
		this.cqStatusUrl = cqStatusUrl;
		this.jobStatus = jobStatus;
		this.runDate = runDate;
		this.jobStartedAt = jobStartedAt;
		this.jobEndedAt = jobEndedAt;
		this.changedFiles = changedFiles;
		this.userName = userName;
		this.userEmailId = userEmailId;
		this.codeQualityMetrics = codeQualityMetrics;
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
	@JoinColumn(name = "AccountId")
	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Column(name = "JobName", length = 500)
	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	@Column(name = "ProjectName", length = 100)
	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Column(name = "BranchName", length = 100)
	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Column(name = "BuildNumber", length = 100)
	public String getBuildNumber() {
		return this.buildNumber;
	}

	public void setBuildNumber(String buildNumber) {
		this.buildNumber = buildNumber;
	}

	@Column(name = "CommitId", length = 500)
	public String getCommitId() {
		return this.commitId;
	}

	public void setCommitId(String commitId) {
		this.commitId = commitId;
	}

	@Column(name = "CqTaskId", length = 100)
	public String getCqTaskId() {
		return this.cqTaskId;
	}

	public void setCqTaskId(String cqTaskId) {
		this.cqTaskId = cqTaskId;
	}

	@Column(name = "CqAnalysisId", length = 100)
	public String getCqAnalysisId() {
		return this.cqAnalysisId;
	}

	public void setCqAnalysisId(String cqAnalysisId) {
		this.cqAnalysisId = cqAnalysisId;
	}

	@Column(name = "CqStatusUrl", length = 1000)
	public String getCqStatusUrl() {
		return this.cqStatusUrl;
	}

	public void setCqStatusUrl(String cqStatusUrl) {
		this.cqStatusUrl = cqStatusUrl;
	}

	@Column(name = "JobStatus", length = 45)
	public String getJobStatus() {
		return this.jobStatus;
	}

	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RunDate", length = 19)
	public Date getRunDate() {
		return this.runDate;
	}

	public void setRunDate(Date runDate) {
		this.runDate = runDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "JobStartedAt", length = 19)
	public Date getJobStartedAt() {
		return this.jobStartedAt;
	}

	public void setJobStartedAt(Date jobStartedAt) {
		this.jobStartedAt = jobStartedAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "JobEndedAt", length = 19)
	public Date getJobEndedAt() {
		return this.jobEndedAt;
	}

	public void setJobEndedAt(Date jobEndedAt) {
		this.jobEndedAt = jobEndedAt;
	}

	@Column(name = "ChangedFiles", length = 5000)
	public String getChangedFiles() {
		return this.changedFiles;
	}

	public void setChangedFiles(String changedFiles) {
		this.changedFiles = changedFiles;
	}

	@Column(name = "UserName", length = 100)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "UserEmailId", length = 500)
	public String getUserEmailId() {
		return this.userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "jobMetric")
	public Set<CodeQualityMetric> getCodeQualityMetrics() {
		return this.codeQualityMetrics;
	}

	public void setCodeQualityMetrics(Set<CodeQualityMetric> codeQualityMetrics) {
		this.codeQualityMetrics = codeQualityMetrics;
	}

}
