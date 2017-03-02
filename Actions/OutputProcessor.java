package Actions;

import DataStore.AccountDataSuper;
import Factory.AbstractFactory;

public class OutputProcessor {
	private AccountDataSuper ds;
	private AbstractFactory af;
	private DisplayBalanceSuper displaybalance;
	private DisplayMenuSuper displaymenu;
	private IncorrectIdMsgSuper incorrectid;
	private IncorrectPinMsgSuper incorrectpin;
	private IncorrectLockMsgSuper incorrectlock;
	private IncorrectUnlockMsgSuper incorrectunlock;
	private MakeDepositSuper makedeposit;
	private MakeWithdrawSuper makewithdraw;
	private NoFundsMsgSuper nofunds;
	private PenaltySuper penalty;
	private PromptsForPinSuper promptsforpin;
	private StoreDataSuper storedata;
	private TooManyAttemptsMsgSuper toomanyattempts;
		
	public void showDisplaybalance() {
		displaybalance=af.getDisplayBalance();
		displaybalance.showDisplaybalance(ds);
	}
	
	public void showdisplaymenu() {

		displaymenu=af.getDisplayMenu();
		displaymenu.showDisplayMenu();
	}
	
	public void showIncorrectid() {
		System.out.println("inside output processor incorrect id" +af);
		incorrectid=af.getIncorrectIdMsg();
		incorrectid.showIncorrectIdMsg();
	}
	
	public void showIncorrectpin() {
		incorrectpin=af.getIncorrectPinMsg();
		incorrectpin.showIncorrectPinMsg();
	}
	public void showIncorrectlock() {
		System.out.println("inside output processor incorrect lock" );
		incorrectlock=af.getIncorrectLockMsg();
		incorrectlock.showIncorrectLockMsg();
	}
	
	public void showIncorrectunlock() {
		incorrectunlock=af.getIncorrectUnlockMsg();
		incorrectunlock.showIncorrectUnlockMsg();
	}
	
	public void showMakedeposit() {
		makedeposit=af.getDeposit();
		
		makedeposit.showMakeDeposit(ds);
	}

	public void showMakewithdraw() {
		makewithdraw=af.getWithdraw();
		makewithdraw.showMakeWithdraw(ds);
	}
	public void showNofunds() {
		nofunds=af.getNoFundsMsg();
		nofunds.showNoFundsMsg();
	}
	
	public void showPenalty() {
		penalty=af.getPenalty();
		penalty.showPenalty(ds);
	}
	
	public void showPromptsforpin() {
		System.out.println("inside prompts for pin");
		
		promptsforpin=af.getPromptForPin();
		promptsforpin.showPromptsForPin();
	}
	
	public void showStoredata() {
		System.out.println("inside store data"+af + ds);
		System.out.println(ds.getTempuserid2());

		storedata=af.getStoreData();
		storedata.showStoreData(ds);
	}
	
	public void showToomanyattempts() {
		toomanyattempts=af.getTooManyAttempts();
	toomanyattempts.showTooManyAttempsMsg();
	}
	
	public void setData(AbstractFactory af,AccountDataSuper ds)
	{
		this.af=af;
		this.ds=ds;
		System.out.println(ds.getTempuserid2());
	}

	
	
}
