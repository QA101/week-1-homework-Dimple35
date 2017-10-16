import java.util.Scanner;

/*ARRAYS
		7) Write a program which takes an input as doubles of arrays and it finds average

of all arrays.

 */	 
public class chArrays7 {
	@SuppressWarnings("resource")
	 public static void main(String[] args) {
		double [] a = new double[5];
		double t = 0; 	 
		 Scanner console = new Scanner(System.in);
		 System.out.println("Enter 5 numbers: ");
		 for (int i = 0; i < 5; i++) {
		 a[i] = console.nextDouble();
		 t = t + a[i];
		 }
		 System.out.print(t/5);
		 
		 
	 }
 }