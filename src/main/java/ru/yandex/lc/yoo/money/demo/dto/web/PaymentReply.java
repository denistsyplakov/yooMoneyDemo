package ru.yandex.lc.yoo.money.demo.dto.web;

public class PaymentReply {
	public String confirmationToken;

	public PaymentReply(String confirmationToken) {
		this.confirmationToken = confirmationToken;
	}

	public String getConfirmationToken() {
		return confirmationToken;
	}
}
