package ch11.exam03;
//현재 시간 읽기
public class Example {
	
	public static void method() {
		long sum = 0;
		for(int i=0; i<1000000; i++) {
			sum += i;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.nanoTime();
		method();
		long end = System.nanoTime();
		System.out.println("실행 시간 :" + (end - start) + "ns");
		

	}

}
