package com.virtusa.css.dto;

import java.time.LocalDateTime;

public class ErrorInfo {
	private LocalDateTime timestamp;
	private String message;
	private String url;
	public ErrorInfo() {
		super();
	}
	public ErrorInfo(LocalDateTime timestamp, String message, String url) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.url = url;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "ErrorInfo [timestamp=" + timestamp + ", message=" + message + ", url=" + url + "]";
	}
	
}
