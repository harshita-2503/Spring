package com.ccteam.app08.threads;

import com.ccteam.app08.util.A;
import com.ccteam.app08.util.CustomThreadLocal;

public class Thread1 extends Thread {
	A a;
	public Thread1(A a)
	{
		this.a=a;
	}
	public static CustomThreadLocal threadLocal=new CustomThreadLocal();
	
	@Override
	public void run()
	{
		threadLocal.set("AAA");
		a.m1();
	}

}
