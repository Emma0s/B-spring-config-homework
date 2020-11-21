package com.thoughtworks.capability.gtb.demospringconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "mail")
public class DefaultRecipients {
    private List<String> defaultRecipients = new ArrayList<>();

    public List<String> getDefaultRecipients() {
        return defaultRecipients;
    }

    public void setDefaultRecipients(List<String> defaultRecipients) {
        this.defaultRecipients = defaultRecipients;
    }

    @Override
    public String toString() {
        return "DefaultRecipients{" +
                "defaultRecipients[0]='" + defaultRecipients.get(0) + '\'' +
                ", defaultRecipients[1]='" + defaultRecipients.get(1) + '\'' +
                '}';
    }
}
