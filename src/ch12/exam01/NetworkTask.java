package ch12.exam01;

public class NetworkTask implements Runnable { //�������̽� Runnable ����

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("��Ʈ��ũ ����� �մϴ�.");
			try {
				Thread.sleep(1000);//���� �����ϴ� �����带 ��� �����. 1�� ���� �ٽ� �����ϰ�
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		}
		
	} 

}