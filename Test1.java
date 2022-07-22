package java8_strms;

import java.util.Arrays;

//adding comment
public class Test1 {

	public static void main(String[] args) {
		int[] data= {1,23,24,10,11,56,78,-80,-10};
		//Can you add this data in the IntStream n display the same using higher order func/method : forEach
		//API : java.util.Arrays --- public static IntStream stream(int[] data)
		Arrays.stream(data) //IntStream : src 
<<<<<<< HEAD
		.forEach(i -> System.out.print(i+" "));//terminal op.

		System.out.println("Hello First Commit By Kunal in Test1");
		
		#System.out.println("Hello IACSD");
		
=======
		.forEach(i -> System.out.print(i+" "));
		 System.out.println("bla bla");
>>>>>>> 9fbcf0ef07f7a8b15f4644001fe26817998bf136

	}

}
