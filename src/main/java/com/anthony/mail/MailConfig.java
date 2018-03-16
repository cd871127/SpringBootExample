package com.anthony.mail;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "mail.server")
public class MailConfig {
    private String username;
    private String password;
    private String debug;
    private String auth;
    private String protocol;
    private String server;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDebug() {
        return debug;
    }

    public String getAuth() {
        return auth;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getServer() {
        return server;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDebug(String debug) {
        this.debug = debug;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public void setServer(String server) {
        this.server = server;
    }

    @Override
    public String toString() {
        return "MailConfig{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", debug='" + debug + '\'' +
                ", auth='" + auth + '\'' +
                ", protocol='" + protocol + '\'' +
                ", server='" + server + '\'' +
                '}';
    }
}
