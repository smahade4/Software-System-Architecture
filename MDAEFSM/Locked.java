package MDAEFSM;

public class Locked extends State{

	public Locked(MDAEFSM mdaefsm) {
		// TODO Auto-generated constructor stub
	id=6;
	}
	
	@Override
	public void IncorrectUnlock(){
		op.showIncorrectunlock();
	}

}
