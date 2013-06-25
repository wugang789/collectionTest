package com.cn;
/**
 * 用户类
 * @author Administrator
 *
 */
public class user implements Comparable{
	
//@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		System.out.println(result);
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		System.out.println(id+">>>>>>>>>>>>>>.");
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		user other = (user) obj;
//		System.out.println("????????????///"+other.id);
//		if (id != other.id)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}
/**
 * 用户id
 */
	private int id;
	/**
	 * 用户密码
	 */
	private String name;
	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + "]";
	}
	public user(int id, String name) {
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
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int compareTo(Object o) {
		System.out.println(o);
		return 0;
	}
	
	
	
}
