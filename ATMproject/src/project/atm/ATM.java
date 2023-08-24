package project.atm;
import java.util.*;


import javax.xml.crypto.Data;

public class ATM {
	
	public static void main(String[] args) {
		ATM_operations obj = new ATM_operations();
	}

}
class Data {
	float balance;
}

class ATM_operations{
	Scanner sc = new Scanner(System.in);
	//float balance;
	Map<Integer , Data>  map = new HashMap<>();
	
	
	
	ATM_operations(){
		System.out.println("***********************************************");
		System.out.println("Welcome to ATM");
		access_account();
	}
	public void menu(Data obj) {
		
		System.out.println("1. Check your account balance:");
		System.out.println("2.Deposit Money");
		System.out.println("3.Withdraw Money");
		System.out.println("4.Check another acoount");
		System.out.println("5.Exit");
		
		int num= sc.nextInt();
		if(num==1) {
			check_balance(obj);
			
		}
		else if(num==2) {
			deposit(obj);
		}
		else if(num==3) {
			withdrawl(obj);
		}
		else if(num==4) {
			access_account();
		}
		else if(num==5) {
			System.out.println("Thank You.");
		}
		else {
			System.out.println("Please enter a valid Number.");
			menu(obj);
			System.out.println("***********************************************");
		}
		
	}
	public void check_balance(Data obj) {
		System.out.println("***********************************************");
		System.out.println("Your current balance is : " + obj.balance);
		System.out.println("***********************************************");
		menu(obj);
		System.out.println("***********************************************");
	}
	
	public void deposit(Data obj) {
		System.out.println("Enter amount to deposit:");
	 float amount = sc.nextFloat();
	 obj.balance += amount;
	 System.out.println("Amount deposited successfully.");
	 System.out.println("Total amount is : " + obj.balance);
	 System.out.println("***********************************************");
	 menu(obj);
	 System.out.println("***********************************************");
		
	}
	public void withdrawl(Data obj) {
		System.out.println("Enter amount to withdraw:");
		 float amount = sc.nextFloat();
		 if(obj.balance >= amount) {
		 obj.balance -= amount;
		 System.out.println("Amount withdrawl successfully.");
		 System.out.println("Amount left is : " + obj.balance);
		 System.out.println("***********************************************");
		 }
		 else {
			 System.out.println("Insufficient Balance");
		 }
		 menu(obj);
		 System.out.println("***********************************************");
	}
	public void access_account() {
		System.out.println("***********************************************");
		System.out.println("Enter your pin code: ");
		int pincode = sc.nextInt();
		if(map.containsKey(pincode)==true) {
			Data obj = map.get(pincode);
			menu(obj);
		}
		else {
			System.out.println("***********************************************");
			System.out.println("Please create account first: ");
			System.out.println("Set your pincode : ");
			
			int pin = sc.nextInt();
			Data obj = new Data();
			map.put(pin , obj);
			menu(obj);
			System.out.println("***********************************************");
		}
		
	}
}
