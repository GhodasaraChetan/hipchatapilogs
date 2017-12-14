package com.example.hipchatapilogs.beans;

import lombok.Data;

@Data
public class FromBean {
	private int id;
	private LinksBean links;
	private String mention_name;
	private String name;
	private String version;
}
