package ch06.exam07;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardService bs = new BoardService(); //객체 생성 꼭!!
		
		int bno = bs.getNewBno();
		System.out.println(bno);
		
		bno = bs.getNewBno();
		System.out.println(bno);
		
		bs.save("제목1", "내용1");
		bs.save("제목2", "내용2");
		
		int[] arr = {1, 2, 3};
		int sum = bs.getSum(arr);
		System.out.println(sum);
		
		sum = bs.getSum(new int[] {1, 2, 3}); //new는 객체의 생성번지를 return 함
		System.out.println(sum);
		
		sum = bs.getSum2(1, 2, 3);
		sum = bs.getSum2(1, 2, 3, 4, 5);
		
	}
	
	
}
