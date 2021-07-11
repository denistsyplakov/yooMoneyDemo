package ru.yandex.lc.yoo.money.demo.dto.yoo;

public class YooNewPayment {

	public Amount amount;

	public Confirmation confirmation = new Confirmation();

	public boolean capture = true;

	public String description;

	public YooNewPayment(Amount amount, String description) {
		this.amount = amount;
		this.description = description;
	}

	public Amount getAmount() {
		return amount;
	}

	public Confirmation getConfirmation() {
		return confirmation;
	}

	public boolean isCapture() {
		return capture;
	}

	public String getDescription() {
		return description;
	}
}
