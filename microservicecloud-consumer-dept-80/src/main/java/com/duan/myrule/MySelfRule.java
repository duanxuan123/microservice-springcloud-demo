package com.duan.myrule;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class MySelfRule {

	@Bean
	@LoadBalanced
	public IRule getRestTemplate() {
	//	return new RandomRule();//自定义负载算法：使用随机
	//	return new RoundRobinRule();   ///这种事默认的：轮询算法
		return new RoundomRule_ZY();//自定义的负载算法
	}
}
