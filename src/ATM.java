import java.util.Scanner;

public class ATM {

	public static void main(String[] args) 
	{
		BankAccount user = new BankAccount("name","123");
		user.showMenu();

	}

}

class BankAccount 
{
	int balance;
	int preAction;
	String customerName;
	String customerId;

	BankAccount(String cname, String cid) {
		customerName = cname;
		customerId = cid;
	}

	void deposit(int amount) {
		if (amount != 0) {
			balance += amount;

			preAction = amount;

		}

	}

	void withdraw(int amount) {
		if (amount != 0) {
			balance -= amount;
			preAction = -amount;

		}
	}

	void getPreviousTransaction() {
		if (preAction > 0) {
			System.out.println("Deposited:" + preAction);
		}

		else if (preAction < 0) {
			System.out.println("Withdrawn: " + Math.abs(preAction));
		}
		System.out.println("No transaction occured");

	}

	void showMenu()
	{
		char option ='\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome " +customerName);
		System.out.println("Your ID is " +customerId);
		System.out.println("\n");
		System.out.println();
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous transaction");
		System.out.println("E. Exit");
		
		do
		{
			System.out.println("-------------------------");
			System.out.println("Enter option");
			System.out.println("--------------------------");
			option = scanner.next().charAt(0);
			option= Character.toUpperCase(option);
			
			System.out.println("\n");
			
			switch(option)
			
			{
			case 'A':
			System.out.println("Balance= " +balance);
			break;
			
			case 'B':
			System.out.println("Enter amount to deposit");
			int amount = scanner.nextInt();
			deposit(amount);
			break;
			
			case 'C':
			System.out.println("Enter amount to withdraw");
			int amount2 = scanner.nextInt();
			withdraw(amount2);
			break;
			
			case 'D':
			getPreviousTransaction();
			break;
			
			case 'E':
			System.out.println("*********");
			break;
			
			default:
			System.out.println("invalid option");
			break;
			}
		}
		while(option !='E');
		System.out.println("thanks");
		
			
			
			
			
			}


}
