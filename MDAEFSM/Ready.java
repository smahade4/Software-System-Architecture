package MDAEFSM;

public class Ready extends State{

	public Ready(MDAEFSM mdaefsm) {
		// TODO Auto-generated constructor stub
		id=3;
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
		op.showMakewithdraw();
	}
	@Override
	public void IncorrectLock(){
		op.showIncorrectlock();
	}
	@Override
	public void NoFunds(){
		op.showNofunds();
	}

}
