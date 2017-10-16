import java.util.Scanner;

/*ARRAYS
		 2) Write a program which takes an input as Integers of arrays and prints in reverse
order
EX: input : int[] a ={1,2,3,4};
Output:

a[0] = 4
a[1] =3
a[2] =2
a[3] = 1


 */	 
public class chArrays2 {
	@SuppressWarnings("resource")
	 public static void main(String[] args) {
		int [] a = new int[5];
		 	 
		 Scanner console = new Scanner(System.in);
		 System.out.println("Enter 5 numbers: ");
		 for (int i = 0; i < 5; i++) 
		 a[i] = console.nextInt(); 
		 
		 for (int i = 4; i >= 0; i--) 
			 System.out.print(a[i] + ",");
		 
		 
	 }
 }