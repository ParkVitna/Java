package ch15.exam02;

public class Board { //�����͸� ������ �������� ������� ��ü vo dto???
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
