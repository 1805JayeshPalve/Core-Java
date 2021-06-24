package Lab_Assignment_4_1_Association;


public class Account{
	protected long accNum;
	protected double balance;
	protected Person accHolder;
	Account(){};
	Account(Person _accHolder, double _initialAmt, long _accNum)
	{
		accNum = _accNum;
		balance = _initialAmt;
		accHolder = _accHolder;
	}
	public void deposit(int amt)
	{
		balance += amt;
	}
	public void withdraw(int amt)
	{
		if(balance - amt > 500)
			balance -= amt;
		else
			System.out.println("Declined");
	}
	public void getaccNum()
	{
		System.out.println(accNum);
	}
	public void getBalance()
	{
		System.out.println("Balance of user "+ accHolder.getName() + " is " +  balance);
	}
	
}


class SavingsAccount extends Account {
	protected int minimumBalance;
	
	public SavingsAccount(Person _accHolder, double _initialAmt, long _accNum, int _minBalance) {
		super(_accHolder,_initialAmt, _accNum);
		minimumBalance = _minBalance;
	}
	@Override
	public void withdraw(int amt)
	{
		if(balance - amt > minimumBalance)
			balance -= amt;
		else
			System.out.println("Declined");
	}
}

class CurrentAccount extends Account {
	protected int overdraftLimit;
	
	CurrentAccount(Person _accHolder, double _initialAmt, long _accNum, int _overdraftLimit) {
		super(_accHolder,_initialAmt, _accNum);
		overdraftLimit = _overdraftLimit;
	}
	
	@Override
	public void withdraw(int amt)
	{
		if(balance - amt > overdraftLimit)
		{
			balance -= amt;
			if(balance < 0)
			{
				overdraftLimit += balance;
				balance = 0;
				if(overdraftLimit == 0)
					System.out.println("overdraft limit reached");
			}
		}
		else
		{
			System.out.println("Declined");
			System.out.println("overdraft limit reached");
		}
	}

}