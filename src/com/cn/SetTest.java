package com.cn;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
//		Set set=new HashSet();
//		set.add("ss");
//		set.add("ss");
//		set.add(12);
//		set.add(122);
//		set.add(1222);
//		set.add(12222);
//		user u=new user();
//		u.setId(1);
//		u.setName("Îâ¸Õ");
//		user u1=new user();
//		u1.setId(1);
//		u1.setName("Îâ¸Õ");
//		set.add(u1);
//		set.add(u);
//   System.out.println(set.size());
//   Iterator it=set.iterator();
//   while(it.hasNext()){
//  Object ob=it.next();
//  System.out.println(ob.toString());
//   }
//   Set linked=new LinkedHashSet();
//   linked.add("ss");
//   linked.add("ss");
//   linked.add(12);
//   linked.add(122);
//   linked.add(1222);
//   linked.add(12222);
//   Iterator its=linked.iterator();
//   while (its.hasNext()) {
//	Object ob=its.next();
//	System.out.println(ob.toString());
//	
//}
     Set treeset=new TreeSet();
     treeset.add(1);
     treeset.add(2);
     treeset.add(3);
     treeset.add(0);
     user u=new user();
     u.setId(2);
     u.setName("sssssss");
     user u1=new user();
     u.setId(3);
     user u2=new user();
     u.setId(7);
     Iterator it=treeset.iterator();
     while (it.hasNext()) {
		Object object = (Object) it.next();
		System.out.println(object.toString());
		
	}
	}
  
}
