package com.javarticles.yaml;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.yaml.snakeyaml.Yaml;

import com.google.common.io.ByteStreams;

public class YamlLoadExample {
    
    public static void main(String[] args) throws IOException {
        YamlLoadExample loader = new YamlLoadExample();
        Service service = loader.loadConfig();
        System.out.println(service);
    }
    
    public Service loadConfig() throws IOException {
        URL url = getConfigURL();
        InputStream is = url.openConnection().getInputStream();
        return new Yaml().loadAs(
                new ByteArrayInputStream(ByteStreams.toByteArray(is))
                , Service.class);
    }

    private URL getConfigURL() throws IOException
    {
        URL url = getClass().getResource("config.yaml");
        url.openStream().close();
        return url;
    }
}
