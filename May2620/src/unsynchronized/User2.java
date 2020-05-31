package unsynchronized;

public class User2 extends Thread {

	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}//SetCalculator

	@Override
	public void run() {
      calculator.setMemory(50);
	}//override
	
}//user2
