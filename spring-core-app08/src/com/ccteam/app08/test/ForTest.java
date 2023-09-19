package com.ccteam.app08.test;

import com.ccteam.app08.threads.Thread1;
import com.ccteam.app08.threads.Thread2;
import com.ccteam.app08.util.A;

public class ForTest {

	public static void main(String[] args) {
		A obj=new A();
		Thread1 th1=new Thread1(obj);
		Thread2 th2=new Thread2(obj);
		th1.start();
		th2.start();
		
	}

}
