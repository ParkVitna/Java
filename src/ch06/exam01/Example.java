package ch06.exam01;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//프로그램 실행 용도로 사용
		
		Student s1 = new Student(); //객체 생성
		//클래스 타입의 변수를 선언하고 객체의 위치(번지)를 저장
		Student s2 = new Student();
		Student s3= s1; //참조하는 객체가 같아짐.
		
		if(s1 == s2) { //번지 비교 -> 같다면 같은 객체를 참조한다는 의미 => false
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}

	}

}
