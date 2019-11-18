package com.java.example;

public class Shared {

	public synchronized void method(Shared s2) {
		
		Thread t= Thread.currentThread();
		System.out.println(t.getName()+"is executing methodOne...");
		 
        System.out.println(t.getName()+"is calling methodTwo...");
		s2.method(this);
		  System.out.println(t.getName()+"is finished executing methodOne...");
	}

	public synchronized void methodsecond(Shared s1) {
		Thread t1= Thread.currentThread();
		System.out.println(t1.getName()+"is executing methodOne...");
		 
        System.out.println(t1.getName()+"is calling methodTwo...");
        s1.methodsecond(this);
        System.out.println(t1.getName()+"is finished executing methodOne...");
	}

}
