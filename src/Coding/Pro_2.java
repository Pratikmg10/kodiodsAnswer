package Coding;
import java.util.Scanner;

public class Pro_2 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter a number: ");
		        String number = scanner.nextLine();
		        
		        int sumOdd = 0;
		        int sumEven = 0;
		        
		        for (char digit : number.toCharArray()) {
		            if (Character.isDigit(digit)) {
		                int num = Character.getNumericValue(digit);
		                
		                if (num % 2 == 0) {
		                    sumEven += num;
		                } else {
		                    sumOdd += num;
		                }
		            }
		        }
		        
		        System.out.println("Sum of even digits: " + sumEven);
		        System.out.println("Sum of odd digits: " + sumOdd);
		        
		        scanner.close();
		    }

	}

