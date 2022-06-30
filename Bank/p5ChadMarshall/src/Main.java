import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
        {
                boolean x = true;
		Scanner input = new Scanner(System.in);
		Account[] accounts = new Account[10];
		initialBalance(accounts);
		do {
			System.out.print("Enter an id: ");
			int id = input.nextInt();
			if (CheckValid(id, accounts)) 
                        {
				int choice;
				do {	
					choice = mainMenu(input);
					if (Check(choice)) 
                                        {
							wordStuff(choice, accounts, id, input);
					}
				} while (choice != 4); 
			}
		} while (x); 
	}
	public static void initialBalance(Account[] account) 
        {
		int initialBalance = 100;
		for (int i = 0; i < account.length; i++) 
                {
			account[i] = new Account(i, initialBalance);
		}
	}
	public static boolean Check(int choice) 
        {
            return !(choice < 0 && choice > 4);
            //(choice > 0 || choice < 4)
	}
	public static boolean CheckValid(int id, Account[] account) 
        {
            boolean x;// this annoys me as its scope is janky.
		for (int i = 0; i < account.length; i++) 
                {
                    
			if (id == account[i].getId())
				return x = true;
		}
		return x = false;
	}
	public static int mainMenu(Scanner menu) 
        {		
                    System.out.println("main menu");
                    System.out.println(" ");
                    System.out.println("1 : check balance");
                    System.out.println("2 : withdraw");
                    System.out.println("3 : deposit");
                    System.out.println("4 : exit");
                    System.out.println(" ");
                    System.out.print("Enter a choice...");
                    System.out.println("----------------------------- ");  
		return menu.nextInt();
	}
	public static void wordStuff(
		int Choice, Account[] account, int id, Scanner menu) 
        {
		switch (Choice)
                {
			case 1: 
					  System.out.println("The balance for account "+ account[id].getId()+ " is " + account[id].getBalance());
                                          System.out.println(" ");
                                          if(account[id].getBalance() < 0)
                                          {
                                              System.out.println("Looks like you owe the iron bank some gold...");
                                              System.out.println(" ");
                                          }
                                          else if (account[id].getBalance() > 0 && account[id].getBalance() < 101)
                                          {
                                              System.out.println("Good thing you are not in debt");
                                              System.out.println(" ");
                                          }
                                          else
                                          {
                                              System.out.println("Look who's bankin' in some gold!..");
                                              System.out.println(" ");
                                          }
					  break;
			case 2: 
					  System.out.print("How much moola do you want to take out?: "); 
					  account[id].withdraw(menu.nextDouble());
					  break;
			case 3: 
					  System.out.print("How much of your pelf would you like to store into this temple that is this bank?: "); 
					  account[id].deposit(menu.nextDouble());
		}
	}
}