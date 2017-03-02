package Actions;

import DataStore.AccountDataSuper;

public class MakeWithdraw2 extends MakeWithdrawSuper {

	@Override
	public void showMakeWithdraw(AccountDataSuper ds)
	{
		int balance=ds.getBalance2()-ds.getTempwithdraw2();
		ds.setBalance2(balance);
		System.out.println("Account2 Balance:"+ds.getBalance2());
	
	}
}
