package ch15.exam09;
//스택
import java.util.Stack;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<>();
		
		stack.push("홍길동");
		stack.push("홍길서");
		stack.push("홍길남");
		
		while(!stack.empty()) {
			String item = stack.pop();
			System.out.println(item); //=> 남, 서, 동 순서로 출력
		}

	}

}
