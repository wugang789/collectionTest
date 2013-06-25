package com.cn.thread;

public class Test {
public static void main(String[] args) {
	
	ThreadTest th=new ThreadTest("一会窗口") ;
	ThreadTest th1=new ThreadTest("二号窗口");
	ThreadTest th2=new ThreadTest("三号窗口");
	th.start();
	th1.start();
	th2.start();
}
}
