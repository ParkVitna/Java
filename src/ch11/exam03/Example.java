package ch11.exam03;
//���� �ð� �б�
public class Example {
	
	public static void method() {
		//1���� 1000000������ ���� ���ϴµ� �ɸ� �ð�
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
		System.out.println("���� �ð� :" + (end - start) + "ns");
		

	}

}
