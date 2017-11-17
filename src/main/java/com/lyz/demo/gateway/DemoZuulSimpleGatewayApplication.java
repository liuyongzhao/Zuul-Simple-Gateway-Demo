package com.lyz.demo.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import com.lyz.demo.filter.SimpleFilter;

@EnableZuulProxy
@SpringBootApplication
public class DemoZuulSimpleGatewayApplication {

	 @Bean
	 public SimpleFilter simpleFilter() {
	     return new SimpleFilter();
	    }
	
	public static void main(String[] args) {
		SpringApplication.run(DemoZuulSimpleGatewayApplication.class, args);
	}
}
