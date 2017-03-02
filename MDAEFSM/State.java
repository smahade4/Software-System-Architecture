package MDAEFSM;

import Actions.OutputProcessor;
import Factory.AbstractFactory;

public class State {

	static OutputProcessor  op;
	static MDAEFSM m;
	int id;

public int get_id()
{
	return id;
}


public void initalize(OutputProcessor op,MDAEFSM m){
	this.op=op;
	this.m=m;	
}

public void open(){	
}
public void Login(){}
public void IncorrectLogin(){}
public void IncorectPin(int max){}
public void CorrectPinBelowMin(){}
public void CorrectPinAboveMin(){}
public void Deposit(){}
public void BelowMinBalance(){}
public void AboveMinBalance(){}
public void Logout(){}
public void Balance(){}
public void Withdraw(){}
public void WithdrawBelowMinBalance(){}
public void NoFunds(){}
public void Lock(){}
public void IncorrectLock(){}
public void Unlock(){}
public void IncorrectUnlock(){}
public void Suspend(){}
public void Activate(){}

}
