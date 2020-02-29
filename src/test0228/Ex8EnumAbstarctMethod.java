package test0228;

//열거형은 만들 일은 거의 없으나 JAVA에서 제공하는 클래스에서 열거형을 사용할 수 있으므로
//가볍게 실습하면서 어떻게 쓰는지 정도만 익히고 SKIP~
public class Ex8EnumAbstarctMethod {
	public static void main(String[] args) {
		double a = Operation.PLUS.eval(10,5);
		System.out.println(a);
		
		double x=20.0;
		double y=10.2;
		
		for(Operation op: Operation.values()) {
			System.out.printf("%.1f %s %.1f = %.1f\n",x,op,y,op.eval(x, y));
		}
		
	}
}

//enum에 추상 메서드를 선언할 수 있다.
enum Operation{
	PLUS{double eval(double x, double y){return x+y;}},
	MINUS{double eval(double x, double y){return x-y;}},
	TIMES{double eval(double x, double y){return x*y;}},
	DIVIDE{double eval(double x, double y){return x/y;}};
	//↓ 추상메서드
	abstract double eval(double x, double y);
}
