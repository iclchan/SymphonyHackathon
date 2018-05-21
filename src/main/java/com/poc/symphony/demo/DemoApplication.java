package com.poc.symphony.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.symphonyoss.client.SymphonyClient;
import org.symphonyoss.client.SymphonyClientConfig;
import org.symphonyoss.client.SymphonyClientFactory;

import static org.symphonyoss.client.SymphonyClientConfigID.*;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

  @Autowired
  SymphonyStarter symphonyStarter;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

  @Override
  public void run(String... args) {
    SymphonyClient symphonyClient = symphonyStarter.getClient();
    System.out.println("BOT NAME IS: " + symphonyClient.getLocalUser().getDisplayName());
  }
}
