package ch10.exam06;
//����� ���� ���� Ŭ����
public class BalanceLackExample extends Exception { //�Ϲݿ��� ���
	public BalanceLackExample() {} //�⺻ ������
	public BalanceLackExample(String message) { //�ܺο��� ���� �޼����� �޾Ƽ� (���� ��ü ������)
		super(message); //�θ��� ������ ȣ��
	}

}
