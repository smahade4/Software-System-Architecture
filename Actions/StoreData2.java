package Actions;

import DataStore.AccountDataSuper;

public class StoreData2 extends StoreDataSuper{

	@Override
	public void showStoreData(AccountDataSuper ds)
	{
		ds.setUserid2(ds.getTempuserid2());
		ds.setPin2(ds.getTemppin2());
		ds.setBalance2(ds.getTempbalance2());
		System.out.println("Account2:The data  stored");
		System.out.println("Account2"+ds.getUserid2());
		
	}
	
}
