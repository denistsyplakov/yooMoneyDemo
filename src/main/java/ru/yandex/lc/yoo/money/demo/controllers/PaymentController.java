package ru.yandex.lc.yoo.money.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.yandex.lc.yoo.money.demo.dto.PaymentReply;
import ru.yandex.lc.yoo.money.demo.dto.PaymentRequest;

@Controller
public class PaymentController {

	Logger log = LoggerFactory.getLogger(PaymentController.class);

	@PostMapping("/payment")
	@ResponseBody
	public Object pay(PaymentRequest req) {
		log.info("Creating payment, amount: {}₽", req.amount);
		return new PaymentReply("123123-123-123");
	}

}
