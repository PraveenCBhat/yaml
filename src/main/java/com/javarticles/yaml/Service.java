package com.javarticles.yaml;

import java.util.List;

import com.google.common.base.MoreObjects;

public class Service {
    private String hostName;
    private String port;
    private List<Component> components;
    private List<List<String>> componentProperties;

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    public List<List<String>> getComponentProperties() {
        return componentProperties;
    }

    public void setComponentProperties(List<List<String>> componentProperties) {
        this.componentProperties = componentProperties;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("hostName", hostName + "\n").add("port", port + "\n")
                .add("Components", components + "\n")
                .add("componentProperties", componentProperties + "\n")
                .toString();
    }
}
