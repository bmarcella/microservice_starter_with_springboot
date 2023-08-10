package com.monkata.gatewayserver;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
// @EnableDiscoveryClient
public class GatewayserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayserverApplication.class, args);
	}
	// this bean is to rewrite routes
//	@Bean
//	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//		
//		return builder.routes()
//			  .route(p -> p
//			  .path("/monkata/accounts/**")
//			  .filters(f -> f.rewritePath("/monkata/accounts/(?<segment>.*)","/${segment}")
//			                   .addRequestHeader("X-Response-Time", new Date().toString()))
//			  .uri("lb://ACCOUNTS"))
//			  
//			  .route(p -> p
//					  .path("/monkata/loans/**")
//					  .filters(f -> f.rewritePath("/monkata/loans/(?<segment>.*)","/${segment}")
//					                   .addRequestHeader("X-Response-Time", new Date().toString()))
//					  .uri("lb://LOANS")).build();
//			  
//	}

}
