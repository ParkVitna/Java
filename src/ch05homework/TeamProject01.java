package ch05homework;

import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class TeamProject01 {

	public static void main(String[] args) {
		boolean run  = true;
		int index = 0;
		int count = 0;
		String title;
		String content;
		String writer;
		String[][] boardArray = new String[100][5];
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------------------------------");
			System.out.println("1.���|2.����(Create)|3.�б�(Read)|4.����(Update)|5.����(Delete)|6.����");
			System.out.println("-------------------------------------------------------------------");
			System.out.print("�޴�����: ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {//��� (X)
					System.out.println("------------------------------");
					System.out.println("��ȣ| ���� | ���� | �۾��� | ��ȸ��");
					System.out.println("------------------------------");
					
					
					int listIndex = index;
					
					for(int j=listIndex; j>0; j--) {
						for(int i=0; i<boardArray.length; i++) {
							if(boardArray[i][0]==null) {
								continue;
							}else if(boardArray[i][0].equals(String.valueOf(listIndex))) {
									System.out.print(boardArray[i][0] +"\t");
					                System.out.print(boardArray[i][1] +"\t");
					                System.out.print(boardArray[i][2] +"\t");
					                System.out.print(boardArray[i][3] +"\t");
					                System.out.println(boardArray[i][4] +"\t");
					                break;
							}
						}
					}
					
					
					/*
					// ������ idea
					int[] check = new int[100]; //�������� [][0] �迭 ���� ����
					for(int i=0; i<boardArray.length; i++) {
						if(boardArray[i][0]==null) { //nullPointerException �ذ� ����
							continue;
						}
						int max = 0; //check�迭�� �ִ밪 �ʱⰪ 0
						int index01 = -1; // �� -> 0�̳� 1�� �ƴ� �� �ֱ�
						for(int j=0; j<boardArray.length; j++) {
							if(boardArray[j][0]==null) {
								continue;
							}
							int num = Integer.parseInt(boardArray[j][0]); //null�� �ƴ� ó�� ���� [][0]�� ����
							if(max<=num && check[j]==0) { //check�迭�� int Ÿ������ �ʱⰪ 0
								max = num;
								index = j; //
							}
						}
						
						if(index!=-1) { //�ٷ� �� for�� ���������鼭 ������������ index return
						 System.out.print(boardArray[index][0] + "\t");
		                 System.out.print(boardArray[index][1] + "\t");
		                 System.out.print(boardArray[index][2] + "\t");
		                 System.out.print(boardArray[index][3] + "\t");
		                 System.out.println(boardArray[i][4]);
						 check[index]=1; //�ִ밪 ����ϰ� ���� 1�� �����ؼ� ���� �ִ밪 ���Ҽ� �ְ�
						}
					}
					*/
					
					
					
				
				
				
			}else if(selectNo == 2) {//���� (O)
				index++;
				
				System.out.print("����: ");
				title = scanner.nextLine();
				System.out.print("����: ");
				content = scanner.nextLine();
				System.out.print("�۾���: ");
				writer = scanner.nextLine();
				
				for(int i=0; i<boardArray.length; i++) {
					if(boardArray[i][0] == null) {
		                  boardArray[i][0] = String.valueOf(index);
		                  boardArray[i][1] = title;
		                  boardArray[i][2] = content;
		                  boardArray[i][3] = writer;
		                  boardArray[i][4] = "0";
		                  break;
		               }

				}
				
				//�����ֱ�
				System.out.println("------------------------------");
				System.out.println("��ȣ| ���� | ���� | �۾��� | ��ȸ��");
				System.out.println("------------------------------");
				
				for(int i =0; i<boardArray.length; i++) {
		               if(boardArray[i][0] != null) {

		                  System.out.print(boardArray[i][0] + "\t");
		                  System.out.print(boardArray[i][1] + "\t");
		                  System.out.print(boardArray[i][2] +"\t");
		                  System.out.print(boardArray[i][3] +"\t");
		                  System.out.println(boardArray[i][4]);
		               }
		               else {
		                  continue;
		               }
		            }

				
			}else if(selectNo == 3) {//�б� (O)
				System.out.print("��ȣ: ");
				int readIndex = Integer.parseInt(scanner.nextLine());
				
				for(int i=0; i<boardArray.length; i++) {
					if(boardArray[i][0]==null) {
						continue;
					}else if( boardArray[i][0].equals(String.valueOf(readIndex))) {
							count = Integer.parseInt(boardArray[i][4]);
							count++;
							boardArray[i][4] = String.valueOf(count);
							
							System.out.print("����: ");
							System.out.println(boardArray[i][1]);
							System.out.print("����: ");
							System.out.println(boardArray[i][2]);
							System.out.print("�۾���: ");
							System.out.println(boardArray[i][3]);
							System.out.print("��ȸ��: ");
							System.out.println(boardArray[i][4]);
							break;
						}
					
				}
				
				//�����ֱ�
				System.out.println("------------------------------");
				System.out.println("��ȣ| ���� | ���� | �۾��� | ��ȸ��");
				System.out.println("------------------------------");
				
				for(int i =0; i<boardArray.length; i++) {
		               if(boardArray[i][0] != null) {

		                  System.out.print(boardArray[i][0] + "\t");
		                  System.out.print(boardArray[i][1] + "\t");
		                  System.out.print(boardArray[i][2] +"\t");
		                  System.out.print(boardArray[i][3] +"\t");
		                  System.out.println(boardArray[i][4]);
		               }
		               else {
		                  continue;
		               }
		            }
				
			}else if(selectNo == 4) {//���� (O)
				System.out.print("��ȣ: ");
				int updateIndex = Integer.parseInt(scanner.nextLine());
				for(int i=0; i<boardArray.length; i++) {
					if(boardArray[i][0]==null) {
						continue;
					}else if( boardArray[i][0].equals(String.valueOf(updateIndex))) {
							
							System.out.println("��������: " + boardArray[i][1]);
							System.out.print("��������: ");
							boardArray[i][1] = scanner.nextLine();
							System.out.println("��������: " + boardArray[i][2]);
							System.out.print("��������: ");
							boardArray[i][2] = scanner.nextLine();
							break;
						}
				
				}
				
				//�����ֱ�
				System.out.println("------------------------------");
				System.out.println("��ȣ| ���� | ���� | �۾��� | ��ȸ��");
				System.out.println("------------------------------");
				
				for(int i =0; i<boardArray.length; i++) {
		               if(boardArray[i][0] != null) {

		                  System.out.print(boardArray[i][0] + "\t");
		                  System.out.print(boardArray[i][1] + "\t");
		                  System.out.print(boardArray[i][2] +"\t");
		                  System.out.print(boardArray[i][3] +"\t");
		                  System.out.println(boardArray[i][4]);
		               }
		               else {
		                  continue;
		               }
		            }
				
			}else if(selectNo == 5) {//���� (X)
				System.out.print("��ȣ: ");
				int deleteIndex = Integer.parseInt(scanner.nextLine());
				for(int i=0; i<boardArray.length; i++) {
					if(boardArray[i][0]==null) {
						continue;
					}else if( boardArray[i][0].equals(String.valueOf(deleteIndex))) {
							for(int j=0; j<5; j++) {
								boardArray[i][j] = null;
							}
							break;
						}
					
				}
				
				//��� �����ֱ�
				//�����ֱ�
				System.out.println("------------------------------");
				System.out.println("��ȣ| ���� | ���� | �۾��� | ��ȸ��");
				System.out.println("------------------------------");
				
				for(int i =0; i<boardArray.length; i++) {
		               if(boardArray[i][0] != null) {

		                  System.out.print(boardArray[i][0] + "\t");
		                  System.out.print(boardArray[i][1] + "\t");
		                  System.out.print(boardArray[i][2] +"\t");
		                  System.out.print(boardArray[i][3] +"\t");
		                  System.out.println(boardArray[i][4]);
		               }
		               else {
		                  continue;
		               }
		            }
				
				
			}else if(selectNo == 6) {//���� (O)
				run = false;
			}
			
		}
		
		System.out.println("���α׷� ����");

	}

}
