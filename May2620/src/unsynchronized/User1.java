package unsynchronized;

public class User1 extends Thread {

	private Calculator calculator;
	
   //이클립스 메뉴로 setter 만 정의
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}

	@Override
	public void run() {
     calculator.setMemory(100);// 메모리값 100저장
	
	}//override

} //User1
