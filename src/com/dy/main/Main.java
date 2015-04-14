package com.dy.main;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtomicLong count = new AtomicLong(0);
		for (int i = 0; i < 20; i++) {
			System.out.println(count.incrementAndGet());
			System.getSecurityManager().getSecurityContext();
		}
	}

}
