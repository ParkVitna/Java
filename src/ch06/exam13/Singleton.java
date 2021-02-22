package ch06.exam13;

public class Singleton {
	//Field
	private static Singleton singleton = new Singleton();
	
	//Constructor
	private Singleton() {
		
	}
	
	//Method
	/*
	static int method1() {
		return 1;
	}
	
	static String mathod2() {
		return "ÀÚ¹Ù";	}
	
	static int[] method3() {
		int[] arr = {10, 20, 30};
		return arr;
	}
	*/
	
	static Singleton getInstance() {
		return singleton;
		//Singleton s = new Singleton();
		//return s;
	}
}
