import java.util.*;
public class Calculation {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int x = console.nextInt();
		System.out.println("Enter 2nd number:");
		int y = console.nextInt();
		if (x > y) 
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
		System.out.println("SUM: "+(x+y));
		System.out.println("SUBTRACTION: "+(x-y));
		System.out.println("MULTIPLICATION: "+(x*y));
		System.out.println("DIVISION: "+(x/y));
	}	

}
