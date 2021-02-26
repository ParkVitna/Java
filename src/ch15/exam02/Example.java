package ch15.exam02;

import java.util.ArrayList;
import java.util.List;

//ArrayList -> �߾��� ���
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Board> list = new ArrayList<Board>(); //<�ش� Ÿ��(�������̽�)>�� �����ϴ� ����Ʈ
		List<Board> list = new ArrayList<>(); //�ڿ�<> �������� �տ� �ִ°� �״�� ����
		
		//��ü ����
		list.add(new Board(1, "����1")); //Integer ��ü
		list.add(new Board(2, "����2"));
		list.add(new Board(3, "����3"));
		System.out.println(list.size()); //����� ������ ���
		
		//��ü ���
		Board board1 = list.get(0);
		System.out.println(board1.getBno() + ":" + board1.getTitle());
		Board board2 = list.get(1);
		Board board3 = list.get(2);
		
		//�ݺ� ó��
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getBno() + ":" + board.getTitle());
		}
		
		//�� ���� �ݺ� ó��
		for(Board board : list) {
			System.out.println(board.getBno() + ":" + board.getTitle());
		}
		
	
		
		//��ü ����
		list.remove(0); //ȫ�浿 ����
		list.remove(0); //3���� -> ��ܿ��� ������
		System.out.println(list.size());

	}

}
