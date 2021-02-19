package ch06.exam07;

public class BoardService {
	//Field
	int count;
	
	//Constructor
	
	//Method
	int getNewBno() {
		//int newBno = ++count; //newBno => 4
		//return newBno;
		return ++count;
	}
	
	void save(String title, String content){ //실행하고 끝나는 것, 받을 것 없다 -> void
		int bno = getNewBno(); //내부에서 쓸 때는 그냥 쓰면 됨.
		System.out.println(bno + "을 저장합니다.");
		System.out.println(title + "을 저장합니다.");
		System.out.println(content + "를 저장합니다.");
	}

	int getSum(int[] values) {
		int result = 0;
		for(int value : values) {
			result += value;
		}
		return result;
	}

	int getSum2(int ... values) {
		int result = 0;
		for(int value : values) {
			result += value;
		}
		return result;
	}
	
	
}
