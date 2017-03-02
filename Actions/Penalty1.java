package Actions;

import DataStore.AccountDataSuper;

public class Penalty1 extends PenaltySuper{
	@Override
	public void showPenalty(AccountDataSuper ds)
	{
		float balance=ds.getBalance()-20;
	ds.setBalance(balance);
	System.out.println("Updated Balance:"+ds.getBalance());
}
		
	}
	

