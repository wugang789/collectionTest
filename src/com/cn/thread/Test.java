package com.cn.thread;

public class Test {
public static void main(String[] args) {
	
	ThreadTest th=new ThreadTest("һ�ᴰ��") ;
	ThreadTest th1=new ThreadTest("���Ŵ���");
	ThreadTest th2=new ThreadTest("���Ŵ���");
	th.start();
	th1.start();
	th2.start();
}
}
