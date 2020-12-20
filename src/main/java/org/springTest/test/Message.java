package org.springTest.test;

import java.io.Serializable;
import org.springframework.stereotype.Component;

@Component
public class Message implements MessageIf {

	private String time;	
	private String text1;
	

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

}