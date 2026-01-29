package com.example;

import io.swagger.v3.oas.annotations.media.Schema;

public class AppInfo {

    @Schema(description = "Application name", example = "myapp")
    private String name;

    @Schema(description = "Version", example = "0.1.0")
    private String version;

    @Schema(description = "Description", example = "MyApp - CICD/Kubernetes sample project")
    private String description;

    public AppInfo() {
    }

    public AppInfo(String name, String version, String description) {
        this.name = name;
        this.version = version;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getDescription() {
        return description;
    }
}
