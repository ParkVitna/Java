package ch11.exam02;

import java.util.Date;

import ch11.exam01.Member;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object var1 = new Object();
		System.out.println(var1.toString());
		
		//재정의 된 결과가 나온다
		
		Date var2 = new Date(); //java.util.Date import 하기
		System.out.println(var2.toString());
		
		String var3 = "abc";
		System.out.println(var3.toString());
		
		Member var4 = new Member("Winter", "늦겨울");
		System.out.println(var4.toString());
		System.out.println(var4); //왜 위에와 결과가 똑같을까?
		//println은 참조변수의 toString을 호출한다.
		
		String result = var4 + " => spring: 봄돌이"; // 결과) winter: 늦겨울 => spring: 봄돌이
		System.out.println(result);
		//var4 이렇게 객체만 주어지면 자동으로 toString이 호출되서 +연산 한다.

	}

}
