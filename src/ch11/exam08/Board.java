package ch11.exam08;

import java.util.Date;

public class Board {
	private int bno;
	private String title;
	private String content;
	private String write;
	private Date writeDate; //날짜를 전달할 때
	
	public Board() {
		/*
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.write = write;
		this.writeDate = writeDate;
		*/
	}

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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWrite() {
		return write;
	}

	public void setWrite(String write) {
		this.write = write;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	
	

}
