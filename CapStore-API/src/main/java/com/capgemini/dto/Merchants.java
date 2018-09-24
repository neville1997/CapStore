package com.capgemini.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Merchants {
	
	/*@Id
	@GeneratedValue(strategy=GenerationType.AUTO)*/
	private int merchantId;
	private String merchantName;
	private String merchantEmail;
	private String merchantPswd;
	private String merchantMobile;
	private String merchanttype;
	private String merchantAddress;
	private double merchantRating;
	private boolean merchantFlag;
	public int getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantEmail() {
		return merchantEmail;
	}
	public void setMerchantEmail(String merchantEmail) {
		this.merchantEmail = merchantEmail;
	}
	public String getMerchantPswd() {
		return merchantPswd;
	}
	public void setMerchantPswd(String merchantPswd) {
		this.merchantPswd = merchantPswd;
	}
	public String getMerchantMobile() {
		return merchantMobile;
	}
	public void setMerchantMobile(String merchantMobile) {
		this.merchantMobile = merchantMobile;
	}
	public String getMerchanttype() {
		return merchanttype;
	}
	public void setMerchanttype(String merchanttype) {
		this.merchanttype = merchanttype;
	}
	public String getMerchantAddress() {
		return merchantAddress;
	}
	public void setMerchantAddress(String merchantAddress) {
		this.merchantAddress = merchantAddress;
	}
	public double getMerchantRating() {
		return merchantRating;
	}
	public void setMerchantRating(double merchantRating) {
		this.merchantRating = merchantRating;
	}
	public boolean isMerchantFlag() {
		return merchantFlag;
	}
	public void setMerchantFlag(boolean merchantFlag) {
		this.merchantFlag = merchantFlag;
	}
	public boolean getMerchantFlag(){
		return this.merchantFlag;
	}

	@Override
	public String toString() {
		return "Merchants [merchantId=" + merchantId + ", merchantName=" + merchantName + ", merchantEmail="
				+ merchantEmail + ", merchantPswd=" + merchantPswd + ", merchantMobile=" + merchantMobile
				+ ", merchanttype=" + merchanttype + ", merchantAddress=" + merchantAddress + ", merchantRating="
				+ merchantRating + ", merchantFlag=" + merchantFlag + "]";
	}
}
