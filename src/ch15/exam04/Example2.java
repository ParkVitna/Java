package ch15.exam04;

import java.util.HashMap;
import java.util.Map;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<User, Board> map = new HashMap<>();
		
		map.put(new User("winter", "겨울비"), new Board(1, "겨울비"));
		map.put(new User("winter", "봄돌이"), new Board(2, "입춘")); //똑같은 키로 간주할 때 hash코드 이용해서 판별 + equals
		System.out.println(map.size());
		
		Board board = map.get(new User("winter", null));
		System.out.println(board.getBno());
		System.out.println(board.getTitle());
		
	}

}
