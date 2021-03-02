package ch15.exam04;

import java.util.HashMap;
import java.util.Map;

public class Example2 {

	public static void main(String[] args) {
		Map<User, Board> map = new HashMap<>();
		
		map.put(new User("winter", "겨울비"), new Board(1, "겨울비"));
		map.put(new User("winter", "봄돌이"), new Board(2, "입춘")); //똑같은 키로 간주할 때 hash코드 이용해서 판별 + equals -> 덮어쓰기 됨
		map.put(new User("spring", "복습용"), new Board(3, "꽃샘추위"));
		System.out.println(map.size());
		
		Board board = map.get(new User("winter", null));
		System.out.println(board.getBno()); //동일객체로 덮어쓰기 되어서 => 2
		System.out.println(board.getTitle()); //동일객체로 덮어쓰기 되어서 => 입춘
		
		Board board2 = map.get(new User("spring", null));
		System.out.println(board2.getBno());
		System.out.println(board2.getTitle());
		
	}

}
