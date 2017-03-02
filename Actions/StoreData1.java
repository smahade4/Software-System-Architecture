package Actions;

import DataStore.AccountDataSuper;

public class StoreData1 extends StoreDataSuper {

	@Override
	public void showStoreData(AccountDataSuper ds)
	{
		ds.setUserid(ds.getTempuserid());
		ds.setPin(ds.getTemppin());
		ds.setBalance(ds.getTempbalance());
		System.out.println("Account1:The data  stored");
		System.out.println("Account1"+ds.getUserid());
		
	}
	
}
