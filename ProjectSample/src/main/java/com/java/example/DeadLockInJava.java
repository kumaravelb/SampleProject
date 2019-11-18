package com.java.example;

public class DeadLockInJava {

	public static void main(String[] args) {

		final Shared s1= new Shared();
		final Shared s2= new Shared();
		
		Thread t1= new Thread(){
			public void run() {
				s1.method(s2);
			}
		};
		
		Thread t2= new Thread() {
			public void run() {
				s2.methodsecond(s1);
			}
		};
		t1.start();
		t2.start();
	}

}
