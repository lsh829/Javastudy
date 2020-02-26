package test0226;

//면접 기출 : Stack 클래스 만들기
//자바 내부 Stack 클래스와 완전히 똑같지는 않지만, Stack형태를 '자신'이 만들어본 클래스 이다.
public class MyStackApp {
	public static void main(String[] args) {
		MyStack<Integer> ms = new MyStackImpl<>(10);
		
		ms.push(10);
		ms.push(20);
		ms.push(30);
		
		while(! ms.isEmpty()) {
			int a = ms.pop();
			System.out.println(a);
		}
	}
}

//배열을 이용한 스택 만들기 (LIFO)
interface MyStack<E> {
	public E pop(); //top 데이터 가져오고 삭제
	public E peek(); //top 데이터 반환
	public void push(E data); //데이터 삽입
	public boolean isEmpty(); //비어있는지 확인 
}


class MyStackImpl<E> implements MyStack<E>{
	private E[] elementData;//E-제네릭
	private int top; //top위치
	
	//인자 있는 생성자
	@SuppressWarnings("unchecked")
	public MyStackImpl(int size) {
		elementData = (E[])new Object[size];
		top = 0;
	}
	
	
	@Override
	public E pop() {
		if(isEmpty()) {//만약에 데이터가 없으면,
			throw new RuntimeException("stack empty"); //RuntimeException처리
		}
		E item = peek();
		elementData[--top] = null;
		return item; 
	}

	@Override
	public E peek() {
		if(isEmpty()) {//만약에 데이터가 없으면,
			throw new RuntimeException("stack empty"); //RuntimeException처리
		}
		return elementData[top-1]; //최상단의 데이터 반환
	}

	@Override
	public void push(E data) {
		if(top >= elementData.length) {
			throw new RuntimeException("stack full");
		}
		elementData[top++] = data;
		
		
	}

	@Override
	public boolean isEmpty() {
		// top이 0이면 Empty(비어있는 상태)이다. 
		return top <=0 ;
	}
	
}