package ch12.exam02;

public class MusicTask extends Thread { //스레드의 자식클래스 만듬

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("뮤직을 연주 합니다.");
			try {
				Thread.sleep(1000);//현재 실행하는 스레드를 잠깐 멈춰라. 1초 쉬고 다시 실행하고
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		}
		
	} 

}
