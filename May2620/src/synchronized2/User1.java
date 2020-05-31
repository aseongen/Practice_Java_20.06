package synchronized2;

import unsynchronized.Calculator;

public class User1 extends Thread {

	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}

	@Override
	public void run() {
     calculator.setMemory(100);// 메모리값 100저장
	}//override

} //User1
