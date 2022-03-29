package com.flavio.hrpayroll.entities;

public class Payment {

	private String name;
	private Double dailycome;
	private Integer days;

	public Payment() {
	}

	public Payment(String name, Double dailycome, Integer days) {
		this.name = name;
		this.dailycome = dailycome;
		this.days = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDailycome() {
		return dailycome;
	}

	public void setDailycome(Double dailycome) {
		this.dailycome = dailycome;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public Double getTotal() {
		return days * dailycome;
	}

}
