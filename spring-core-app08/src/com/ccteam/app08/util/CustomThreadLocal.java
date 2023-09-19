package com.ccteam.app08.util;

public class CustomThreadLocal extends ThreadLocal{
	protected Object initialValue() {
		return "this Thread does not have scope in this method";
	}

}
