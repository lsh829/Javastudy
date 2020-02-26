package test0226;

import java.util.Stack;

//STACK : LIFO 구조
public class Ex2Stack {
	public static void main(String[] args) {
		//Stack : Vector 의 하위클래스
		//Stack은 부모클래스가 Vector이다.
		//하지만, Vector기능을 사용하지 않는 것이 좋다.
		Stack<String> st = new Stack<>();
		
		//Stack에 데이터 추가 -push()
		st.push("검정"); //추가
		st.push("노랑");
		st.push("녹색");
		st.push("청색");
		st.push("빨강");
		
		//Stack 데이터 가져오기 
		//pop() : top 요소 반환 후 삭제
		//peek() : top 요소 반환 후 삭제하지 않음.
		while(! st.empty()) {
			String s = st.pop(); //스택 top요소 반환 후 삭제
			System.out.print(s+" ");
		}
		System.out.println();
	}
}
