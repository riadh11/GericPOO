import java.util.*;
public class FirstGeric<t> {

	public static void main(String[] args) {
		//create Array of Integer , Double, Character.
		Integer[] intArray = {1,2,3,4,5};
		Double [ ] doubleArray = {1.1, 2.1, 3.5 , 6.9 ,2.5};
		Character[] characterArray = {'A','B','e','s','t'};
		
		//Print
		System.out.println("\n output  Integer array");
		 new FirstGeric().Display(intArray);
		
		System.out.println("\n output  character  array");
		 new FirstGeric().Display( characterArray );
		
		System.out.println("\n  output Double  array");
		 new FirstGeric().Display(doubleArray );
	}
	
	 public   void Display(t[] Array) {
		 for(	t element : Array) {
			 System.out.printf("%s", element);
		 }}
		
}
