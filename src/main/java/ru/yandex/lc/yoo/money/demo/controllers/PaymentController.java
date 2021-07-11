package ru.yandex.lc.yoo.money.demo.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.yandex.lc.yoo.money.demo.dto.web.PaymentReply;
import ru.yandex.lc.yoo.money.demo.dto.web.PaymentRequest;
import ru.yandex.lc.yoo.money.demo.dto.yoo.Amount;
import ru.yandex.lc.yoo.money.demo.dto.yoo.YooNewPayment;
import ru.yandex.lc.yoo.money.demo.repository.YooMoneyRepository;

import java.util.UUID;

@Controller
public class PaymentController {

	private Logger log = LoggerFactory.getLogger(PaymentController.class);

	@Autowired
	private YooMoneyRepository yooRepo;

	@PostMapping("/payment")
	@ResponseBody
	public Object pay(PaymentRequest req) throws JsonProcessingException {
		//here we mess all logic in controller, TODO - move this to service
		log.info("Creating payment, amount: {}₽", req.amount);
		String reply = yooRepo.newPayment(
				UUID.randomUUID().toString(),
				new YooNewPayment(
						new Amount(req.amount + ".00", "RUB"),
						"some test payment")
		);
		ObjectMapper mp = new ObjectMapper();
		var json = mp.readTree(reply);
		return new PaymentReply(json.get("confirmation").get("confirmation_token").asText());
	}

}
