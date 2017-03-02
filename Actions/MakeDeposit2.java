package Actions;

import DataStore.AccountDataSuper;

public class MakeDeposit2 extends MakeDepositSuper{


	@Override
	public void showMakeDeposit(AccountDataSuper ds)
	{
		int balance=ds.getBalance2()+ds.getTempdeposit2();
		ds.setBalance2(balance);
		System.out.println("Updated Balance :"+ds.getBalance2());

	}
	
}
