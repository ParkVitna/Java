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
			System.out.println("1.목록|2.생성(Create)|3.읽기(Read)|4.수정(Update)|5.삭제(Delete)|6.종료");
			System.out.println("-------------------------------------------------------------------");
			System.out.print("메뉴선택: ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {//목록 (X)
					System.out.println("------------------------------");
					System.out.println("번호| 제목 | 내용 | 글쓴이 | 조회수");
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
				
				
			}else if(selectNo == 2) {//생성 (O)
				index++;
				
				System.out.print("제목: ");
				title = scanner.nextLine();
				System.out.print("내용: ");
				content = scanner.nextLine();
				System.out.print("글쓴이: ");
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
				
				//보여주기
				System.out.println("------------------------------");
				System.out.println("번호| 제목 | 내용 | 글쓴이 | 조회수");
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

				
			}else if(selectNo == 3) {//읽기 (O)
				System.out.print("번호: ");
				int readIndex = Integer.parseInt(scanner.nextLine());
				
				for(int i=0; i<boardArray.length; i++) {
					if( boardArray[i][0].equals(String.valueOf(readIndex))) {
						count = Integer.parseInt(boardArray[i][4]);
						count++;
						boardArray[i][4] = String.valueOf(count);
						
						System.out.print("제목: ");
						System.out.println(boardArray[i][1]);
						System.out.print("내용: ");
						System.out.println(boardArray[i][2]);
						System.out.print("글쓴이: ");
						System.out.println(boardArray[i][3]);
						System.out.print("조회수: ");
						System.out.println(boardArray[i][4]);
						
					}
					break;
				}
				
				//보여주기
				System.out.println("------------------------------");
				System.out.println("번호| 제목 | 내용 | 글쓴이 | 조회수");
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
				
			}else if(selectNo == 4) {//수정 (O)
				System.out.print("번호: ");
				int updateIndex = Integer.parseInt(scanner.nextLine());
				for(int i=0; i<boardArray.length; i++) {
					if( boardArray[i][0].equals(String.valueOf(updateIndex))) {
						
						System.out.println("기존제목: " + boardArray[i][1]);
						System.out.print("수정제목: ");
						boardArray[i][1] = scanner.nextLine();
						System.out.println("기존내용: " + boardArray[i][2]);
						System.out.print("수정내용: ");
						boardArray[i][2] = scanner.nextLine();
						
					}
					break;
				}
				
				//보여주기
				System.out.println("------------------------------");
				System.out.println("번호| 제목 | 내용 | 글쓴이 | 조회수");
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
				
			}else if(selectNo == 5) {//삭제 (-> 목록 나오게)
				System.out.print("번호: ");
				int deleteIndex = Integer.parseInt(scanner.nextLine());
				for(int i=0; i<boardArray.length; i++) {
					if( boardArray[i][0].equals(String.valueOf(deleteIndex))) {
						for(int j=0; j<5; j++) {
							boardArray[i][j] = null;
						}
						break;
					}
				}
				
			}else if(selectNo == 6) {//종료 (O)
				run = false;
			}
			
		}
		
		
		System.out.println("프로그램 종료");

	}

}
