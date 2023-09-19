package com.ccteam.app08.threads;

import com.ccteam.app08.util.A;
import com.ccteam.app08.util.CustomThreadLocal;

public class Thread2 extends Thread{
	A a;
	public Thread2(A a)
	{
		this.a=a;
	}
	public static CustomThreadLocal threadLocal=new CustomThreadLocal();
	
	@Override
	public void run()
	{
		threadLocal.set("BBB");
		a.m2();
	}

}
