package com.wm.hystrixturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 描述:
 * 用于整合各服务dashboard
 *
 * @auther WangMin
 * @create 2022-02-15 17:02
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix
//dashboard
@EnableHystrixDashboard
@EnableCircuitBreaker
//整个所有dashboard
@EnableTurbine
public class HystrixTurbineApplication {

    /**
     * http://localhost:8765/turbine.stream
     * http://localhost:8765/hystrix
     */
    public static void main(String[] args) {
        SpringApplication.run( HystrixTurbineApplication.class, args );
    }
}
