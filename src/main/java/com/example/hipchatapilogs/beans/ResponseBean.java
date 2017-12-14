package com.example.hipchatapilogs.beans;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseBean {
	private String color;
	private String message;
	private String notify;
	private String message_format;
}
