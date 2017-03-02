package MDAEFSM;

public class Overdrawn extends State {

	public Overdrawn(MDAEFSM mdaefsm) {
		// TODO Auto-generated constructor stub
		id=5;
	}
	@Override
	public void Deposit(){
		op.showMakedeposit();
	}

	@Override
	public void Balance(){
		op.showDisplaybalance();
	}
	@Override
	public void Withdraw(){
		System.out.println("inside overdrawn withdraw");
		op.showNofunds();
	}
	@Override
	public void IncorrectLock(){
		op.showIncorrectlock();
	}
}
