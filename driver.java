import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import Actions.OutputProcessor;
import DataStore.AccountData2;
import DataStore.AccountDataSuper;
import Factory.AbstractFactory;
import Factory.ClientFactory1;
import Factory.ClientFactory2;
import InputProcessor.Account1;
import InputProcessor.Account2;
import MDAEFSM.MDAEFSM;
import MDAEFSM.State;

public class driver {

	public static void main(String args[])
	{
		 System.out.println("Enter input");
        System.out.println("1. Account- 1");
        System.out.println("2.  Account- 2");
        System.out.println("3. Exit");
       int choice;

       Scanner input = new Scanner(System.in);
        try {
            choice = input.nextInt();
            if(choice==1)
            {
            	
            	OutputProcessor op=new OutputProcessor();
            	MDAEFSM m=new MDAEFSM();
            	AbstractFactory af=new ClientFactory1();
            	AccountDataSuper ds= af.getAccountData();
            	op.setData(af,ds);
            	State s=new State();
            	s.initalize(op, m);
            	Account1 a =new Account1(m,ds);
            	driver d =new driver();
            	d.processOperation(a);
            }
            if(choice==2)
            {
            	OutputProcessor op=new OutputProcessor();
            	MDAEFSM m=new MDAEFSM();
            	AbstractFactory af=new ClientFactory2();
            	AccountDataSuper ds= af.getAccountData();
            	op.setData(af, ds);
            	State s=new State();
            	s.initalize(op, m);
            	
            	Account2 a =new Account2(m,ds);
            	driver d =new driver();
            	d.processOperation2(a);
                	
            }
        } 
        catch(Exception e)
        {
        	
        }
		
	}
	
	public void processOperation(Account1 a)
	{
		int flag=0;
		while(flag==0)
		{

		System.out.println("Select Operation:\n1.Open\n2.Pin\n3.Deposit\n4.Withdraw\n5.Balance\n6.Login\n7.Logout\n8.Lock\n9.Unlock\n10.exit\n");
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		int process = 0;
		try {
			process = Integer.parseInt(b.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner input=new Scanner(System.in);
		switch(process){
		case 1:
			System.out.println("\nEnter the Accountno:");
			String userid=input.nextLine();
			System.out.println("\nEnter the pin:");
			String pin=input.nextLine();
			System.out.println("\nEnter the Balance:");
			float balance=input.nextFloat();
			a.open(pin, userid, balance);
			break;
		case 2:
			System.out.println("\n Enter the pin:");
			pin=input.nextLine();
			a.pin(pin);
			break;
		case 3:
			System.out.println("\n Enter the amount to be deposited:");
			float d=input.nextFloat();
			a.deposit(d);
			break;
		case 4:
			System.out.println("\nPlease Enter the amount to withdraw:");
			float w=input.nextFloat();
			a.withdraw(w);
			break;
		case 5:
			a.balance();
			break;
		case 6:
			System.out.println("Enter the user id for login:");
			userid=input.nextLine();
			a.login(userid);
			break;
		case 7:
			a.logout();
			break;
		case 8:
			System.out.println("Enter the pin to lock the account:");
			pin=input.nextLine();
			a.lock(pin);
			break;
		case 9:
			System.out.println("Enter the pin to unlock the account:");
			pin=input.nextLine();
			a.unlock(pin);
			break;
		case 10:
			flag=1;
		break;
		}
		}
		
	}

	public void processOperation2(Account2 a)
	{
		int flag=0;
		while(flag==0)
		{

		System.out.println("Select Operation:\n1.Open\n2.Pin\n3.Deposit\n4.Withdraw\n5.Balance\n6.Login\n7.Logout\n8.Suspend\n9.Activate\n10.close\n11.exit");
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		int process = 0;
		try {
			process = Integer.parseInt(b.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner input=new Scanner(System.in);
		switch(process){
		case 1:
			System.out.println("\nEnter the Accountno:");
			int userid=input.nextInt();
			System.out.println("\nEnter the pin:");
			int pin=input.nextInt();
			System.out.println("\nEnter the Balance:");
			int balance=input.nextInt();
			a.OPEN(pin, userid, balance);
			break;
		case 2:
			System.out.println("\n Enter the pin:");
			pin=input.nextInt();
			a.PIN(pin);
			break;
		case 3:
			System.out.println("\n Enter the amount to be deposited:");
			int d=input.nextInt();
			a.DEPOSIT(d);
			break;
		case 4:
			System.out.println("\nPlease Enter the amount to withdraw:");
			int w=input.nextInt();
			a.WITHDRAW(w);
			break;
		case 5:
			a.BALANCE();
			break;
		case 6:
			System.out.println("Enter the user id for login:");
			userid=input.nextInt();
			a.LOGIN(userid);
			break;
		case 7:
			a.LOGOUT();
			break;
		case 8:
			System.out.println("Suspend the account:");
			a.suspend();
			break;
		case 9:
			System.out.println("Activate an account:");
			a.activate();
			break;
		case 10:
			System.out.println("Close an account:");
			a.close();
			break;
		case 11:
			flag=1;
		break;
		}
		}
	}
}
