package ch15.exam04;

public class Board { //데이터를 전달할 목적으로 만들어진 객체 obj(Object) ?
	//Field
	private int bno;
	private String title;
	
	//Constructor
	public Board(int bno, String title) {
		this.bno = bno;
		this.title = title;
	}
	
	//Method
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	

}
