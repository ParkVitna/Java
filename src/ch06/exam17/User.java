package ch06.exam17;

public class User { //�ʵ� ���� -> getter setter �����
	//Field
	private String id;
	private String name;
	private String password;
	private int age;
	private boolean adult;
	
	//Method
	/*
	//Setter -> ����
	public void setAge(int age) {
		if(age < 0) {
			this.age = 0;
		}else {
			this.age = age;
		}
		
	}
	//Getter -> �б�
	public int getAge() {
		return age;
	}

	//�ϴ� ��� - �ʱ� ����
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

	//Source - Generate Getters and Setters���� ����
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
