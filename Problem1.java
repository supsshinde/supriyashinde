package tandemloop;

import java.util.Scanner;

class Calculator {

    public double calculate(double a, double b, String operation) {

        switch (operation) {
           
            case "add": return a + b;
            case "sub": return a - b;
            case "mul": return a * b;
            case "div": return b != 0 ? a / b : 0;
            default: throw new IllegalArgumentException("Invalid Operation");
        }
    }
}

public class Problem1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a and b :");
		double a = sc.nextDouble();
		double b = sc.nextDouble();

		System.out.print("Enter operation (add / sub / mul / div): ");
		String operation = sc.next();

		Calculator cal=new Calculator();
		 double result=cal.calculate(a, b, operation);
		
		 System.out.println("Result ---> " +result);
		
	}
}
