package com.ts.codemetrics.service.provider.cqprovider.sonarqube;

import lombok.Data;

@Data
public class SonarAnalysis {
    private String key;
    private String date;
    private String revision;
    private String projectVersion;
}
