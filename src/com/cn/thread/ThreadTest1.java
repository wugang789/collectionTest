package com.cn.thread;

public class ThreadTest1 extends Thread{
	private int ticket = 100;
	private String name;
	public ThreadTest1(String name){
		this.name=name;
	}
//	public synchronized void run() {
//		  for(int i =0;i<500;i++){
//	            if(this.ticket>0){
//	                System.out.println(this.name+"ÂôÆ±---->"+(this.ticket--));
//	            }
//}
//	}
	public  void run() {
		  for(int i =0;i<500;i++){
	            if(this.ticket>0){
	                System.out.println(this.name+"ÂôÆ±---->"+(this.ticket--));
	            }
}
	}
}