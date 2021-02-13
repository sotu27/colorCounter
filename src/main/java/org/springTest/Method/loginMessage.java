package org.springTest.Method;

import java.time.LocalDateTime;
import org.springframework.stereotype.Component;

@Component
public class loginMessage {
	public static void main(String[] args) {
	}
	
	public String loginMessage(String user_name) {
		// 変数宣言
		String loginMessage = "";
		String hour = "";
		String userName = user_name;
		
		// 現在のhhを取得
		LocalDateTime ldt = LocalDateTime.now();
		hour = String.valueOf( ldt.getHour());
		
		// 時間帯ごとにログインメッセージを変更する。
		if (hour.equals("5") ||
				hour.equals("6") ||
				hour.equals("7") ||
				hour.equals("8") ||
				hour.equals("9") ) {
			loginMessage = "おはようございます"+ userName + "さん";
		} else if (hour.equals("10")||
				hour.equals("11")||
				hour.equals("12")||
				hour.equals("13")||
				hour.equals("14")||
				hour.equals("15")||
				hour.equals("16")||
				hour.equals("17")||
				hour.equals("18")) {
			loginMessage = "こんにちは" + userName + "さん";
		} else {
			loginMessage = "こんばんわ" + userName + "さん"; 
		}
		
		return loginMessage;
	}

}
