package calculator;

import java.util.Scanner;

public class calc2 {

	public static void main(String[] args) {
		
		int oper = 1;
		while (oper!=5 ) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Typa in number for operation: ");
			System.out.println("1 for Addition ");
			System.out.println("2 for Substracion ");
			System.out.println("3 for Multiplication ");
			System.out.println("4 for Division ");
			System.out.println("5 for Exit program ");
			
			oper = scan.nextInt();
			
			if (oper!=5) {
				System.out.println("Type in number1: ");
				float number1 = scan.nextFloat();
				System.out.println("Type in number2: ");
				float number2 = scan.nextFloat();

				
				// Calculation
				float sum = number1+number2;
				float sub = number1-number2;
				float mul = number1*number2;
				float div = number1/number2;
				
				
				
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
			}
			System.out.println("");
		}
		System.out.println("BYE!");
		
	}

}
