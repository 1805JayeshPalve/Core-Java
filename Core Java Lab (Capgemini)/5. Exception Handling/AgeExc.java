package Lab_5;
import java.util.Scanner;

class AgeException extends Exception{
	public AgeException(String str) {
		System.out.println(str);
	}
}



public class AgeExc {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age :");
		int age = s.nextInt();
		
		
		try {
			if(age>15)
				throw new AgeException("Valid Age");
			else
				System.out.println("Invalid Age");
		}
		
		catch(AgeException a) {
			System.out.println(a);
			
		}

	}

}
