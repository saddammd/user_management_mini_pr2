package com.ashok.it.demo.user.management.properties;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app")
@EnableConfigurationProperties
public class AppProperties {

	public Map<String, String> messages;

	public Map<String, String> getGreetmessages() {
		return messages;
	}

	public void setmessages(Map<String, String> messages) {
		this.messages = messages;
	}
	
	
	
}
