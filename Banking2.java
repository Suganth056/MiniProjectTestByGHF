package miniProject;
import java.util.Scanner;
class Account_ifrm{
	public static double balance;
void checkbalnce() {
		System.out.println("Your Account Balance =$"+balance);
	}
	void deposit(Scanner sc) {
		System.out.print("Enter a Amount to Deposit..$");
		double amount=sc.nextDouble();
		balance=balance+amount;
		System.out.println("Amount Deposited SuccessFully---");
		
	}
	void withdraw(Scanner sc) {
		System.out.print("\nEnter a Amount to withdraw:$");
		double money=sc.nextDouble();
		if(balance<money) {
			System.out.println("Insufficient Balance");
		}
		else {
			balance=balance-money;
			System.out.println("Your payment is proceeding....");
		}
	
		checkbalnce();
	}
}
public class Banking2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 Account_ifrm obj=new  Account_ifrm();
		 //Account_ifrm obj2=new  Account_ifrm();
		 int  choice=1;
		 do {
		 System.out.println("Welcome You to SBI BankingSector.....");
		 System.out.println("Press ---1--- to Withdraw Amount From your ACCOUNT");
		 System.out.println("Press ---2--- to Deposit Amount to your Account");
		 System.out.println("Press ---3--- to Check Balance of your Account");
		 int a=sc.nextInt();
		 switch(a) {
		 case 1:
			 obj.withdraw(sc);
			 break;
		 case 2:
		     obj.deposit(sc);
		     break;
		 case 3:
			 obj.checkbalnce();
			 break;
		default:
		 	System.out.println("Sorry Please Enter a valid Number....");
		 	
		 System.out.println("Press 1--- to Continue (or) 0--- To Exit:");
		 choice=sc.nextInt();
		 }
		 }
		 
		 while(choice==1);
		 System.out.println("Thankyou for choosing our Bank....");
	}
}
