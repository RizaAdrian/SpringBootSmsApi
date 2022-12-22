package com.project.smsproject.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author RizaAdrian
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
public class SmsRequest {
	@NotEmpty
	@JsonProperty("phoneNumber")
	private final String phoneNumber;
	@NotEmpty
	@JsonProperty("message")
	private String message;
}
