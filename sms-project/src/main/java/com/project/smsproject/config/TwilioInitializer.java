package com.project.smsproject.config;

import com.twilio.Twilio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;



/**
 * @author RizaAdrian
 */
@Configuration
public class TwilioInitializer {

	private final static Logger LOGGER = LoggerFactory.getLogger(TwilioInitializer.class);

	private final TwilioConfiguration twilioConfiguration;

	public TwilioInitializer(TwilioConfiguration twilioConfiguration) {

		this.twilioConfiguration = twilioConfiguration;
		Twilio.init(
				twilioConfiguration.getAccountSid(),
				twilioConfiguration.getAuthToken()
		);
		LOGGER.info("Starting to initialize Twilio with account sid{}...",twilioConfiguration.getAccountSid());
	}
}
