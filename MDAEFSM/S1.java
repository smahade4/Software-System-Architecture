package MDAEFSM;

public class S1 extends State{

	public S1(MDAEFSM mdaefsm) {
		// TODO Auto-generated constructor stub
		id=4;

	}
	
	@Override
	public void WithdrawBelowMinBalance(){
		op.showPenalty();
	}
	

}
