package com.duan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


@SpringBootApplication
@EnableHystrixDashboard
public class DeprConsumer_DashBoard_App {
	public static void main(String[] args) {
		SpringApplication.run(DeprConsumer_DashBoard_App.class, args);
	}
}
