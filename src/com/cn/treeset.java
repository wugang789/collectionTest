package com.cn;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		Set tree=new TreeSet<User1>();
		tree.add(new User1(4,"Ц��22222"));
		tree.add(new User1(0,"Ц��"));
		tree.add(new User1(0,"Ц��2"));
		tree.add(new User1(9,"Ц��24"));
		tree.add(new User1(3,"Ц��2"));
		Iterator it=tree.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object.toString());
			
		}
		
	}
}
