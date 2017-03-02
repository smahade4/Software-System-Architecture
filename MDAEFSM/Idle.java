package MDAEFSM;

public class Idle extends State{

	public Idle(MDAEFSM mdaefsm) {

		id=1;
		}
	@Override
	public void Login(){    
		System.out.println("inside idle state login function");
		System.out.println("Log in sucessful");
		System.out.println("m is "+m);
		m.setAttempts(0);
		
		op.showPromptsforpin();
	}
	@Override
	public void IncorrectLogin(){

		System.out.println("inside idle state incorrectlogin function");
		System.out.println("output processor is "+op);
		op.showIncorrectid();
	}

	
}
