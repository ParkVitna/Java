package ch07.exam04;

public class HomeActivity extends Activity{
	//Field
	
	//Constructor
	public HomeActivity() {
		super();
	}
	
	//Method
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate(); //=> 부모의 코드를 실행해 (밑 2줄 실행됨)
		//System.out.println("기본적으로 화면을 보여주기 위한 설정을 합니다.");
		//System.out.println("이 코드는 반드시 실행을 해야만 화면이 나타납니다.");
		
		// 자식만이 가지고 있는 메소드
		System.out.println("자식이 UI 요소를 생성합니다.");
		System.out.println("자식이 UI 요소의 이벤트를 처리합니다.");
	}

}
