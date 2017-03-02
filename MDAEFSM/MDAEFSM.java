package MDAEFSM;

public class MDAEFSM {

	State slist[]={new Start(this),new Idle(this),new CheckPin(this),new Ready(this),new S1(this),new Overdrawn(this),new Locked(this),new Suspended(this),new Stop()};

	State s=slist[0];
	int attempts;

public void Open(){
	
	int id=s.get_id();
	System.out.println("State Id:"+s.get_id());
	if(id==0)
	{
		System.out.println("change of state from start to idle");
		s.open();
		s=slist[1];
		System.out.println("New state Id:"+s.get_id());
	}
	else
	{		System.out.println("Inavalid Input");
	}
}
public void Login(){
int id=s.get_id();
System.out.println("id is"+id);
System.out.println("inside mdaefsm Login");
	if(id==1)
			{
		System.out.println("change of state from idle to CheckPin");
			
	s.Login();
	s=slist[2];
	System.out.println("New state Id:"+s.get_id());
	
			}
	else
	{
		System.out.println("Invalid Input");
	}
}
public void IncorrectLogin(){
	int id=s.get_id();
	System.out.println("id is"+id);
	System.out.println("inside incorrect login");
	if(id==1)
		{
		System.out.println("Stays is  Idle state:");
		s.IncorrectLogin();
	//s=slist[1];
		}
	else
	{
		System.out.println("Invalid Input");
	}
}
public void IncorectPin(int max){
	int id=s.get_id();
	
	if(id==2){
	if(getAttempts()<max){
		System.out.println("Stays is  CheckPin state:");
	s.IncorectPin(max);
	s=slist[2];}
	else{
		System.out.println("Current State:Idle:");
		s.IncorectPin(max);
		s=slist[1];
	}
	}else
	{
		System.out.println("Invalid Input");
	}
}
public void CorrectPinBelowMin(){
	int id=s.get_id();
	System.out.println("inside correct pin below  min");
	System.out.println("State Id:"+s.get_id());
	if(id==2){
		System.out.println("idle below min");
	s.CorrectPinBelowMin();
	s=slist[5];
	}
	else{
		System.out.println("Invalid Input");
	}
}
public void CorrectPinAboveMin(){
	int id=s.get_id();
	System.out.println("State Id:"+s.get_id());
	if(id==2){
	System.out.println("go to Ready state");
	s.CorrectPinAboveMin();
	s=slist[3];
	}else
	{
		System.out.println("Invalid Input");
	}
}
public void Deposit(){
	int id=s.get_id();
	System.out.println("State Id:"+s.get_id());
	if(id==3)
	{
		System.out.println("ready state deposit");
	s.Deposit();
	}
	else if(id==5)
	{

		System.out.println("overdrawn state deposit");
	s.Deposit();
	s=slist[4];
	}
	else
		{
		System.out.println("Invalid Input");
	}
}
public void BelowMinBalance(){
	int id=s.get_id();
	System.out.println("State Id:"+s.get_id());
	if(id==4){
	System.out.println("Current State:s1");
	s.BelowMinBalance();
	s=slist[5];
	}
	else
	{
		System.out.println("Invalid Input");
	}
}
public void AboveMinBalance(){
	int id=s.get_id();
	System.out.println("State Id:"+s.get_id());
if(id==4)
	{System.out.println("Current State:s1");
	s.AboveMinBalance();
	s=slist[3];
	}
else
	{System.out.println("Invalid Input");
}
}
public void Logout(){
	int id=s.get_id();
	System.out.println("State Id:"+s.get_id());
	if(id==3)
	{System.out.println("Current State:ready");
	//s.AboveMinBalance();
	s.Logout();

	s=slist[1];
	}
else if(id==5)
{System.out.println("Current State:overdrawn");
	//s.AboveMinBalance();
	s.Logout();

	s=slist[1];
}
else if(id==2)
{
	s.Logout();

	System.out.println("Current State:checkpin");
	s=slist[1];
	
}
else
	{System.out.println("Invalid Input");
}}
public void Balance(){
	int id=s.get_id();
	System.out.println("State Id:"+s.get_id());
	System.out.println("Display Balance::"+s.get_id());
	if(id==3){
	System.out.println("Current state:Ready");
	s.Balance();
	}
	if(id==5)
	{
		System.out.println("Current state:Overdrawn");
	s.Balance();
	}
	if(id==7)
		{System.out.println("Current state:Suspended");
	s.Balance();
	}
	else
	{
  System.out.println("Invalid Input");
}
}
public void Withdraw(){
	int id=s.get_id();
	System.out.println("State Id:"+s.get_id());
	if(id==3){
		System.out.println("Making a Withdraw:");
	s.Withdraw();
	s=slist[4];
	}
	if(id==5)
		{System.out.println("Making a Withdraw:");
	s.Withdraw();
	//s=slist[4];
		}
	else
	{	System.out.println("Invalid Input");
	}
}
public void WithdrawBelowMinBalance(){
	int id=s.get_id();
	System.out.println("State Id:"+s.get_id());
	if(id==4)
			{System.out.println("Withdraw with penality");
	s.WithdrawBelowMinBalance();
	s=slist[5];
			}
	else
	{
		System.out.println("Invalid Input");
	}
}
public void NoFunds(){
	int id=s.get_id();
	System.out.println("State Id:"+s.get_id());
	if(id==3){
		System.out.println("No funds:");
	s.NoFunds();
	}
	else
	{		
		System.out.println("Invalid Input");
	}
}
public void Lock(){
	int id=s.get_id();
	System.out.println("State Id:"+s.get_id());
	if(id==3)
		{System.out.println("Locking the account:Change of state from ready to locked");
	s.Lock();
	s=slist[6];
		}
	if(id==5)
		{System.out.println("Locking the account:Change of state from overdrawn to locked");
	s.Lock();
	s=slist[6];
		}
	else
		{System.out.println("Invalid Input");
	}
}
public void IncorrectLock(){
	int id=s.get_id();
	System.out.println("State Id:"+s.get_id());
	if(id==3)
		{System.out.println("Incorrect Lock:ready state");
	s.IncorrectLock();
		}
	if(id==5)
		{System.out.println("Incorrect Lock:overdrawn state");
	s.IncorrectLock();
		}
	else
		{
		System.out.println("Invalid Input");
	}
}
public void Unlock(){
	int id=s.get_id();
	System.out.println("State Id:"+s.get_id());
	if(id==6){
		System.out.println("unLocking the account:Change of state from locked to s1");
	s.Unlock();
	s=slist[4];
	}
	else
		{System.out.println("Invalid Input");
	}
}
public void IncorrectUnlock(){
	int id=s.get_id();
	System.out.println("State Id:"+s.get_id());
	if(id==6)
	{
	s.IncorrectUnlock();
	System.out.println("Incorrect Unlock; in locked state");

	}

	else
		{System.out.println("Invalid Input");
	}
}
public void Suspend(){
	int id=s.get_id();
	System.out.println("State Id:"+s.get_id());
	if(id==3)
	{
	s.Suspend();
	System.out.println("Suspend the account:Change of state from ready to suspended");
	s=slist[7];
	}
	else
		{System.out.println("Invalid Input");
	}
}
public void Activate(){
	int id=s.get_id();
	System.out.println("State Id:"+s.get_id());
	if(id==7)
		{System.out.println("Activate a suspended account:");
	s.Activate();
	s=slist[3];
		}

	else
		{System.out.println("Invalid Input");
	}
}
public void Close(){
	int id=s.get_id();
if(id==7)	
	{System.out.println("Closing the account:");
	s=slist[8];
	}
else
	{System.out.println("Invalid Input");
	}
}
public int getAttempts() {
	return attempts;
}
public void setAttempts(int attempts) {
	this.attempts = attempts;
}

}
