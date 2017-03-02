package DataStore;

public class AccountData1 extends AccountDataSuper{

	float tempbalance;
	String tempuserid;
	String pin;
	float balance;
	float tempdeposit;
	float tempwithdraw;
	String temppin;
	String userid;
	
	@Override
	public float getTempbalance() {
		return tempbalance;
	}
	@Override
	public void setTempbalance(float tempbalance) {
		this.tempbalance = tempbalance;
	}
	
	@Override
	public String getTempuserid() {
		return tempuserid;
	}
	@Override
	public void setTempuserid(String tempuserid) {
		this.tempuserid = tempuserid;
	}
	
	@Override
	public String getPin() {
		return pin;
	}
	@Override
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	@Override
	public float getBalance() {
		return balance;
	}
	
	@Override
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	@Override
	public float getTempdeposit() {
		return tempdeposit;
	}
	
	@Override
	public void setTempdeposit(float tempdeposit) {
		this.tempdeposit = tempdeposit;
	}
	
	@Override
	public float getTempwithdraw() {
		return tempwithdraw;
	}
	
	@Override
	public void setTempwithdraw(float tempwithdraw) {
		this.tempwithdraw = tempwithdraw;
	}
	
	@Override
	public String getTemppin() {
		return temppin;
	}
	
	@Override
	public void setTemppin(String temppin) {
		this.temppin = temppin;
	}
	
	@Override
	public String getUserid() {
		return userid;
	}
	
	@Override
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
}
