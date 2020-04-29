package com.test.sampleTest.request;

public class CardRequest {
     private String cardHolderName;
     private String cardNumber;
     private String  cvv;
     private String  expireMonth;
     private String expireDate;
     private String payAmount;
     
	@Override
	public String toString() {
		return "CardRequest [cardHolderName=" + cardHolderName + ", cardNumber=" + cardNumber + ", cvv=" + cvv
				+ ", expireMonth=" + expireMonth + ", expireDate=" + expireDate + ", payAmount=" + payAmount + "]";
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getExpireMonth() {
		return expireMonth;
	}
	public void setExpireMonth(String expireMonth) {
		this.expireMonth = expireMonth;
	}
	public String getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	public String getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
     
     
}
