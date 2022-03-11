package GenericClass;

public class GenericMethodEXP {

	public static <E> void printArray(E[] elements) {
		for(E ele : elements ) {
			System.out.print(ele + " ");
		}
	}
	
	public static void main(String[] args) {
		
		Integer[] intArray = {1, 2, 3, 4, 5};
		printArray(intArray);
		
		String[] stringArray = {"Nguyen", "Tran", "Pham"};
		printArray(stringArray);
	}
}	


