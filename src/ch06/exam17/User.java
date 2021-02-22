package ch06.exam17;

public class User { //필드 선언 -> getter setter 만들기
	//Field
	private String id;
	private String name;
	private String password;
	private int age;
	private boolean adult;
	
	//Method
	/*
	//Setter -> 쓰기
	public void setAge(int age) {
		if(age < 0) {
			this.age = 0;
		}else {
			this.age = age;
		}
		
	}
	//Getter -> 읽기
	public int getAge() {
		return age;
	}

	//하는 방법 - 필기 참고
	public void setPassword(String password) {
		this.password = password;
	}
	*/
	
	/*
	//Setter
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	
	//Getter
	public boolean isAdult() {
		return adult;
	}
	*/

	//Source - Generate Getters and Setters에서 설정
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
