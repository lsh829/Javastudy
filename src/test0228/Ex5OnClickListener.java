package test0228;

public class Ex5OnClickListener {
	public static void main(String[] args) {
		Button.OnclickListener listener = new Button.OnclickListener() {
			
			@Override
			public void onClick() {
				System.out.println("클릭");
			}
		};
		listener.onClick();
	}
}

//중첩 인터페이스
class Button {
	public interface OnclickListener{
		public void onClick();
	}
}
