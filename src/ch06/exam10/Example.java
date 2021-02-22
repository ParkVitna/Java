package ch06.exam10;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Changer changer = new Changer();
		
		//Call by value (���� �����ؼ� ȣ��) -> �⺻Ÿ��(8��)
		int v1 = 1;
		changer.change(v1);
		System.out.println(v1);
		
		//Call by Reference(������ �����ؼ� ȣ��) -> ����Ÿ��(�迭, Ŭ����, ����, �������̽�)
		String v3 = "A";
		changer.change(v3);
		System.out.println(v3);
		
		//Call by Reference(������ �����ؼ� ȣ��)
		int[] arr1 = {0, 0, 0};
		changer.change(arr1); //���� ����
		System.out.println(arr1[0]); // =>2
		
		String[] arr3 = {"A", "B", "C"};
		changer.change(arr3);
		System.out.println(arr3[0]); // =>B
		
		Memeber m1 = new Memeber();
		System.out.println(m1.age); // =>1
		changer.change(m1); // =>2
		
	}

}
