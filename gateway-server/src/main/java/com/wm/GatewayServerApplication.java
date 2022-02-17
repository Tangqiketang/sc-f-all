package com.wm;

import com.wm.filters.MyRequestTimeFilter;
import com.wm.filters.RequestTimeGatewayFilterFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * 描述:
 * 网关服务
 *
 * @auther WangMin
 * @create 2022-02-16 15:18
 */
@SpringBootApplication
public class GatewayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run( GatewayServerApplication.class, args );
    }




}
