package com.cn.thread;

public class ThreadTest extends Thread{
	private int ticket = 10;
	private String name;
	public ThreadTest(String name){
		this.name=name;
	}
	public void run() {
		synchronized (ThreadTest.class) {
			  for(int i =0;i<500;i++){
            if(this.ticket>0){
            //	ThreadTest.seek();
                System.out.println(this.name+"卖票---->"+(this.ticket--)+Thread.currentThread().getName());
            }
			  }
		}}
	public static  void seek(){
		synchronized (ThreadTest.class) {
			System.out.println("同步方法执行"+Thread.currentThread().getName());
		}
	}
}