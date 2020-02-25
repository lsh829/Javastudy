package test0220;
//정렬
//	selection sort 하는 프로그램을 짜시오. 
//	1) 추상화 작업 
//		필드 : value[]=>int
//		메소드 : 
//			1. 정렬 
//			2. 비교
//			3. 바꾸기
//			4. 길이

//	bubble sort 하는 프로그램을 짜시오. 
//	1) 추상화 작업 
//		필드 : value[]=>int
//		메소드 : 
//			1. 정렬 
//			2. 비교
//			3. 바꾸기
//			4. 길이

// --어떠한 sort를 쓴다 할지라도, 공통되는 필드와 메소드가 있다. 
// 메소드안의 방법만 바꿔주면 되는 것이다. 
// bubble > selection을 상속받아서 정렬을 바꿔주면 되는 것 아닐까??

// sort
//	필드 : value[]=>int
//	메소드 : 
//		1. 정렬  abstract
//		2. 비교
//		3. 바꾸기
//		4. 길이
// *** 메소드는 필요하지만, 구현하지 않는 것..  = "추상메소드"

//selection : sort
//	 필드
//	메소드 
//		정렬 구현

// bubble 
//	필드
//	메소드
//		정렬구현


// 추상 메소드를 하나라도 가지고 있으면 추상 클래스로 만들어야 한다. 
// 반드시 자식이 존재해야만 한다.
// 필요한 건 짜고 바뀔 것 같은 건 이름만 정해준다. 
// ===============================추상클래스
public class Ex4Abstract {
	public static void main(String[] args) {
		int[] nn = {25,10,5,89,70,55};
		
		//SortInt aa = new SortInt(); //컴오류 , 추상클래스 객체 생성 불가
		SortInt ss = new BubbleSort();
		//SortInt ss = new SelectionSort();
		
		//정렬 전
		System.out.println("source data:");
		for(int n : nn) {
			System.out.println(n+" ");
		}System.out.println();
		
		ss.sort(nn);
		
		//정렬 후
		System.out.println("sort data:");
		for(int n : nn) {
			System.out.println(n+" ");
		}System.out.println();
		
		ss.sort(nn);
	}
}

//추상클래스는 어떠한 경우에도 new가 안되고, 자식이 있어야만 한다. 
abstract class SortInt {
	private int[] value;
	protected abstract void sorting(); //추상메소드
	//추상클래스는 추상메소드 없이 실행 가능
	public void sort(int[] value) {
		this.value = value;
		sorting();
	}
	
	protected int length() {
		return value == null ? -1 : value.length;
	}
	
	protected final int compare(int i, int j) {
		return value[i] - value[j];
		
	}
	
	protected void swap(int i, int j) {
		int t = value[i];
		value[i] = value[j];
		value[j] = t;
	}
}

//추상 클래스를 상속 받은 클래스가 추상 클래스가 아니면
///	 반드시 모든 추상 메소드를 재정의 해야한다.
class SelectionSort extends SortInt {

	@Override
	protected void sorting() {
		for(int i=0; i<length()-1; i++) {
			for(int j=i+1; j<length(); j++) {
				if(compare(i, j)>0) {
					swap(i, j);
				}
			}
		}
		
	}
	
}

class BubbleSort extends SortInt {

	@Override
	protected void sorting() {
		int pass = 1;
		boolean flag;
		
		do {
			flag = false;
			for(int i=0; i<length()-pass; i++) {
				if(compare(i, i+1)>0) {
					swap(i, i+1);
					flag = true;
				}
			}
			pass++;
		}while(flag);
		
	}
	
}