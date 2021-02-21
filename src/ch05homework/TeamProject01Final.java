package ch05homework;
import java.util.Scanner;

public class TeamProject01Final {
public static void main(String[] args) {
		
		String[][] boardArray = new String[100][5]; //�Խù� �迭
		
		Scanner scanner = new Scanner(System.in);
		int count=0; // �Խù� ��ȣ
		
		while(true) { //true����, false���� //�޴����
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("1. ��� | 2. ����(Create) | 3. �б�(Read) | 4. ����(Update) | 5. ����(Delete) | 6. �α�� TOP5 |  7. ����");
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.print("�޴�����: ");
			
			String selectNo = scanner.nextLine(); //����ڰ� ������ �޴� ��ȣ�� ����
			
			
			if(selectNo.equals("1")) { //���

				//�� �Խù� �� ���ϱ�
				int boardCount = 0 ; //�� �Խù� ����
				for(int i=0; i < boardArray.length; i++) {
					if(boardArray[i][0] != null) { //�Խù��� �ִ� ��� +1
						boardCount++;
					}
					
				}
				System.out.println("------------------------------------------------------------------------------------------------");
				System.out.println("�� �Խù� �� : " + boardCount);
				System.out.println("------------------------------------------------------------------------------------------------");
				
				System.out.print("��ȣ" + "\t");
				System.out.print("����" + "\t\t\t\t" );
				System.out.print("����" + "\t\t\t\t");
				System.out.print("�۾���" + "\t\t");
				System.out.print("��ȸ��" + "\t\n");
				System.out.println("------------------------------------------------------------------------------------------------");
				
				int[] check = new int[100]; // ����� �Խù����� �ƴ��� check�ϴ� �迭 (0,1�θ� ����)
				for(int i=0;i<boardArray.length;i++) { // �Խù��� ����� for ��
					if(boardArray[i][0]==null) { // �Խù��� null�� ��� nullPointerException �ذ� ����
						continue;
					}
					int max = 0; //���� ū �Խ��� ��ȣ �ʱⰪ 0
					int index = -1;   //�Խ��� ��ȣ�� ���� Ŭ ���� �迭 �ε��� (0�̳� 1�� �ƴ� �ٸ� ���� �Է�, -1�� ������)
					for(int j=0;j<boardArray.length;j++) {//���� ū �Խ��� ��ȣ�� ã�� ���� for��
						if(boardArray[j][0]==null) { // �Խù��� null�� ���
							continue;
						}
						int num = Integer.parseInt(boardArray[j][0]); // ���� �Խ��� ��ȣ
						if(max<=num && check[j]==0) { //�Խ��� ��ȣ�� ���� ū �� && ��¾���
							max=num; //�Խ��� ��ȣ�� max�� ����
							index=j; //�Խ��� ��ȣ�� ���� ū �迭 �ε��� 
						}
					}
					
					if(index!=-1) { //����� �Խù��� �ִ°�? 
						System.out.print(boardArray[index][0] + "\t");
						System.out.print(boardArray[index][1] + "\t\t\t\t" );
						System.out.print(boardArray[index][2] + "\t\t\t\t");
						System.out.print(boardArray[index][3] + "\t\t");
						System.out.print(boardArray[index][4] + "\t\n");
						check[index]=1; //��������� 1 -> �� �������� ū �Խ��ǹ�ȣ ã�� �� ����
					}
					
				}			
				
				
			} else if(selectNo.equals("2")) { //����
				System.out.print("����: ");
				String title = scanner.nextLine();
				System.out.print("����: ");
				String content = scanner.nextLine();
				System.out.print("�۾���: ");
				String writer = scanner.nextLine();
				
				for(int i=0;i<boardArray.length;i++) {
					if(boardArray[i][0]==null) { //boardArray���� ���� ���� ������ null �κп� �����ϱ� ����
						count++; // ������ �� ī��Ʈ +1 (�Խù� ��ȣ)
						String[] arr = { //����ڷκ��� ���� String�� ������ �迭�� ����
								String.valueOf(count),
								title,
								content,
								writer,
								"0"
						};
						
						boardArray[i] = arr; // arr�� boardArray�� ����
						break; //����(����) for�� ����
					}
				}
				
				//��Ϻ���
				//�� �Խù� �� ���ϱ�
				int boardCount = 0 ;
				for(int i=0; i < boardArray.length; i++) {
					if(boardArray[i][0] != null) {
						boardCount++;
					}
					
				}
				System.out.println("------------------------------------------------------------------------------------------------");
				System.out.println("�� �Խù� �� : " + boardCount);
				System.out.println("------------------------------------------------------------------------------------------------");
				
				System.out.print("��ȣ" + "\t");
				System.out.print("����" + "\t\t\t\t" );
				System.out.print("����" + "\t\t\t\t");
				System.out.print("�۾���" + "\t\t");
				System.out.print("��ȸ��" + "\t\n");
				System.out.println("------------------------------------------------------------------------------------------------");
				
				int[] check = new int[100];
				for(int i=0;i<boardArray.length;i++) {
					if(boardArray[i][0]==null) {
						continue;
					}
					int max = 0;
					int index = -1;
					for(int j=0;j<boardArray.length;j++) {
						if(boardArray[j][0]==null) {
							continue;
						}
						int num = Integer.parseInt(boardArray[j][0]);
						if(max<=num && check[j]==0) {
							max=num;
							index=j;
						}
					}
					
					if(index!=-1) {
						System.out.print(boardArray[index][0] + "\t");
						System.out.print(boardArray[index][1] + "\t\t\t\t" );
						System.out.print(boardArray[index][2] + "\t\t\t\t");
						System.out.print(boardArray[index][3] + "\t\t");
						System.out.print(boardArray[index][4] + "\t\n");
						check[index]=1;
					}
					
				}			
				

				
			} else if(selectNo.equals("3")) { //�б�
				System.out.print("��ȣ: ");
				String number = scanner.nextLine(); //����ڷκ��� ���� �Խù� ��ȣ�� ����
				int i2 = -1; // �Խù��� �ִ��� ������(-1) üũ, �Խù� ��ȣ�� ����ڰ� �Է��� ��ȣ�� ��ġ�ϸ� �ε��� ������ ����
				int hits; //��ȸ��
				for(int i=0;i<boardArray.length;i++) {
					if(boardArray[i][0]==null) { //null�̸� continue ��++(���� �Խñ� ��ȣ Ž��)
						continue;
					}
					else if(boardArray[i][0].equals(number)) { //�Է¹�ȣ(int->String ��ȯ��)�� �Խù� ��ȣ(String)�� ������
						i2=i; //�ش� �Խù� �ε��� ����
					}
				}
				
				if(i2==-1) { //�Խù��� ���� ��
					System.out.println("�Խù��� �������� �ʽ��ϴ�.");
				} else {
					System.out.println("����: " + boardArray[i2][1]);
					System.out.println("����: " + boardArray[i2][2]);
					System.out.println("�۾���: " + boardArray[i2][3]);
					hits = Integer.parseInt(boardArray[i2][4]); //boardArray�� ����� ��ȸ��(String->int ��ȯ��) hits�� ����
					hits++; //��ȸ�� +1
					boardArray[i2][4]=String.valueOf(hits); //boardArray�� ������ ��ȸ�� ����
					System.out.println("��ȸ��: " + boardArray[i2][4]);
				}
				
				
				
			} else if(selectNo.equals("4")) { //����
				System.out.print("��ȣ: ");
				String number = scanner.nextLine();
				int i2 = -1; // �Խù��� �ִ��� ������(-1) üũ, �Խù� ��ȣ�� ����ڰ� �Է��� ��ȣ�� ��ġ�ϸ� �ε��� ������ ����
				for(int i=0;i<boardArray.length;i++) {
					if(boardArray[i][0]==null) {
						continue;
					}
					else if(boardArray[i][0].equals(number)) { //�Է¹�ȣ(int->String ��ȯ��)�� �Խù� ��ȣ(String)�� ������
						i2=i; //�ش� �Խù� �ε��� ����
					}
				}
				
				if(i2==-1) { //�Խù��� ���� ��
					System.out.println("�Խù��� �������� �ʽ��ϴ�.");
				} else {
					System.out.println("��������: " + boardArray[i2][1]); //���� ���� ���
					System.out.print("��������: ");
					String title = scanner.nextLine(); //������ ���� �޾ƿ�
					if(!title.equals("")) { //������ ������ ������ �ƴ� ���
						boardArray[i2][1]=title; //�Խù��� ���� ����
					}
					System.out.println("��������: " + boardArray[i2][2]);
					System.out.print("��������: ");
					String content = scanner.nextLine();
					if(!content.equals("")) {
						boardArray[i2][2]=content;
					}
					
					// ��Ϻ����ֱ�
					// �� �Խù� ���� ���ϱ�
					int boardCount = 0 ;
					for(int i=0; i < boardArray.length; i++) {
						if(boardArray[i][0] != null) {
							boardCount++;
						}
						
					}
					System.out.println("------------------------------------------------------------------------------------------------");
					System.out.println("�� �Խù� �� : " + boardCount);
					System.out.println("------------------------------------------------------------------------------------------------");
					
					System.out.print("��ȣ" + "\t");
					System.out.print("����" + "\t\t\t\t" );
					System.out.print("����" + "\t\t\t\t");
					System.out.print("�۾���" + "\t\t");
					System.out.print("��ȸ��" + "\t\n");
					System.out.println("------------------------------------------------------------------------------------------------");
					
					int[] check = new int[100];
					for(int i=0;i<boardArray.length;i++) {
						if(boardArray[i][0]==null) {
							continue;
						}
						int max = 0;
						int index = -1;
						for(int j=0;j<boardArray.length;j++) {
							if(boardArray[j][0]==null) {
								continue;
							}
							int num = Integer.parseInt(boardArray[j][0]);
							if(max<=num && check[j]==0) {
								max=num;
								index=j;
							}
						}
						
						if(index!=-1) {
							System.out.print(boardArray[index][0] + "\t");
							System.out.print(boardArray[index][1] + "\t\t\t\t" );
							System.out.print(boardArray[index][2] + "\t\t\t\t");
							System.out.print(boardArray[index][3] + "\t\t");
							System.out.print(boardArray[index][4] + "\t\n");
							check[index]=1;
						}
						
					}			
						
					
				}
				

				
				
				
			} else if(selectNo.equals("5")) { //����
				System.out.print("��ȣ: ");
				String number = scanner.nextLine();
				int i2 = -1; //�Խù��� �ִ��� ������(-1) üũ, �Խù� ��ȣ�� ����ڰ� �Է��� ��ȣ�� ��ġ�ϸ� �ε��� ������ ����
				for(int i=0;i<boardArray.length;i++) {
					if(boardArray[i][0]==null) {
						continue;
					}
					else if(boardArray[i][0].equals(number)) { //�Է¹�ȣ(int->String ��ȯ��)�� �Խù� ��ȣ(String)�� ������
						i2=i; ////�ش� �Խù� �ε��� ����
					}
				}
				
				if(i2==-1) { //�Խù��� ���� ��
					System.out.println("�Խù��� �������� �ʽ��ϴ�.");
				} else {
					for(int j=0;j<boardArray[i2].length;j++) { //boardArray[i2].length -> 5
						boardArray[i2][j]=null; // ��� �Խù��� null ���� (����)
					}
					
					// ��Ϻ����ֱ�
					// �� �Խñ� ���� ���ϱ�
					int boardCount = 0 ;
					for(int i=0; i < boardArray.length; i++) {
						if(boardArray[i][0] != null) {
							boardCount++;
						}
						
					}
					System.out.println("------------------------------------------------------------------------------------------------");
					System.out.println("�� �Խù� �� : " + boardCount);
					System.out.println("------------------------------------------------------------------------------------------------");
					
					System.out.print("��ȣ" + "\t");
					System.out.print("����" + "\t\t\t\t" );
					System.out.print("����" + "\t\t\t\t");
					System.out.print("�۾���" + "\t\t");
					System.out.print("��ȸ��" + "\t\n");
					System.out.println("------------------------------------------------------------------------------------------------");
					
					int[] check = new int[100];
					for(int i=0;i<boardArray.length;i++) {
						if(boardArray[i][0]==null) {
							continue;
						}
						int max = 0;
						int index = -1;
						for(int j=0;j<boardArray.length;j++) {
							if(boardArray[j][0]==null) {
								continue;
							}
							int num = Integer.parseInt(boardArray[j][0]);
							if(max<=num && check[j]==0) {
								max=num;
								index=j;
							}
						}
						
						if(index!=-1) {
							System.out.print(boardArray[index][0] + "\t");
							System.out.print(boardArray[index][1] + "\t\t\t\t" );
							System.out.print(boardArray[index][2] + "\t\t\t\t");
							System.out.print(boardArray[index][3] + "\t\t");
							System.out.print(boardArray[index][4] + "\t\n");
							check[index]=1;
						}
						
					}			
				}
				
				
			} else if(selectNo.equals("6")) { // �߰����) �α�� Top5 �����ֱ�
				int topCount = 1; // 5���� ����ϱ� ���� ����
				int[] check = new int[100]; // ����� �Խù����� �ƴ��� check�ϴ� �迭 (0,1�θ� ����)
				System.out.println("------------------------------------------------------------------------------------------------------");
				System.out.print("����" + "\t");
				System.out.print("��ȣ" + "\t");
				System.out.print("����" + "\t\t\t\t" );
				System.out.print("����" + "\t\t\t\t");
				System.out.print("�۾���" + "\t\t");
				System.out.print("��ȸ��" + "\t\n");
				System.out.println("------------------------------------------------------------------------------------------------------");
				
				for(int i=0;i<boardArray.length;i++) {
					if(boardArray[i][0]==null) { //�Խù��� ���� ��� continue (���� �Խù���, i++)
						continue;
					} else {
						if (topCount > 5) { // �α�� 5���� �Ѿ��? ������(�� �̻� ã�� ����)
							break;
						} else {
							int max = 0; // ���� ū ��ȸ���� ������ ����
							int index = -1; //��ȸ���� ���� Ŭ ���� �迭 �ε��� (0�̳� 1�� �ƴ� �ٸ� ���� �Է�, -1�� ������)
							for(int j=0;j<boardArray.length;j++) {
								if(boardArray[j][4]==null) { //  ��ȸ���� null�̸� �Ѿ��
									continue;
								}
								int num = Integer.parseInt(boardArray[j][4]); // boardArray�� ����� ��ȸ��(String->int)
								if(max<=num && check[j]==0) { //��ȸ���� ���� ū �� && ��¾���
									max=num; //���� ū ��ȸ���� max�� ����
									index=j; //�ش� �Խù��� �ε����� ����
								}
							}
							
							if(index!=-1) { // ����� �Խù��� �ִ°�?
								if(boardArray[index][4].equals("0")) { // �Խù��� ��ȸ���� 0�̶�� �������� ����
									break;
								} else {
									System.out.print(topCount + "��\t");
									System.out.print(boardArray[index][0] + "\t");
									System.out.print(boardArray[index][1] + "\t\t\t\t" );
									System.out.print(boardArray[index][2] + "\t\t\t\t");
									System.out.print(boardArray[index][3] + "\t\t");
									System.out.print(boardArray[index][4] + "\t\n");
									check[index]=1; // ����� �Խù� üũ
									topCount++; // �α�� ���� �߰�
								}
								
							}
							
						}
					}
				
				}	

			} else if(selectNo.equals("7")) { //����
				System.out.println("���α׷� ����");
				break;
				
			} else { //�޴� 1~7 �� �ƴ� ���� �Է����� ���
				System.out.println("�ٽ� �������ּ���.");
			}
			
			System.out.println();
		}
		
	}
	
	
}
