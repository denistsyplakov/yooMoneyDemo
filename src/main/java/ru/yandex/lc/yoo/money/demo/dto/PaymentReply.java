package ru.yandex.lc.yoo.money.demo.dto;

public class PaymentReply {
	public String uuid;

	public PaymentReply(String uuid) {
		this.uuid = uuid;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
}
