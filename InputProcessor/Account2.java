package InputProcessor;

import DataStore.AccountDataSuper;
import Factory.AbstractFactory;
import MDAEFSM.MDAEFSM;

public class Account2
{
	private AccountDataSuper ds;
	private AbstractFactory af;
	private MDAEFSM m;
	public Account2(MDAEFSM m,AccountDataSuper ds)
	{
		this.m=m;
		this.ds=ds;
	}



public void OPEN (int p, int y, int a) {
// store p, y and a in temp data store
 ds.setTemppin2(p);
 ds.setTempuserid2(y);
 System.out.println("userid"+ds.getTempuserid2());
 ds.setTempbalance2(a);
 m.Open();
}
public void PIN (int x) {
 if (x==ds.getPin2())
 m.CorrectPinAboveMin();
 else m.IncorectPin(2);
}
public void DEPOSIT (int d) {
 ds.setTempdeposit2(d);
 m.Deposit();
}
public void WITHDRAW (int w) {
 ds.setTempwithdraw2(w);
 if (ds.getBalance2()>0){
 m.Withdraw();
 m.AboveMinBalance();
 }
 else m.NoFunds();
}
public void BALANCE() {m.Balance();}

public void LOGIN (int y) {
	System.out.println(ds + ""+y+""+ds.getUserid2());
 if (y==ds.getUserid2())
 {	 System.out.println("inside acc 2 login");
 m.Login();
}
 else m.IncorrectLogin();
}
public void LOGOUT() {m.Logout();}
public void suspend () {
 m.Suspend();
}
public void activate () {
 m.Activate();
}
public void close () {
 m.Close();
}
}