package Factory;

import Actions.DisplayBalance2;
import Actions.DisplayBalanceSuper;
import Actions.DisplayMenu2;
import Actions.DisplayMenuSuper;
import Actions.IncorrectIdMsg2;
import Actions.IncorrectIdMsgSuper;
import Actions.IncorrectPinMsg2;
import Actions.IncorrectPinMsgSuper;
import Actions.MakeDeposit2;
import Actions.MakeDepositSuper;
import Actions.MakeWithdraw2;
import Actions.MakeWithdrawSuper;
import Actions.NoFundsMsg2;
import Actions.NoFundsMsgSuper;
import Actions.PenaltySuper;
import Actions.PromptsForPin2;
import Actions.PromptsForPinSuper;
import Actions.StoreData2;
import Actions.StoreDataSuper;
import Actions.TooManyAttemptsMsg2;
import Actions.TooManyAttemptsMsgSuper;
import DataStore.AccountData2;
import DataStore.AccountDataSuper;

public class ClientFactory2 extends AbstractFactory{

	@Override
	public AccountDataSuper getAccountData(){
		return new AccountData2();
	}
	@Override
	public DisplayBalanceSuper getDisplayBalance(){
		return new DisplayBalance2();
	}
	@Override
	public DisplayMenuSuper getDisplayMenu(){
		return new DisplayMenu2();
		}
	@Override
	public IncorrectIdMsgSuper getIncorrectIdMsg(){
		return new IncorrectIdMsg2();
	}
	
	@Override
	public IncorrectPinMsgSuper getIncorrectPinMsg(){
		return new IncorrectPinMsg2();
	}
	
	@Override
	public MakeDepositSuper getDeposit(){
		return new MakeDeposit2();
	}
	@Override
	public MakeWithdrawSuper getWithdraw(){
		return new MakeWithdraw2();
	}
	@Override
	public NoFundsMsgSuper getNoFundsMsg(){
		return new NoFundsMsg2();
	}
	@Override
	public StoreDataSuper getStoreData(){
		return new StoreData2();
	}
	@Override
	public PromptsForPinSuper getPromptForPin(){
		return new PromptsForPin2();
	}
	@Override
	public TooManyAttemptsMsgSuper getTooManyAttempts(){
		return new TooManyAttemptsMsg2();
	}

}
