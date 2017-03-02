package Actions;

import DataStore.AccountDataSuper;

public class MakeWithdraw1 extends MakeWithdrawSuper{

	@Override
	public void showMakeWithdraw(AccountDataSuper ds)
	{float balance=ds.getBalance()-ds.getTempwithdraw();
	
	ds.setBalance(balance);
	System.out.println("Account1 Balance:"+ds.getBalance());

		
	}
}
