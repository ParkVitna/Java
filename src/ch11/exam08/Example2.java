package ch11.exam08;

import java.util.Calendar;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		//�� new �Ἥ ���� ���ϰ� �������? Calendar�� protected -> �θ�νḸ ����� �� ����
		//���� �޼ҵ��� ~~~ �̱��� -> ��ǻ���� ��¥�� �ϳ��ۿ� ����
		
		int year = now.get(Calendar.YEAR); //YEAR����� �ָ�, �⵵�� ����
		int month = now.get(Calendar.MONTH) + 1; //MONTH�� 0���� 11���� ���� +1 (�ٱ����ٰ�!!)
		int date = now.get(Calendar.DAY_OF_MONTH);
		int day = now.get(Calendar.DAY_OF_WEEK); //�����Ͽ� �����̳� ������� 6
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
