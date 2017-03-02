package Factory;

import Actions.DisplayBalance1;
import Actions.DisplayBalanceSuper;
import Actions.DisplayMenu1;
import Actions.DisplayMenuSuper;
import Actions.IncorrectIdMsg1;
import Actions.IncorrectIdMsgSuper;
import Actions.IncorrectLockMsg1;
import Actions.IncorrectLockMsgSuper;
import Actions.IncorrectPinMsg1;
import Actions.IncorrectPinMsgSuper;
import Actions.IncorrectUnlockMsg1;
import Actions.IncorrectUnlockMsgSuper;
import Actions.MakeDeposit1;
import Actions.MakeDepositSuper;
import Actions.MakeWithdraw1;
import Actions.MakeWithdrawSuper;
import Actions.NoFundsMsg1;
import Actions.NoFundsMsgSuper;
import Actions.Penalty1;
import Actions.PenaltySuper;
import Actions.PromptsForPin1;
import Actions.PromptsForPinSuper;
import Actions.StoreData1;
import Actions.StoreDataSuper;
import Actions.TooManyAttemptsMsg1;
import Actions.TooManyAttemptsMsgSuper;
import DataStore.AccountData1;
import DataStore.AccountDataSuper;

public class ClientFactory1 extends AbstractFactory{
	@Override
	public AccountDataSuper getAccountData(){
		System.out.println("create acc1 object");
		return new AccountData1();
	}
	
	@Override
	public DisplayBalanceSuper getDisplayBalance(){
		return new DisplayBalance1();
	}
	
	@Override
	public DisplayMenuSuper getDisplayMenu(){
		return new DisplayMenu1();
		}
	
	@Override
	public IncorrectIdMsgSuper getIncorrectIdMsg(){
		return new IncorrectIdMsg1();
	}
	@Override
	public IncorrectLockMsgSuper getIncorrectLockMsg(){
		return new IncorrectLockMsg1();
	}
	
	@Override
	public IncorrectPinMsgSuper getIncorrectPinMsg(){
		return new IncorrectPinMsg1();
	}
	
	@Override
	public IncorrectUnlockMsgSuper getIncorrectUnlockMsg(){
		return new IncorrectUnlockMsg1();
	}
	
	@Override	
	public MakeDepositSuper getDeposit(){
		return new MakeDeposit1();
	}
	
	@Override
	public MakeWithdrawSuper getWithdraw(){
		return new MakeWithdraw1();
	}
	
	@Override
	public NoFundsMsgSuper getNoFundsMsg(){
		return new NoFundsMsg1();
	}
	
	@Override
	public PenaltySuper getPenalty(){
		return new Penalty1();
	}
	
	@Override
	public StoreDataSuper getStoreData(){
		return new StoreData1();
	}
	
	@Override
	public PromptsForPinSuper getPromptForPin(){
		return new PromptsForPin1();
	}
	
	@Override
	public TooManyAttemptsMsgSuper getTooManyAttempts(){
		return new TooManyAttemptsMsg1();
	}

	
}
