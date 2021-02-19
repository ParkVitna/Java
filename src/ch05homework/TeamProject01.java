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
			System.out.println("1.목록|2.생성(Create)|3.읽기(Read)|4.수정(Update)|5.삭제(Delete)|6.종료");
			System.out.println("-------------------------------------------------------------------");
			System.out.print("메뉴선택: ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {//목록 (X)
					System.out.println("------------------------------");
					System.out.println("번호| 제목 | 내용 | 글쓴이 | 조회수");
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
					// 강병주 idea
					int[] check = new int[100]; //내림차순 [][0] 배열 따로 만듬
					for(int i=0; i<boardArray.length; i++) {
						if(boardArray[i][0]==null) { //nullPointerException 해결 위함
							continue;
						}
						int max = 0; //check배열의 최대값 초기값 0
						int index01 = -1; // 왜 -> 0이나 1이 아닌 값 주기
						for(int j=0; j<boardArray.length; j++) {
							if(boardArray[j][0]==null) {
								continue;
							}
							int num = Integer.parseInt(boardArray[j][0]); //null이 아닌 처음 만난 [][0]값 저장
							if(max<=num && check[j]==0) { //check배열은 int 타입으로 초기값 0
								max = num;
								index = j; //
							}
						}
						
						if(index!=-1) { //바로 위 for문 빠져나오면서 내림차순으로 index return
						 System.out.print(boardArray[index][0] + "\t");
		                 System.out.print(boardArray[index][1] + "\t");
		                 System.out.print(boardArray[index][2] + "\t");
		                 System.out.print(boardArray[index][3] + "\t");
		                 System.out.println(boardArray[i][4]);
						 check[index]=1; //최대값 출력하고 나면 1로 저장해서 다음 최대값 구할수 있게
						}
					}
					*/
					
					
					
				
				
				
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
					if(boardArray[i][0]==null) {
						continue;
					}else if( boardArray[i][0].equals(String.valueOf(readIndex))) {
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
				
			}else if(selectNo == 4) {//수정 (O)
				System.out.print("번호: ");
				int updateIndex = Integer.parseInt(scanner.nextLine());
				for(int i=0; i<boardArray.length; i++) {
					if(boardArray[i][0]==null) {
						continue;
					}else if( boardArray[i][0].equals(String.valueOf(updateIndex))) {
							
							System.out.println("기존제목: " + boardArray[i][1]);
							System.out.print("수정제목: ");
							boardArray[i][1] = scanner.nextLine();
							System.out.println("기존내용: " + boardArray[i][2]);
							System.out.print("수정내용: ");
							boardArray[i][2] = scanner.nextLine();
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
				
			}else if(selectNo == 5) {//삭제 (X)
				System.out.print("번호: ");
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
				
				//목록 보여주기
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
				
				
			}else if(selectNo == 6) {//종료 (O)
				run = false;
			}
			
		}
		
		System.out.println("프로그램 종료");

	}

}
