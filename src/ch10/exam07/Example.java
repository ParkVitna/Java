package ch10.exam07;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method();
		}catch (Exception e){
			//예외 메시지 별로 예외처리를 할 때
			String message = e.getMessage();
			System.out.println(message);
			
			//디버깅할 때 사용할 수 있는 예외 정보 -> 개발 다 하고 나서는 지워야 함
			System.out.println(e.toString()); //예외의 문자열을 얻어봄 => ch10.exam07.NoAccountException: 입금 계좌가 없음
			e.printStackTrace(); // => ch10.exam07.NoAccountException: 입금 계좌가 없음
								//at ch10.exam07.Example.method(Example.java:22)
								//at ch10.exam07.Example.main(Example.java:8)
		}
		
	}

	public static void method() throws NoAccountException {
		throw new NoAccountException("입금 계좌가 없음");
		
	}

}
