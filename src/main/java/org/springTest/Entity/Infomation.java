package org.springTest.Entity;

import org.springframework.stereotype.Component;


public class Infomation {
	private String time;
	private String text1;
	
	public Infomation() {
		
	}
	
	public Infomation(String time,String text1) {
		this();
		this.time = time;
		this.text1 = text1;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getText1() {
		return text1;
	}

	public void setText1(String text1) {
		this.text1 = text1;
	}
	
	@Override
	public String toString() {
		return "[time = " + time + ", text1=" + text1 +"]";
	}

}
