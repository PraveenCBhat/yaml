package com.javarticles.yaml;

import java.util.Map;

import com.google.common.base.MoreObjects;

public class Component {
    private String name;
    private String logDir;
    private String logFile;
    private Map<String, String> componentProperties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogDir() {
        return logDir;
    }

    public void setLogDir(String logDir) {
        this.logDir = logDir;
    }

    public String getLogFile() {
        return logFile;
    }

    public void setLogFile(String logFile) {
        this.logFile = logFile;
    }

    public Map<String, String> getComponentProperties() {
        return componentProperties;
    }

    public void setComponentProperties(Map<String, String> componentProperties) {
        this.componentProperties = componentProperties;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("name", name + "\n")
                .add("logDir", logDir + "\n").add("logFile", logFile + "\n")
                .add("componentProperties", componentProperties + "\n")
                .toString();
    }
}
