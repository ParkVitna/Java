package ch07.exam04;

public class HomeActivity extends Activity{
	//Field
	
	//Constructor
	public HomeActivity() {
		super();
	}
	
	//Method
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate(); //=> �θ��� �ڵ带 ������ (�� 2�� �����)
		//System.out.println("�⺻������ ȭ���� �����ֱ� ���� ������ �մϴ�.");
		//System.out.println("�� �ڵ�� �ݵ�� ������ �ؾ߸� ȭ���� ��Ÿ���ϴ�.");
		
		// �ڽĸ��� ������ �ִ� �޼ҵ�
		System.out.println("�ڽ��� UI ��Ҹ� �����մϴ�.");
		System.out.println("�ڽ��� UI ����� �̺�Ʈ�� ó���մϴ�.");
	}

}
