package com.poc.symphony.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.symphonyoss.client.SymphonyClient;
import org.symphonyoss.client.SymphonyClientConfig;
import org.symphonyoss.client.SymphonyClientFactory;

import static org.symphonyoss.client.SymphonyClientConfigID.*;

@Component
public class SymphonyStarter {

  @Value("${symphony.sessionauth_url}")
  private String sessionAuthUrl;
  @Value("${symphony.keyauth_url}")
  private String keyAuthUrl;
  @Value("${symphony.agent_url}")
  private String agent_url;
  @Value("${symphony.pod_url}")
  private String pod_url;
  @Value("${symphony.truststore_file}")
  private String truststore_file;

  @Value("${symphony.truststore_password}")
  private String truststore_password;

  @Value("${symphony.user_cert_file}")
  private String user_cert_file;

  @Value("${symphony.user_cert_password}")
  private String user_cert_password;

  @Value("${symphony.user_email}")
  private String user_email;

  @Value("${symphony.receiver_email}")
  private String receiver_email;

  public SymphonyClient getClient() {
    SymphonyClientConfig symphonyClientConfig = new SymphonyClientConfig();
    symphonyClientConfig.set(SESSIONAUTH_URL, sessionAuthUrl);
    symphonyClientConfig.set(KEYAUTH_URL, keyAuthUrl);
    symphonyClientConfig.set(AGENT_URL, agent_url);
    symphonyClientConfig.set(POD_URL, pod_url);
    symphonyClientConfig.set(TRUSTSTORE_FILE, truststore_file);
    symphonyClientConfig.set(TRUSTSTORE_PASSWORD, truststore_password);
    symphonyClientConfig.set(USER_CERT_FILE, user_cert_file);
    symphonyClientConfig.set(USER_CERT_PASSWORD, user_cert_password);
    symphonyClientConfig.set(USER_EMAIL, user_email);
    symphonyClientConfig.set(RECEIVER_EMAIL, receiver_email);

    SymphonyClient symClient = SymphonyClientFactory.getClient(
        SymphonyClientFactory.TYPE.V4, symphonyClientConfig);
    return symClient;
  }
}
