package ch12.exam02;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� ������ ����");
		
		//��Ʈ��ũ �۾��� �ϴ� ������ ������ ����
		Thread thread1 = new NetworkTask();// �� ��ü�� ������ �̱� ������ ������ �����带 ���� �ʿ� ����
		thread1.start(); //������1 ������~
		
		//���� �۾��� �ϴ� ������ ������ ����
		Thread thread2 = new MusicTask();
		thread2.start(); //������2 ������~ => �����ϴ� �ڵ�� MusicTastk.java���� run()�� ����
		
		//->������ : ����� �������̽��� ����ϴ� ��ü���� �� ����� �� �־
		
		//ä�� �۾��� �ϴ� ������ ������ ����
				Thread thread3 = new Thread() { //�����带 ����ؼ� ���� Ŭ������ ���� ������ ��ü�� ����� => �͸��ڽİ�ü
					public void run() {
						while(true) {
							System.out.println("ä�� �۾��� �մϴ�.");
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
			System.out.println("���� �۾��� �մϴ�.");
			try {
				Thread.sleep(1000);//���� �����ϴ� �����带 ��� �����. 1�� ���� �ٽ� �����ϰ�
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		}

	}

}
