package ch11.exam04;
//Class 객체 얻기
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//자주 쓰는 방법
		Class var1 = A.class; //메소드 영역에 로딩된 해당 클래스 파일의 번지 => A가 로딩된 번지, 메소드 영역의 번지
		
		
		//자주 안쓰임
		A a = new A();
		Class var2 = a.getClass();

	}

}
