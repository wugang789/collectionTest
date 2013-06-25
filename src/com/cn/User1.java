package com.cn;

public class User1 implements Comparable<User1>{
	/**
	 * id
	 */
private int id;
/**
 * ĞÕÃû
 */
private String name;
public User1(int id, String name) {
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
public User1() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "User1 [id=" + id + ", name=" + name + "]";
}
public int compareTo(User1 o) {
	if(id>o.id){
	return 1;	
	}if(id<o.id){
		return -1;
	}
	if(id==o.id){
		if(name==o.name){
			return 0;
		}else{
			return 1;
		}
	}
	return 0;
}

}
