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

public class AbstractFactory {

	public AccountDataSuper getAccountData(){
		return null;
		}
	
	
	public DisplayBalanceSuper getDisplayBalance(){
		return null;
		}
	
	
	public DisplayMenuSuper getDisplayMenu(){
		return null;
			}
	
	public IncorrectIdMsgSuper getIncorrectIdMsg(){
		return null;
		
	}
	
	public IncorrectLockMsgSuper getIncorrectLockMsg(){
	
		return null;
		
	}
	
	
	public IncorrectPinMsgSuper getIncorrectPinMsg(){
	
		return null;
		
	}
	
	
	public IncorrectUnlockMsgSuper getIncorrectUnlockMsg(){
	
		return null;
		
	}
	
		
	public MakeDepositSuper getDeposit(){
		return null;
		
	}
	
	
	public MakeWithdrawSuper getWithdraw(){
		return null;
		
	}
	
	
	
	public NoFundsMsgSuper getNoFundsMsg(){
		return null;
		
	}
	
	public PenaltySuper getPenalty(){
		return null;
	}
	
	public StoreDataSuper getStoreData(){
		return null;
	}
	
	public PromptsForPinSuper getPromptForPin(){
		return null;
	}
	
	public TooManyAttemptsMsgSuper getTooManyAttempts(){
		return null;
	}
}
