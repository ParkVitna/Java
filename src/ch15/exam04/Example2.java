package ch15.exam04;

import java.util.HashMap;
import java.util.Map;

public class Example2 {

	public static void main(String[] args) {
		Map<User, Board> map = new HashMap<>();
		
		map.put(new User("winter", "�ܿ��"), new Board(1, "�ܿ��"));
		map.put(new User("winter", "������"), new Board(2, "����")); //�Ȱ��� Ű�� ������ �� hash�ڵ� �̿��ؼ� �Ǻ� + equals -> ����� ��
		map.put(new User("spring", "������"), new Board(3, "�ɻ�����"));
		System.out.println(map.size());
		
		Board board = map.get(new User("winter", null));
		System.out.println(board.getBno()); //���ϰ�ü�� ����� �Ǿ => 2
		System.out.println(board.getTitle()); //���ϰ�ü�� ����� �Ǿ => ����
		
		Board board2 = map.get(new User("spring", null));
		System.out.println(board2.getBno());
		System.out.println(board2.getTitle());
		
	}

}
