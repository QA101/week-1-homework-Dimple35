import java.util.Scanner;

/*ARRAYS
		3) Write a program which takes an input as Integers of arrays and it finds product
of all arrays.
EX: input : int[] a ={1,2,3,4};

Output: 1*2*3*4 = 24


 */	 
public class chArrays3 {
	@SuppressWarnings("resource")
	 public static void main(String[] args) {
		int [] a = new int[5];
		int m = 1; 	 
		 Scanner console = new Scanner(System.in);
		 System.out.println("Enter 5 numbers: ");
		 for (int i = 0; i < 5; i++) {
		 a[i] = console.nextInt();
		 m = m * a[i];
		 }
		 System.out.print(m);
		 
		 
	 }
 }