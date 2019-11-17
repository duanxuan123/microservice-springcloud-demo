package com.duan.springcloud.cfgbeen;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
//	@Bean
//	public  IRule  myRule() {
//		return new RandomRule();//负载算法：随机
//	}
//	@Bean
//	public  IRule  myRule() {
//		return new RetryRule();//负载算法：retry,,大概3~5次之后就会自动过滤掉已经死掉的服务
//	}
}
