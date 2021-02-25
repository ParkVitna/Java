package ch11.exam08;

import java.util.Calendar;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		//왜 new 써서 생성 못하게 했을까요? Calendar는 protected -> 부모로써만 사용할 수 있음
		//정적 메소드인 ~~~ 싱글톤 -> 컴퓨터의 날짜가 하나밖에 없음
		
		int year = now.get(Calendar.YEAR); //YEAR상수를 주면, 년도를 리턴
		int month = now.get(Calendar.MONTH) + 1; //MONTH는 0부터 11까지 따라서 +1 (바깥에다가!!)
		int date = now.get(Calendar.DAY_OF_MONTH);
		int day = now.get(Calendar.DAY_OF_WEEK); //일주일에 몇일이냐 토요일이 6
		int amPm = now.get(Calendar.AM_PM);
		int hour = now.get(Calendar.HOUR_OF_DAY); // 0~23
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		System.out.println(day);
		System.out.println(amPm);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
	}

}
