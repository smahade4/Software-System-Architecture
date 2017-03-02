package InputProcessor;

import DataStore.AccountDataSuper;
import Factory.AbstractFactory;
import MDAEFSM.MDAEFSM;

public class Account1
{
	private AccountDataSuper ds;
	private AbstractFactory af;
	private MDAEFSM m;
	public Account1(MDAEFSM m,AccountDataSuper ds)
	{
		this.m=m;
		this.ds=ds;
	}
public void open(String p, String y, float a) {
		// store p, y and a in temp data store
	 System.out.println("inside account1 open");

		ds.setTemppin(p);
		 ds.setTempbalance(a);
		 ds.setTempuserid(y);
		 m.Open();
		}

public void	pin (String x) {
		 if (x.equals(ds.getPin())) {
			 System.out.println("pin is" +x);
			 System.out.println("pin is" +ds.getPin());
		 if (ds.getBalance() > 500)
		 m.CorrectPinAboveMin();
		 else m.CorrectPinBelowMin();
		 }
		 else m.IncorectPin(3);
		}

public void deposit (float d) {
		 ds.setTempdeposit(d);
		 m.Deposit();
		 if (ds.getBalance()>500)
		 m.AboveMinBalance();
		 else m.BelowMinBalance();
		}

public void	withdraw (float w) {
		 ds.setTempwithdraw(w);
		 m.Withdraw();
		 if (ds.getBalance()>500)
		 m.AboveMinBalance();
		 else
		 {
			 System.out.println("withdrawbelowmin balance");
			 m.WithdrawBelowMinBalance();
		
		 }}
	public void balance() {m.Balance();}
	
	public void	login (String y) {
		System.out.println("y "+y);
		System.out.println("y "+ds.getUserid());
		 if (y.equals(ds.getUserid()))
		 {
			 System.out.println("user id equal inside account 1 login");
		 m.Login();
		 }
		 else m.IncorrectLogin();
		}
		public void logout() {m.Logout();}
		
		public void lock (String x)
		{
		 if (ds.getPin().equals(x)) 
			 m.Lock();
		 else m.IncorrectLock();
		}
	public void	unlock (String x) {
		 if (x.equals(ds.getPin())) {
		 m.Unlock();
		 if (ds.getBalance() > 500)
		 m.AboveMinBalance();
		 else m.BelowMinBalance();
		 }
		 else m.IncorrectUnlock();
		}
	public String showuserid()
	{
		return ds.getUserid();
	}
	public String showpin()
	{
		return ds.getPin();
	}
	public float showBalance()
	{
		return ds.getBalance();
	}
	public float showDeposit()
	{
		return ds.getTempdeposit();
	}
	public float showWithdraw()
	{
		return ds.getTempwithdraw();
	}
	
	
}