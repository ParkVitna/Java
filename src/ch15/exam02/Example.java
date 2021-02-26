package ch15.exam02;

import java.util.ArrayList;
import java.util.List;

//ArrayList -> 잘쓰는 방식
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Board> list = new ArrayList<Board>(); //<해당 타입(인터페이스)>만 저장하는 리스트
		List<Board> list = new ArrayList<>(); //뒤에<> 생략가능 앞에 있는거 그대로 사용됨
		
		//객체 저장
		list.add(new Board(1, "제목1")); //Integer 객체
		list.add(new Board(2, "제목2"));
		list.add(new Board(3, "제목3"));
		System.out.println(list.size()); //저장된 갯수가 몇개냐
		
		//객체 얻기
		Board board1 = list.get(0);
		System.out.println(board1.getBno() + ":" + board1.getTitle());
		Board board2 = list.get(1);
		Board board3 = list.get(2);
		
		//반복 처리
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getBno() + ":" + board.getTitle());
		}
		
		//더 쉬운 반복 처리
		for(Board board : list) {
			System.out.println(board.getBno() + ":" + board.getTitle());
		}
		
	
		
		//객체 제거
		list.remove(0); //홍길동 삭제
		list.remove(0); //3삭제 -> 당겨오기 때문에
		System.out.println(list.size());

	}

}
