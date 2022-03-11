package GenericClass;

import java.util.ArrayList;
import java.util.List;

interface Repository<T>{
	
	List<String> listName = new ArrayList<String>();
	
}

public class GenericInterfaceEXP<T> implements Repository<T>  {
	
	public static <E> void printArray(List<String> E) {
		for(String ele : E ) {
		}
		System.out.println("Cac phan tu trong list la: " + E);
	}
	
	public static void main(String[] args) {
			
		//them phan tu
		listName.add("Nguyen");
		listName.add("Tran");
		listName.add("Pham");

		//lay het
		printArray(listName);
		
		System.out.println("So phan tu trong chuoi la: "+ listName.size());
		
		//lay 1
		System.out.println("Phan tu thu 1 la: " + listName.get(0));
		
		//sua
		listName.set( 0, "Hoang");
		System.out.println("sau khi sua phan tu thu 1: " + listName );
		
		//xoa 1
		listName.remove(1);
		System.out.println("sau khi xoa phan tu thu 2: " +listName);
			
		//lay so luong
		System.out.println("So phan tu trong chuoi la: "+ listName.size());
		
		
		
	}

}
