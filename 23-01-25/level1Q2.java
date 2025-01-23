import java.util.Scanner;
public class level1Q2{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the first number: ");
	double num1 = sc.nextDouble();
	System.out.print("Enter the second number: ");
	double num2 = sc.nextDouble();
	System.out.print("Enter the third number: ");
	double num3 = sc.nextDouble();
	
	if ( num1<num2 && num1<num3) {
	  System.out.println("Is the first number the smallest? Yes");
	} else {
	  System.out.println("Is the first number the smallest? No");
	}

	sc.close();
     }
} 
