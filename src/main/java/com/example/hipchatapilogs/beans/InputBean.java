package com.example.hipchatapilogs.beans;

import lombok.Data;

@Data
public class InputBean {

	private String event;

	private ItemBean item;

	private String oath_client_id;

	private int webhook_id;

}
