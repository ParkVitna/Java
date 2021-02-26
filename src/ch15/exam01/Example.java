package ch15.exam01;

import java.util.ArrayList;
import java.util.List;

//ArrayList
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		
		//객체 저장
		list.add("홍길동"); //String 객체
		list.add(3); //Integer객체로 박싱이 되어서 저장
		list.add(new Board()); //어떤 객체든 저장을 할 수 있다
		System.out.println(list.size()); //저장된 갯수가 몇개냐
		
		//객체 얻기
		//String name = list.get(0); //Object타입(부모)이 String타입(자식)으로 대입할 수 없다.
		String name = (String) list.get(0); //강제타입변환
		int value = (Integer) list.get(1); //Object을 Integer로 타입변환해서 오토언박싱
		Board board = (Board) list.get(2);
		//저장된 타입을 모르면 타입변환할 수 없어서 쓸 수 없다. -> 잘 쓰지 않음
		
		//잘쓰는 방식 -> exam02
		
		//객체 제거
		list.remove(0); //홍길동 삭제
		list.remove(0); //3삭제 -> 당겨오기 때문에
		System.out.println(list.size());
		
		
		

	}

}
