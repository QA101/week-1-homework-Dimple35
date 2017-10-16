import java.util.Scanner;

/*ARRAYS
		6) Write a program which takes an input as doubles of arrays and it finds product

of all arrays.

EX: input : double[] a ={1.0, 2.0, 3.89, 4.78};

Output: 1.0*2.0*3.89* 4.78= 37.1884


 */	 
public class chArrays6 {
	@SuppressWarnings("resource")
	 public static void main(String[] args) {
		double [] a = new double[5];
		double m = 1; 	 
		 Scanner console = new Scanner(System.in);
		 System.out.println("Enter 5 numbers: ");
		 for (int i = 0; i < 5; i++) {
		 a[i] = console.nextDouble();
		 m = m * a[i];
		 }
		 System.out.print(m);
		 
		 
	 }
 }