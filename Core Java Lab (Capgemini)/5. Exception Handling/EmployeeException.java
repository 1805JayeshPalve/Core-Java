package Lab_5;

import java.util.Scanner;

class SalaryException extends Exception{
	public SalaryException (String str) {
		System.out.println(str);
		
	}
}

public class EmployeeException {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the salary:");
		int salary = s.nextInt();
		
		
		
		try{
			if(salary>3000)
				throw new SalaryException("Salary is more than 3000");
			
			else 
				System.out.println("Salary is less than 3000");
		}
		
		catch(SalaryException a) {
			System.out.println(a);
		}

	}

}

