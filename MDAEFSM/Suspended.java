package MDAEFSM;

public class Suspended extends State{

	public Suspended(MDAEFSM mdaefsm) {
		// TODO Auto-generated constructor stub
		
		id=7;
	}
	@Override
	public void Balance(){
		op.showDisplaybalance();
	}

}
