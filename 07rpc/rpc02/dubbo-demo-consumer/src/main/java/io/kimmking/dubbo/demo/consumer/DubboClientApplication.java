package io.kimmking.dubbo.demo.consumer;

import io.kimmking.dubbo.demo.api.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@Slf4j
@SpringBootApplication(scanBasePackages = {"io.kimmking.dubbo.demo.api"})
@MapperScan(basePackages = {"io.kimmking.dubbo.demo.api"})
public class DubboClientApplication {


	@DubboReference(version = "1.0.0") //, url = "dubbo://127.0.0.1:12345")
	private UserService userService;

	@DubboReference(version = "1.0.0") //, url = "dubbo://127.0.0.1:12345")
	private OrderService orderService;

	@DubboReference(version = "1.0.0") //, url = "dubbo://127.0.0.1:12345")
	private ProvideService provideService;

	public static void main(String[] args) {

		SpringApplication.run(DubboClientApplication.class, args);
//		SpringApplication.run(DubboClientApplication.class).close();

		// UserService service = new xxx();
		// service.findById

//		UserService userService = Rpcfx.create(UserService.class, "http://localhost:8080/");
//		User user = userService.findById(1);
//		System.out.println("find user id=1 from server: " + user.getName());
//
//		OrderService orderService = Rpcfx.create(OrderService.class, "http://localhost:8080/");
//		Order order = orderService.findOrderById(1992129);
//		System.out.println(String.format("find order name=%s, amount=%f",order.getName(),order.getAmount()));

	}

	@Bean
	public ApplicationRunner runner() {
		return args -> {
			User user = userService.findById(1);
			System.out.println("find user id=1 from server: " + user.getName());
			Order order = orderService.findOrderById(1992129);
			System.out.println(String.format("find order name=%s, amount=%f",order.getName(),order.getAmount()));
		};
	}

	@Bean
	public ApplicationRunner runnerTest() {
		return args -> {
			int customerid = 10000;
			int amount = 1;
			String tid = UUID.randomUUID().toString();
			provideService.transfer(tid,customerid,amount);
			log.info("customerid {} transfer amount {} ...",customerid,amount);
		};
	}

}
