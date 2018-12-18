package com.rcd.webcasino.model;

import java.util.Date;

public class PayMethod {
	
	private String numcard = null;
	private Date expirationdate = null;
	private String cvv = null;
	private String ownername = null;
	private String ownersurname = null;
	private Boolean expirated = null;


	public PayMethod() {
	
	}


	public String getNumcard() {
		return numcard;
	}


	public void setNumcard(String numcard) {
		this.numcard = numcard;
	}


	public Date getExpirationdate() {
		return expirationdate;
	}


	public void setExpirationdate(Date expirationdate) {
		this.expirationdate = expirationdate;
	}


	public String getCvv() {
		return cvv;
	}


	public void setCvv(String cvv) {
		this.cvv = cvv;
	}


	public String getOwnername() {
		return ownername;
	}


	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}


	public String getOwnersurname() {
		return ownersurname;
	}


	public void setOwnersurname(String ownersurname) {
		this.ownersurname = ownersurname;
	}


	public Boolean getExpirated() {
		return expirated;
	}


	public void setExpirated(Boolean expirated) {
		this.expirated = expirated;
	}
	
	
	@Override
	public String toString() {
		
		return "Numero de tarjeta:"+getNumcard();
	}
	
}