

import java.util.Scanner;

abstract class BankTransaction extends BankApplication {
	int withdraw,initbal=10000;
	Scanner scan=new Scanner(System.in);
	abstract void deposit();
	abstract void withdraw(); 
	abstract void balance();	
}
class SavingAccount extends BankTransaction{ 
	@Override
	void deposit()
	{
	System.out.println("enter amount to deposit");
	int deposit=scan.nextInt();
	initbal=initbal+deposit;
	}
	@Override
	void withdraw()
	{
		System.out.println("enter withdraw amount");
		withdraw=scan.nextInt();
	if(withdraw<5000) {
		if(initbal>=withdraw)
		{
			System.out.println("transaction successful");
			initbal=initbal-withdraw;
		}
		else
			System.out.println("insufficent balance");
	}
	else {
		System.out.println("withdraw failed");
	}

	}
	@Override
	void balance()
	{
		System.out.println("balance:"+initbal);
	}

}
class CurrentAccount extends BankTransaction{
	@Override
	void deposit()
	{
		System.out.println("enter amount to deposit");
		int deposit=scan.nextInt();
		initbal=initbal+deposit;
	}
	
	void withdraw()
	{
		System.out.println("enter withdraw amount");
		withdraw=scan.nextInt();
		if(initbal>=withdraw)
		{
			System.out.println("transaction successful");
			initbal=initbal-withdraw;
		}
		else
			System.out.println("insufficent balance");
	}
	void balance()
	{
		System.out.println("balance:"+initbal);
	}
}

public class BankApplication {

	public static void main(String[] args) {
		System.out.println("welcome");int c;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter\n1.Savings\n2.current");
		int ch=scan.nextInt();
		int g;
		
SavingAccount saving=new SavingAccount();
CurrentAccount current=new CurrentAccount();
do {
	switch(ch)
{
case 1:
	System.out.println("enter 1.Deposit\n2.Withdraw\n3.balance");
	int s=scan.nextInt();
switch(s)
{
case 1:saving.deposit();
break;
case 2:saving.withdraw();
break;
case 3:saving.balance();
break;
}
break;
case 2:	System.out.println("enter 1.Deposit\n2.Withdraw\n3.balance");
int cur=scan.nextInt();
switch(cur)
{
case 1:current.deposit();
break;
case 2:current.withdraw();
break;
case 3:current.balance();
break;
}
	
}
	System.out.println("enter '1' to continue");
	g=scan.nextInt();
	}while(g==1);
System.out.println("bank application exit");
	}
}