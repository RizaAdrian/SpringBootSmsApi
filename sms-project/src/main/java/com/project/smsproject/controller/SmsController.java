package com.project.smsproject.controller;

import com.project.smsproject.service.SmsRequest;
import com.project.smsproject.service.SmsSenderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author RizaAdrian
 */
@RestController
@RequestMapping("/api/v1/sms")
@AllArgsConstructor
public class SmsController {

	private final SmsSenderService smsSenderService;

	@PostMapping
	public void smsSender(@Valid @RequestBody SmsRequest smsRequest){
		smsSenderService.sendSms(smsRequest);
	}
}
