package ch10.exam06;

public class Account {
	public void deposit(String account, int money) throws NoAccountException {
		if(account == null) {
			//���� �߻� �ڵ� -> �� ������ ���ܰ� �߻��ߴ� �˷��� (����ó���� ����ϴ� ������ �ϰ� �ϱ� ����) -> ����ó���� �پ��ϰ� �ϱ� ���ؼ�
			throw new NoAccountException("�Ա� ���°� �����ϴ�."); //NoAccountException(String message)�� ������ ����
		}
		
		System.out.println("�Ա� ����");
	}
	
	public void withdraw(String account, int money) throws NoAccountException, BalanceLackExample {
		int balance = 10000;
		//���� ���� (����1), ���� �ܾ׺��� ���� �ݾ� �� �� ���� (����2, �ܰ����)
		if(account == null) {
			//���� �߻� �ڵ�
			throw new NoAccountException("��� ���°� �����ϴ�.");
		}else if(money > balance) {
			throw new BalanceLackExample("�ܰ� �����մϴ�."); //BalanceLackException �߸�ħ�Ф�
		}else {
			System.out.println("��� ����");
		}
	}

}
