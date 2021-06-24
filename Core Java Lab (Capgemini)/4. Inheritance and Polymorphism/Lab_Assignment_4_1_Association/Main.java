package Lab_Assignment_4_1_Association;

public class Main{
	
	private Account createAccount(String name, int age, int iniAmt)
	{
		Person p = new Person( name, age);
		int accnum = (int)(Math.random() * 100000);
		Account acc = new Account(p, iniAmt, accnum);
		return acc;
	}

	public static void main(String[] args) {
		Account JerryAcc =  new Main().createAccount("Jerry", 21, 3215);
		Account MarshallAcc =  new Main().createAccount("Marshall", 27, 2015);
		
		MarshallAcc.deposit(1735);
		JerryAcc.withdraw(1650);
		
		MarshallAcc.getBalance();
		JerryAcc.getBalance();
	}

}
