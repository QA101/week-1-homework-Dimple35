import java.util.Scanner;

/*ARRAYS
		 1) Write a program, which takes an input as Integers of arrays, and print them.
		 EX: input : int[] a ={1,2,3,4};

		 Output:
		 a[0] = 1
		 a[1] =2
		 a[2] =3
		 a[3] = 4 
 */	 
public class chArrays {
	@SuppressWarnings("resource")
	 public static void main(String[] args) {
		int [] a = new int[5];
		 	 
		 Scanner console = new Scanner(System.in);
		 System.out.println("Enter 5 numbers: ");
		 for (int i = 0; i < 5; i++) 
		 a[i] = console.nextInt(); 
		 
		 for (int i = 0; i < 5; i++) 
			 System.out.print(a[i] + ",");
		 
		 
	 }
 }