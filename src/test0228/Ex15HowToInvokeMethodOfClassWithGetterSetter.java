package test0228;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ex15HowToInvokeMethodOfClassWithGetterSetter {
	public static void main(String[] args) {
		String className = "test0228.UserVO";
		Class<?> cls;
		
		try {
			cls = Class.forName(className);
			Object ob = cls.newInstance();
			
			Field[] ff = cls.getDeclaredFields();
			
			for(Field f : ff) {
				String fieldName = f.getName();
				String first = fieldName.substring(0,1).toUpperCase();
				String last = fieldName.substring(1);
				String setter = "set" + first + last;
				
				System.out.println(setter);
				
				Method m = cls.getDeclaredMethod(setter, f.getType());
				//if("java.lang.String".equals)(+getType())
				//타입비교
				if(f.getName().equals("name")) { //이름
					m.invoke(ob, "홍길동");
				}else if(f.getName().equals("tel")) {
					m.invoke(ob, "010");
				}else if(f.getName().equals("age")) {
					m.invoke(ob, 20);
				}
			}
			
			//Getter 호출
			for(Field f : ff) {
				String fieldName = f.getName();
				String first = fieldName.substring(0,1).toUpperCase();
				String last = fieldName.substring(1);
				String getter = "get" + first + last;
				System.out.println(getter);
				
				Method m = cls.getDeclaredMethod(getter);
				Object rt = m.invoke(ob);
				if(f.getType().getName().equals("java.lang.String")) {
					String s = (String) rt;
					System.out.println(f.getName()+":"+s);
				}else if(f.getType().getName().equals("int")) {
					int i = (int) rt;
					System.out.println(f.getName() + ":" +i);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class UserVO {
	private String name;
	private String tel;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
