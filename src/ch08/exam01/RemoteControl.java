package ch08.exam01;

public interface RemoteControl {
	//상수 - 대문자로 쓰기 관례, 값 반드시 제공해야 함
	String COMPANY = "삼성"; //앞에 public static final 생략되어 있음
	int MAX_VOULUME = 10;
	int MIN_VOULUME = 1;
	
	//메소드(객체 사용 설명) -> 앞으로 객체를 사용할 때 이렇게 사용할 수 있어. 이런 설명
	void turnOn(); //실행부{} 없음 (추상클래스의 특성을 갖고 있음)
	void turnOff(); //앞에 public abstract 생략되어 있음
	void setVolume(int volume);

}
