package calculator;

import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		// Declaration
		
		// itteration1  
		//double number1 = 12:
		//double number2 = 4;
		// end itteration1
		
		// itteration2
		Scanner scan = new Scanner(System.in);
		System.out.println("Type in number1: ");
		float number1 = scan.nextFloat();
		System.out.println("Type in number2: ");
		float number2 = scan.nextFloat();
		// end itteration2
		
		// Calc4
		float sum = number1+number2;
		float sub = number1-number2;
		float mul = number1*number2;
		float div = number1/number2;
		
		// itteration3
		System.out.println("Type in number for operation: ");
		System.out.println("1 for Addition ");
		System.out.println("2 for Substracion ");
		System.out.println("3 for Multiplication ");
		System.out.println("4 for Division ");
		int oper = scan.nextInt();
		if (oper==1) {
			System.out.println("Addition of numbers: "+ sum);
		}
		else if (oper==2) {
			System.out.println("Subtraction of numbers: "+ sub);
		}
		else if (oper==3) {
			System.out.println("Multiplication of numbers: "+ mul);
		}
		else if (oper==4) {
			System.out.println("Division of numbers: "+ div);
		}
		// Output
		/* itteration1
		System.out.println("Addition of numbers: "+ sum);
		System.out.println("Subtraction of numbers: "+ sub);
		System.out.println("Multiplication of numbers: "+ mul);
		System.out.println("Division of numbers: "+ div);
		end itteration1 */
		
	}

}
