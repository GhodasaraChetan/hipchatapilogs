package com.example.hipchatapilogs.beans;

import lombok.Data;

@Data
public class MessageBean {
	private String date;
	private FileBean file;
	private FromBean from;
	private String id;
	private MentionsBean[] mentions;
	private String message;
	//	private MessageLinksBean[] message_links;
	private String type;
}
