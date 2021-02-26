package ch12.exam02;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인 스레드 시작");
		
		//네트워크 작업을 하는 스레드 생성과 실행
		Thread thread1 = new NetworkTask();// 이 자체가 스레드 이기 때문에 별도의 스레드를 만들 필요 없음
		thread1.start(); //스레드1 실행해~
		
		//뮤직 작업을 하는 스레드 생성과 실행
		Thread thread2 = new MusicTask();
		thread2.start(); //스레드2 실행해~ => 실행하는 코드는 MusicTastk.java에서 run()을 실행
		
		//->다형성 : 런어블 인터페이스를 사용하는 객체들을 다 사용할 수 있어서
		
		//채팅 작업을 하는 스레드 생성과 실행
				Thread thread3 = new Thread() { //스레드를 상속해서 하위 클래스를 만든 다음에 객체를 만든다 => 익명자식객체
					public void run() {
						while(true) {
							System.out.println("채팅 작업을 합니다.");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
							}
						}
					}	
				}; 
				thread3.start();
		
		while(true) {
			System.out.println("메인 작업을 합니다.");
			try {
				Thread.sleep(1000);//현재 실행하는 스레드를 잠깐 멈춰라. 1초 쉬고 다시 실행하고
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		}

	}

}
