package ru.yandex.lc.yoo.money.demo.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.yandex.lc.yoo.money.demo.dto.yoo.YooNewPayment;

@FeignClient(value = "YooMoney", url = "${yoo.money.endpoint}")
public interface YooMoneyRepository {

	@RequestMapping(
			method = RequestMethod.POST,
			value = "v3/payments",
			produces = "application/json",
			consumes = "application/json")
	String newPayment(
			@RequestHeader("Idempotence-Key") String token,
			YooNewPayment paymentInfo
	);

}
