package com.ccteam.app11.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ccteam.app11.beans.HelloBean;

@Configuration
public class AppConfig {
	@Bean 
	public HelloBean helloBean() {
		return new HelloBean();
	}


}
