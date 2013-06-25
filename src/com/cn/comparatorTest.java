package com.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class comparatorTest {
	public static void main(String[] args) {
		List ww=new ArrayList<user2>();
		user2 u1=new user2();
		u1.setId(1);
		u1.setName("Ð»Ð»1");
		user2 u=new user2();
		u.setId(4);
		u.setName("Ð°¶ñ");
		user2 u2=new user2();
		u2.setId(7);
		u2.setName("ÇáÇá");
		user2 u3=new user2();
		u3.setId(2);
		u3.setName("ww");
		u2.setName("ss");
		ww.add(u1);
		ww.add(u2);
		ww.add(u3);
		ww.add(u);
		//Arrays.sort(Êý×é, new user2());
		Collections.sort(ww, new user2());
		for (int i = 0; i < ww.size(); i++) {
			System.out.println(((user2)ww.get(i)).getId()+">>"+((user2)ww.get(i)).getName());
		}
		
	}

}
