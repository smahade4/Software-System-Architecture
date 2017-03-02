package Actions;

import DataStore.AccountDataSuper;

public class DisplayBalance1 extends DisplayBalanceSuper{
@Override
	public void showDisplaybalance(AccountDataSuper ds) {
		System.out.println("balance is"+ds.getBalance());
	}
}
