package ch11.exam07;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 10;
		// 위 아래는 완전히 다른 것
		Integer var2 = new Integer(10); //(참조변수) 번지 = 값이 든 번지
		Integer var3 = 10; //자동으로 인티저 타입 변수가 만들어짐 -> Auto Boxing
		
		double var4 = 3.5; //값 대입
		Double var5 = new Double(3.5); //번지 대입
		Double var6 = 3.5; //Auto Boxing
		
		Integer var7 = new Integer(10); //10을 빼서 var8에 저장하고 싶다.
		int var8 = var7.intValue(); //var7안에 10을 끄집어내서 var8에 저장
		int var9 = var7; //var7은 참조변수 -> Auto UnBoxng
		
		Double var10 = new Double(3.5);
		double var11 = var10.doubleValue(); //정석 방법
		double var12 = var10; //어떻게 참조변수가 var12에 들어갈 수 있나 -> Auto UnBoxing
		//-> 이런 포장객체를 기본타입에 대입을 하게 되면 자동적으로 박싱이 풀려서 안에 있는 값이 저장된다.
		
		Object[] arr = new Object[5]; //Object는 모든 객체의 부모 따라서 자식객체는 Object로 타입변환 할 수 있음
		arr[0] = "abc";
		arr[1] = 10; //Auto Boxing 원래는 번지가 들어가야 되는데(객체가 만들어져서 들어가야 되는데)
		arr[2] = true; //Auto Boxing

	}

}
