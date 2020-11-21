package com.thoughtworks.capability.gtb.demospringconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class DemoSpringConfigApplication implements ApplicationRunner {

	@Autowired
	private MailConfig mailConfig;

	@Autowired
	private AdditionalHeaders additionalHeaders;

	@Autowired
	private DefaultRecipients defaultRecipients;


	public static void main(String[] args) {
		SpringApplication.run(DemoSpringConfigApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(mailConfig);
		System.out.println(defaultRecipients);
		System.out.println(additionalHeaders);
	}
}
