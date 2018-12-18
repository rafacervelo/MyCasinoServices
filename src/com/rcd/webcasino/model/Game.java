package com.rcd.webcasino.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Game {
	
	private Double betMax = null;
	private Double betMin = null;
	private Double betRe = null;
	private String gname = null;
	private Double result = null;
	private Integer roundnum = null;
	
	
	public Double getBetMax() {
	
		return betMax;
	
	}
	
	public void setBetMax(Double betMax) {
	
		this.betMax = betMax;
	
	}
	
	public Double getBetMin() {
	
		return betMin;
	
	}
	
	public void setBetMin(Double betMin) {
	
		this.betMin = betMin;
	
	}
	
	public Double getBetRe() {
	
		return betRe;
	
	}
	
	public void setBetRe(Double betRe) {
	
		this.betRe = betRe;
	
	}
	
	public String getGname() {
	
		return gname;
	
	}
	
	public void setGname(String gname) {
	
		this.gname = gname;
	
	}
	
	public Double getResult() {
	
		return result;
	
	}
	
	public void setResult(Double result) {
	
		this.result = result;
	
	}
	
	public Integer getRoundnum() {
	
		return roundnum;
	
	}
	
	public void setRoundnum(Integer roundnum) {

		this.roundnum = roundnum;
	
	}
	
	@Override
	public String toString() {
		
		return ToStringBuilder.reflectionToString(this);
	}
}
