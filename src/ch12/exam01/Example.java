package ch12.exam01;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� ������ ����");
		
		//��Ʈ��ũ �۾��� �ϴ� ������ ������ ����
		Thread thread1 = new Thread(new NetworkTask()); //�ڵ�Ÿ�Ժ�ȯ
		thread1.start(); //������1 ������~
		
		//���� �۾��� �ϴ� ������ ������ ����
		Thread thread2 = new Thread(new MusicTask()); //������ ��ü�� run()�� ����
		thread2.start(); //������2 ������~ => �����ϴ� �ڵ�� MusicTastk.java���� run()�� ����
		
		//->������ : ����� �������̽��� ����ϴ� ��ü���� �� ����� �� �־
		
		//ä�� �۾��� �ϴ� ������ ������ ����
		Thread thread3 = new Thread(new Runnable() { //�ƿ� ����ٰ� ��ü�� ��������
			//�������̽��� new ��� �ٿ����� -> 
			//�ؼ�) ������̶�� �������̽��� ������ Ŭ������ �����ϰ� ���� new�� ��ü�� ����� 
			//=> �͸�����ü : Ŭ������ �̸��� ������ �����ؼ� ����� ��ü�� �����ϰڴ�
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
		}); 
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
