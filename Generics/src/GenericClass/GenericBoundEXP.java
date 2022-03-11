package GenericClass;

import java.util.ArrayList;
import java.util.List;

public class GenericBoundEXP {
	
	public static int sum(List<? extends Number> list){
		int sum = 0;
		for(Number n : list){
			sum += n.doubleValue();
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(3); 
		ints.add(5); 
		ints.add(10);
		int sum = sum(ints);
		System.out.println("Sum of ints="+sum);
	}

	
}
