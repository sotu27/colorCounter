package org.springTest.Method;

import java.time.LocalDateTime;
import org.springframework.stereotype.Component;

@Component
public class timeForInsert {
	public static void main(String[] args) {
		}
		
		public String timeFotInsert() {
			// 現在時刻を取得する
			String nowTime = "";
			LocalDateTime ldt = LocalDateTime.now();
			nowTime = ldt.toString();
			
			// YYYY-MM-DD HH:MM:SS に変換する。
			nowTime = nowTime.replace("T", " ");
			nowTime = nowTime.substring(0, 19);
			return nowTime;
		}
}
