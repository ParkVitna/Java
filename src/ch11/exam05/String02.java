package ch11.exam05;

import java.util.StringTokenizer;

public class String02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "123456-1234567"; //7��° ���� ���� �˰� �ʹ�
		
		//� ��ġ�� ���� 1���� ���
		char sex = ssn.charAt(7);
		if(sex == '1' || sex == '3') {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
		//���ڿ� �߶󳻱�
		//���1
		String first = ssn.substring(0, 6);
		String second = ssn.substring(7);
		System.out.println(first);
		System.out.println(second);
		
		//���2
		String[] parts = ssn.split("-"); //�����ڷ� ���еǾ� �ִ� ��ū���� �迭�� ��Ƽ� ����
		System.out.println(parts[0]);
		System.out.println(parts[1]);
		
		//���Կ���
		//���1
		String content = "�̰��� �ڹ� å�Դϴ�.";
		boolean result = content.contains("�ڹ�"); //true
		System.out.println(result);
		
		//���2
		int index = content.indexOf("�ڹ�"); //���ϰ� ����, �� ���ڿ��� �����ϴ� �ε����� ����. �ش� ���ڿ��� ������ -1 ����
		if(index != -1) {
			System.out.println("�ڹ� ���� å�̱���.");
		}else {
			System.out.println("�ڹ� ���� å�� �ƴϱ���.");
		}
		
		//���3(���ڿ� �и��ϱ�)
		StringTokenizer st = new StringTokenizer(ssn, "-"); //���ڿ��� �����ؼ� Ư�� ~~
		while(st.hasMoreTokens()) {
			String token = st.nextToken(); //�� �̻� �����ð� ������ st.hasMoreTokens()�� false�� �Ǿ while�� ��������
		}
		/* while�� ���� �ϴ� ���
		first = st.nextToken();
		second = st.nextToken();
		String third = st.nextToken(); //�� ������ ���� ������ ������
		*/
		
		
		
		
		//���ڿ��� ����
		int length = content.length();
		System.out.println(length);
		
		//��ġ�ϱ�
		//����� �ٲٰ� �ʹ�
		//���ڿ��� �Һ�, �ѹ� �����Ǹ� �ٲ� �� ����
		String modifiedContent = content.replace("�ڹ�", "Java"); //���� ���ڿ� content�� �ٲ�� ���� �ƴ�.
		System.out.println(modifiedContent);
		
		

	}

}
