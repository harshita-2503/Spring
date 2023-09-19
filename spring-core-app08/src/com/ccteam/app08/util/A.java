package com.ccteam.app08.util;

import com.ccteam.app08.threads.Thread1;
import com.ccteam.app08.threads.Thread2;

public class A {
	public void m1() {
		System.out.println("m1(): Thread1:ThreadLocalData:"+Thread1.threadLocal.get());
		System.out.println("m1(): Thread2:ThreadLocalData:"+Thread2.threadLocal.get());
		
	}
	public void m2() {
		System.out.println("m2(): Thread1:ThreadLocalData:"+Thread2.threadLocal.get());
		System.out.println("m2(): Thread1:ThreadLocalData:"+Thread1.threadLocal.get());
		
	}


}
