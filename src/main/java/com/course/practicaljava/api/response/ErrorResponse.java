package com.course.practicaljava.api.response;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ErrorResponse {

	private String message;

	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime timestamp;

	public ErrorResponse() {

	}

	public ErrorResponse(String message, LocalDateTime localDateTime) {
		super();
		this.message = message;
		this.timestamp = localDateTime;
	}

	public String getMessage() {
		return message;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
}
