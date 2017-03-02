package MDAEFSM;

public class Start extends State{

	public Start(MDAEFSM mdaefsm) {
		id=0;
	}

	@Override
	public void open(){
		System.out.println("in start state");
		op.showStoredata();
	}
}
