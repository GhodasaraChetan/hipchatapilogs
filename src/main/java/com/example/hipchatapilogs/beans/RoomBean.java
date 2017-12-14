package com.example.hipchatapilogs.beans;

import lombok.Data;

@Data
public class RoomBean {
	private int id;
	private boolean is_archived;
	private RoomLinksBean links;
	private String name;
	private String privacy;
	private String version;
}
