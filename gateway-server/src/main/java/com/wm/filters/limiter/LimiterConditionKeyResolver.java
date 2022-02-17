package com.wm.filters.limiter;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 描述:自定义限流按什么维度
 *
 * @auther WangMin
 * @create 2022-02-08 16:12
 */
@Component
public class LimiterConditionKeyResolver implements KeyResolver {

    @Override
    public Mono<String> resolve(ServerWebExchange exchange) {
        //根据地址
        return Mono.just(exchange.getRequest().getRemoteAddress().getAddress().getHostAddress());
        //根据uri限流
        //return Mono.just(exchange.getRequest().getURI().getPath());
        //根据用户维度限流
        //return Mono.just(exchange.getRequest().getQueryParams().getFirst("user"));

    }
}

