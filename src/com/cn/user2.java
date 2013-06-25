package com.cn;

import java.util.Comparator;

public class user2 implements Comparator<user2> {
	/**
	 * id
	 */
	 private int id;
	 /**
	  * ÓÃ»§Ãû
	  */
	 private String name;
	 
	public user2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public user2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "user2 [id=" + id + ", name=" + name + "]";
	}

	public int compare(user2 o1, user2 o2) {
		return ((user2)o2).getId()-((user2)o1).getId();
	}

}
