package ch03;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//연산의 결과라 boolean 타입으로 나오는 연산기호
		
		int var1 = 2;
		int var2 = 3;
		
		boolean var3 = var1 == var2; // == 값이 같냐? 같지 않으므로 false
		boolean var4 = var1 != var2; // != 값이 다르냐? 같지 않으므로 true
		boolean var5 = var1 > var2; // false
		boolean var6 = var1 >= var2; // false
		boolean var7 = var1 < var2; //true
		boolean var8 = var1 <= var2; //true
		boolean var9 = !(var1 == var2); // !(false) => true
		boolean var10 = (var1 == var2) || (var1 < var2); // false ||(or) true => true
		boolean var11 = (var1 == var2) && (var1 < var2); // false &&(and) true => false

	}

}
