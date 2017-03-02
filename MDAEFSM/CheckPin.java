package MDAEFSM;

public class CheckPin extends State {

	public CheckPin(MDAEFSM mdaefsm) {
	id=2;
	}
	
	@Override
	public void IncorectPin(int max){
		int attempts=m.getAttempts();
		if(attempts<max){
			
			attempts++;
			m.setAttempts(attempts);
			op.showIncorrectpin();
		}
		else if(attempts==max){
			op.showIncorrectpin();
			op.showToomanyattempts();		}

		}
	
	@Override
	public void CorrectPinBelowMin(){
		op.showdisplaymenu();

	}
	@Override
	public void CorrectPinAboveMin(){
		op.showdisplaymenu();

	}

	
}
