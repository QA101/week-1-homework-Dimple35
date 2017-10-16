import java.util.Scanner;

/*ARRAYS
		4) Write a program which takes an input as doubles of arrays and print them.
EX: input: double[] a ={1.2, 2.5, 3.8, -12};
Output:

a[0] = 1.2
a[1] =2.5
a[2] =3.8
a[3] = -12

 */	 
public class chArrays4 {
	@SuppressWarnings("resource")
	 public static void main(String[] args) {
		double [] a = new double[5];
			 
		 Scanner console = new Scanner(System.in);
		 System.out.println("Enter 5 numbers: ");
		 for (int i = 0; i < 5; i++) 
		 a[i] = console.nextDouble();
		 for (int i = 0; i < 5; i++) 
			  System.out.print(a[i] + ",");
		 
		 
	 }
 }