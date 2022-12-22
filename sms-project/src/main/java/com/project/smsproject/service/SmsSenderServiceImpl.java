package com.project.smsproject.service;

import com.project.smsproject.config.TwilioConfiguration;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author RizaAdrian
 */
@Service
@AllArgsConstructor
public class SmsSenderServiceImpl implements SmsSenderService{

	private final TwilioConfiguration twilioConfiguration;

	private final static Logger LOGGER = LoggerFactory.getLogger(SmsSenderServiceImpl.class);

	@Override
	public void sendSms(SmsRequest smsRequest) {
		if(isPhoneNumberValid(smsRequest.getPhoneNumber())) {
			PhoneNumber to = new PhoneNumber(smsRequest.getPhoneNumber());
			PhoneNumber from = new PhoneNumber(twilioConfiguration.getTrialNumber());
			String message = smsRequest.getMessage();
			MessageCreator messageCreator = Message.creator(to, from, message);
			messageCreator.create();
			LOGGER.info("Send sms {}" + smsRequest);
		}else{
			throw new IllegalArgumentException("Phone number [" + smsRequest.getPhoneNumber() +"] is not valid number.");
		}
	}
	private boolean isPhoneNumberValid(String phoneNumber) {

		return !StringUtils.isEmpty(phoneNumber);
	}
}
