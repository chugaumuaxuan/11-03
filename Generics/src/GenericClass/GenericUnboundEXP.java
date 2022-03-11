package GenericClass;

import java.util.ArrayList;
import java.util.List;

public class GenericUnboundEXP {
	public static void printData(List<?> list){
		for(Object obj : list){
			System.out.print(obj + " ");
		}
	}
	
	public static void main(String[] args) {
		List<String> ints = new ArrayList<>();
		ints.add("A"); 
		ints.add("B"); 
		ints.add("C");
		printData(ints);
		
		List<Integer> i = new ArrayList<>();
		i.add(1);
		i.add(2);
		i.add(3);
		printData(i);
		
	}
}
