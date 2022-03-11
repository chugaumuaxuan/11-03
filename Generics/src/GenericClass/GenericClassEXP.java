package GenericClass;

import java.util.ArrayList;
import java.util.List;

class MyGeneric<T>{
	T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return obj;
	}
	
}

public class GenericClassEXP {
	public static void main(String[] args) {
		MyGeneric<Integer> m1 = new MyGeneric<>();
		m1.set(1);
		System.out.println(m1.obj);
		
		MyGeneric<String> m2 = new MyGeneric<>();
		m2.set("ABC");
		System.out.println(m2.get());
		
		
//		List<String> list1 = new ArrayList<String>(); 
//		list1.add("abc");
//		list1.add("bcd");
//		for(String str : list1){
//		   System.out.println(str);
//		}
		
		
	}
}
