package ru.yandex.lc.yoo.money.demo.dto.yoo;

public class Amount {

	public String value;

	public String currency;

	public Amount(String value, String currency) {
		this.value = value;
		this.currency = currency;
	}

	public String getValue() {
		return value;
	}

	public String getCurrency() {
		return currency;
	}
}
