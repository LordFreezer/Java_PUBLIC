public class Account 
{
	private final int id;
	private double balance;
	public Account(int Id, double Balance) // so I found that I didn't really need setters as I can just set them like this...
        {
		id = Id;
		balance = Balance;
	}	
	public int getId() 
        {
		return id;
	}
	public double getBalance() 
        {
		return balance;
	}	
	public void withdraw(double amount) 
        {
		balance -= amount;
	}
	public void deposit(double amount) 
        {
		balance += amount;
	}
}