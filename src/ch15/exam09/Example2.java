package ch15.exam09;
//큐
import java.util.LinkedList;
import java.util.Queue;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue =  new LinkedList<>();
		
		queue.offer("홍길동");
		queue.offer("홍길서");
		queue.offer("홍길남");
		
		while(!queue.isEmpty()) {
			String item = queue.poll();
			System.out.println(item); // => 동, 서, 남 순서로 출력
		}

	}

}
