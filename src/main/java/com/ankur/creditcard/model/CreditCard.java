package com.ankur.creditcard.model;

public class CreditCard {

	private String id;
	private String name;
	private Integer limitBal;
	private Integer sex;
	private Integer education;
	private Integer marriage;
	private Integer age;
	private Integer pay_0;
	private Integer pay_02;
	private Integer pay_03;
	private Integer pay_04;
	private Integer pay_05;
	private Integer pay_06;
	private Integer billAmt1;
	private Integer billAmt2;
	private Integer billAmt3;
	private Integer billAmt4;
	private Integer billAmt5;
	private Integer billAmt6;
	private Integer payAmt1;
	private Integer payAmt2;
	private Integer payAmt3;
	private Integer payAmt4;
	private Integer payAmt5;
	private Integer payAmt6;
	private Integer nextMonth;

	public CreditCard() {
		super();
	}

	public CreditCard(String id, String name, Integer limitBal, Integer sex, Integer education, Integer marriage,
			Integer age, Integer pay_0, Integer pay_02, Integer pay_03, Integer pay_04, Integer pay_05, Integer pay_06,
			Integer billAmt1, Integer billAmt2, Integer billAmt3, Integer billAmt4, Integer billAmt5, Integer billAmt6,
			Integer payAmt1, Integer payAmt2, Integer payAmt3, Integer payAmt4, Integer payAmt5, Integer payAmt6,
			Integer nextMonth) {
		super();
		this.id = id;
		this.name = name;
		this.limitBal = limitBal;
		this.sex = sex;
		this.education = education;
		this.marriage = marriage;
		this.age = age;
		this.pay_0 = pay_0;
		this.pay_02 = pay_02;
		this.pay_03 = pay_03;
		this.pay_04 = pay_04;
		this.pay_05 = pay_05;
		this.pay_06 = pay_06;
		this.billAmt1 = billAmt1;
		this.billAmt2 = billAmt2;
		this.billAmt3 = billAmt3;
		this.billAmt4 = billAmt4;
		this.billAmt5 = billAmt5;
		this.billAmt6 = billAmt6;
		this.payAmt1 = payAmt1;
		this.payAmt2 = payAmt2;
		this.payAmt3 = payAmt3;
		this.payAmt4 = payAmt4;
		this.payAmt5 = payAmt5;
		this.payAmt6 = payAmt6;
		this.nextMonth = nextMonth;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLimitBal() {
		return limitBal;
	}

	public void setLimitBal(Integer limitBal) {
		this.limitBal = limitBal;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getEducation() {
		return education;
	}

	public void setEducation(Integer education) {
		this.education = education;
	}

	public Integer getMarriage() {
		return marriage;
	}

	public void setMarriage(Integer marriage) {
		this.marriage = marriage;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getPay_0() {
		return pay_0;
	}

	public void setPay_0(Integer pay_0) {
		this.pay_0 = pay_0;
	}

	public Integer getPay_02() {
		return pay_02;
	}

	public void setPay_02(Integer pay_02) {
		this.pay_02 = pay_02;
	}

	public Integer getPay_03() {
		return pay_03;
	}

	public void setPay_03(Integer pay_03) {
		this.pay_03 = pay_03;
	}

	public Integer getPay_04() {
		return pay_04;
	}

	public void setPay_04(Integer pay_04) {
		this.pay_04 = pay_04;
	}

	public Integer getPay_05() {
		return pay_05;
	}

	public void setPay_05(Integer pay_05) {
		this.pay_05 = pay_05;
	}

	public Integer getPay_06() {
		return pay_06;
	}

	public void setPay_06(Integer pay_06) {
		this.pay_06 = pay_06;
	}

	public Integer getBillAmt1() {
		return billAmt1;
	}

	public void setBillAmt1(Integer billAmt1) {
		this.billAmt1 = billAmt1;
	}

	public Integer getBillAmt2() {
		return billAmt2;
	}

	public void setBillAmt2(Integer billAmt2) {
		this.billAmt2 = billAmt2;
	}

	public Integer getBillAmt3() {
		return billAmt3;
	}

	public void setBillAmt3(Integer billAmt3) {
		this.billAmt3 = billAmt3;
	}

	public Integer getBillAmt4() {
		return billAmt4;
	}

	public void setBillAmt4(Integer billAmt4) {
		this.billAmt4 = billAmt4;
	}

	public Integer getBillAmt5() {
		return billAmt5;
	}

	public void setBillAmt5(Integer billAmt5) {
		this.billAmt5 = billAmt5;
	}

	public Integer getBillAmt6() {
		return billAmt6;
	}

	public void setBillAmt6(Integer billAmt6) {
		this.billAmt6 = billAmt6;
	}

	public Integer getPayAmt1() {
		return payAmt1;
	}

	public void setPayAmt1(Integer payAmt1) {
		this.payAmt1 = payAmt1;
	}

	public Integer getPayAmt2() {
		return payAmt2;
	}

	public void setPayAmt2(Integer payAmt2) {
		this.payAmt2 = payAmt2;
	}

	public Integer getPayAmt3() {
		return payAmt3;
	}

	public void setPayAmt3(Integer payAmt3) {
		this.payAmt3 = payAmt3;
	}

	public Integer getPayAmt4() {
		return payAmt4;
	}

	public void setPayAmt4(Integer payAmt4) {
		this.payAmt4 = payAmt4;
	}

	public Integer getPayAmt5() {
		return payAmt5;
	}

	public void setPayAmt5(Integer payAmt5) {
		this.payAmt5 = payAmt5;
	}

	public Integer getPayAmt6() {
		return payAmt6;
	}

	public void setPayAmt6(Integer payAmt6) {
		this.payAmt6 = payAmt6;
	}

	public Integer getNextMonth() {
		return nextMonth;
	}

	public void setNextMonth(Integer nextMonth) {
		this.nextMonth = nextMonth;
	}

	@Override
	public String toString() {
		return "CreditCard [id=" + id + ", name=" + name + ", limitBal=" + limitBal + ", sex=" + sex + ", education="
				+ education + ", marriage=" + marriage + ", age=" + age + ", pay_0=" + pay_0 + ", pay_02=" + pay_02
				+ ", pay_03=" + pay_03 + ", pay_04=" + pay_04 + ", pay_05=" + pay_05 + ", pay_06=" + pay_06
				+ ", billAmt1=" + billAmt1 + ", billAmt2=" + billAmt2 + ", billAmt3=" + billAmt3 + ", billAmt4="
				+ billAmt4 + ", billAmt5=" + billAmt5 + ", billAmt6=" + billAmt6 + ", payAmt1=" + payAmt1 + ", payAmt2="
				+ payAmt2 + ", payAmt3=" + payAmt3 + ", payAmt4=" + payAmt4 + ", payAmt5=" + payAmt5 + ", payAmt6="
				+ payAmt6 + ", nextMonth=" + nextMonth + "]";
	}

}
