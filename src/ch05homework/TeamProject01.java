package ch05homework;

import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class TeamProject01 {

	public static void main(String[] args) {
		boolean run  = true;
		int index = 1;
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
					
					for(int i=0; i<boardArray.length; i++) {
						for(int j=index; j>0; j--) {
							if(boardArray[i][0].equals(index)) {
								System.out.print(boardArray[i][0] +"\t");
				                System.out.print(boardArray[i][1] +"\t");
				                System.out.print(boardArray[i][2] +"\t");
				                System.out.print(boardArray[i][3] +"\t");
				                System.out.println(boardArray[i][4] +"\t");
							}
						}
						System.out.println();
						break;
					}
				
				
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
					if( boardArray[i][0].equals(String.valueOf(readIndex))) {
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
						
					}
					break;
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
					if( boardArray[i][0].equals(String.valueOf(updateIndex))) {
						
						System.out.println("��������: " + boardArray[i][1]);
						System.out.print("��������: ");
						boardArray[i][1] = scanner.nextLine();
						System.out.println("��������: " + boardArray[i][2]);
						System.out.print("��������: ");
						boardArray[i][2] = scanner.nextLine();
						
					}
					break;
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
				
			}else if(selectNo == 5) {//���� (-> ��� ������)
				System.out.print("��ȣ: ");
				int deleteIndex = Integer.parseInt(scanner.nextLine());
				for(int i=0; i<boardArray.length; i++) {
					if( boardArray[i][0].equals(String.valueOf(deleteIndex))) {
						for(int j=0; j<5; j++) {
							boardArray[i][j] = null;
						}
						break;
					}
				}
				
			}else if(selectNo == 6) {//���� (O)
				run = false;
			}
			
		}
		
		
		System.out.println("���α׷� ����");

	}

}
