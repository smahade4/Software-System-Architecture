package Actions;

import DataStore.AccountDataSuper;

public class MakeDeposit1 extends MakeDepositSuper {

	@Override
	public void showMakeDeposit(AccountDataSuper ds)
	{
		float balance=ds.getBalance()+ds.getTempdeposit();
		ds.setBalance(balance);
		System.out.println("Updated Balance :"+ds.getBalance());
	}
}
