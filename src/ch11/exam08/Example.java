package ch11.exam08;

import java.text.SimpleDateFormat;
import java.util.Date;

//Date 클래스
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new Board();
		board.setBno(1);
		board.setTitle("제목1");
		board.setContent("내용1");
		board.setWrite("글쓴이1");
		board.setWriteDate(new Date());
		
		service(board);

	}
	
	public static void service (Board board) {
		System.out.println(board.getBno()); //5개 다
		System.out.println(board.getTitle());
		System.out.println(board.getContent());
		System.out.println(board.getWrite());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyy.MM.dd");
		String strDate = sdf.format(board.getWriteDate());
		System.out.println(strDate);
	}

}
