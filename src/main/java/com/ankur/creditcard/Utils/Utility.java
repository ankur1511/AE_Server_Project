package com.ankur.creditcard.Utils;

import java.util.Map;

import com.ankur.creditcard.model.CreditCard;

public class Utility {

	/**
	 * This method determine the id of a document in a document
	 * 
	 * @param response
	 * @return id
	 */
	public static String findId(String response) {

		int len = response.indexOf("_id");
		String str1 = response.substring(len);
		String[] str2 = str1.split(",");
		String id = str2[0].substring(6, str2[0].length() - 1);
		return id;
	}

	/**
	 * This method determine the id of the document by name
	 * 
	 * @param response
	 * @param name
	 * @return id of the document
	 */
	public static String findIdByName(String response, String name) {

		int len = response.indexOf("_id");
		String str1 = response.substring(len);
		String[] str2 = str1.split("\\_id\":");
		String id = null;
		for (String str4 : str2) {
			if (str4.contains(name)) {
				id = str4.split(",")[0].substring(1, str4.split(",")[0].length() - 1);
				break;
			}
		}
		return id;
	}

	/**
	 * This method populates the CreditCard Entity
	 * 
	 * @param response
	 * @return CreditCard Object
	 */
	public static CreditCard setEntity(Map<String, Object> response) {

		CreditCard creditCardEntity = new CreditCard();

		creditCardEntity.setId(response.get("ID").toString());
		creditCardEntity
				.setName(response.get("Name").toString().substring(0, response.get("Name").toString().length() - 9));
		creditCardEntity.setAge((Integer) response.get("AGE"));
		creditCardEntity.setEducation((Integer) response.get("EDUCATION"));
		creditCardEntity.setMarriage((Integer) response.get("MARRIAGE"));
		creditCardEntity.setSex((Integer) response.get("SEX"));
		creditCardEntity.setLimitBal((Integer) response.get("LIMIT_BAL"));
		creditCardEntity.setPay_0((Integer) response.get("PAY_0"));
		creditCardEntity.setPay_02((Integer) response.get("PAY_2"));
		creditCardEntity.setPay_03((Integer) response.get("PAY_3"));
		creditCardEntity.setPay_04((Integer) response.get("PAY_4"));
		creditCardEntity.setPay_05((Integer) response.get("PAY_5"));
		creditCardEntity.setPay_06((Integer) response.get("PAY_6"));
		creditCardEntity.setBillAmt1((Integer) response.get("BILL_AMT1"));
		creditCardEntity.setBillAmt2((Integer) response.get("BILL_AMT2"));
		creditCardEntity.setBillAmt3((Integer) response.get("BILL_AMT3"));
		creditCardEntity.setBillAmt4((Integer) response.get("BILL_AMT4"));
		creditCardEntity.setBillAmt5((Integer) response.get("BILL_AMT5"));
		creditCardEntity.setBillAmt6((Integer) response.get("BILL_AMT6"));
		creditCardEntity.setPayAmt1((Integer) response.get("PAY_AMT1"));
		creditCardEntity.setPayAmt2((Integer) response.get("PAY_AMT2"));
		creditCardEntity.setPayAmt3((Integer) response.get("PAY_AMT3"));
		creditCardEntity.setPayAmt4((Integer) response.get("PAY_AMT4"));
		creditCardEntity.setPayAmt5((Integer) response.get("PAY_AMT5"));
		creditCardEntity.setPayAmt6((Integer) response.get("PAY_AMT6"));
		creditCardEntity.setNextMonth((Integer) response.get("nextMonth"));

		return creditCardEntity;
	}
}
