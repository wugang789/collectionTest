package com.cn;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		Set tree=new TreeSet<User1>();
		tree.add(new User1(4,"笑我22222"));
		tree.add(new User1(0,"笑我"));
		tree.add(new User1(0,"笑我2"));
		tree.add(new User1(9,"笑我24"));
		tree.add(new User1(3,"笑我2"));
		Iterator it=tree.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object.toString());
			
		}
		
	}
}
