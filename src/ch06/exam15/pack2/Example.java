package ch06.exam15.pack2;
import java.util.Date;

import ch06.exam15.pack1.Board;
import ch06.exam15.pack1.Product;
//import ch06.exam15.pack1.*; //해당 패키지 안에 있는거 다 쓸 때

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board b1 = new Board();
		b1.title = "제목1";
		
		Product p1 = new Product();
		
		Date now = new Date();
		
		//전체 이름으로 표현 (위에 Board는 import로 해결)
		ch06.exam15.pack3.Board b2 = new ch06.exam15.pack3.Board(); //pack3에서 가져와서 쓰고 싶다면
		
	}

}
