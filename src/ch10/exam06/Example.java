package ch10.exam06;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		try {
			String ano = null;
			account.deposit(ano, 1000); //�����Ϸδ� �˾�ä�� ���Ѵ� -> ���࿹�� (try ������)
		} catch(NoAccountException e) {
			System.out.println(e.getMessage()); //����ó��ǥ�ô� NoAccountException�� �˾Ƽ� �ϰ� �Ѱ�
		}
		
		String ano = "111-222-333";
		try {
			account.withdraw(ano, 1000); //�Ϲݿ��� �̱� ������ ���� (try catch ������)
			account.withdraw(ano, 1000000); //-> BalaceLackExample �߻�
		} catch (NoAccountException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());//=>�Աݰ��°������ϴ�.
		} catch (BalanceLackExample e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage()); //=>�ܰ������մϴ�.
		} 
		

	}

}
