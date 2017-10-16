import java.util.Scanner;

/*ARRAYS
		 5) Write a program which takes an input as doubles of arrays and prints in reverse
order
EX: input: double[] a ={1.2, -20, 3.89, 400.0};
Output:

a[0] = 400.0
a[1] =3.89
a[2] = -20
a[3] = 1.2

 */	 
public class chArrays5 {
	@SuppressWarnings("resource")
	 public static void main(String[] args) {
		double [] a = new double[5];
		 	 
		 Scanner console = new Scanner(System.in);
		 System.out.println("Enter 5 numbers: ");
		 for (int i = 0; i < 5; i++) 
		 a[i] = console.nextDouble(); 
		 
		 for (int i = 4; i >= 0; i--) 
			 System.out.print(a[i] + ",");
		 
		 
	 }
 }