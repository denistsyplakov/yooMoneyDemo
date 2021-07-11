package ru.yandex.lc.yoo.money.demo.config;

import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class YooMoneyFeignConfig {

	@Value("${shop.id}")
	private String shopId;

	@Value("${shop.secret}")
	private String shopSecret;


	@Bean
	public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
		return new BasicAuthRequestInterceptor(shopId, shopSecret);
	}

	//Yes in this prototype we want to log everything
	@Bean
	Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
	}

}

