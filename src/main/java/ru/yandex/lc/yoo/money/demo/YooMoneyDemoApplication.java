package ru.yandex.lc.yoo.money.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class YooMoneyDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(YooMoneyDemoApplication.class, args);
	}

}
