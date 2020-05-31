package Review;

class Atm {
	private int money;

	public Atm(int m) {
		this.money = m;
	}// 생성자

	synchronized void deposit(int amount, String name) {
		money += amount;
		System.out.println(name + ": 입금금액: " + amount);
	}// deposit

	synchronized void withdraw(int amount, String name) {
		if ((money - amount) > 0) {
			money -= amount;
			System.out.println(name + " 출금금액 : " + amount);
		} else {
			System.out.println(name + "출금못함(잔액이 부족)");
		} // if~else
	}// withdraw

	public void getmoney() {
		System.out.println("   계좌잔액은: " + money);
	}//getmoney()
}// Atm

class AtmUser extends Thread{
	boolean flag= false;
	Atm obj;
	public AtmUser(Atm obj,String name) {
		super(name);
		this.obj=obj;
	}//AtmUser
	
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				sleep(500);
			}catch(InterruptedException e) {}
			if(flag) {
				obj.deposit((int)(Math.random()*10+2)*100,getName());
			    obj.getmoney();
			}else {
				obj.withdraw((int)(Math.random()*10+2)*100,getName());
			    obj.getmoney();
			}
			flag = !flag;
			
/* a != 3 : a는 3이 아니다.
 * flag = !flag : 느낌표 자체가 boolean 타입이다.
 *              : flag가 true 일 경우 !flag -> false 로 변환하면 된다.
 */
		}//for 
	}
}//AtmUSer


public class TEST6 {
	public static void main(String[] args) {

		Atm obj = new Atm(1000);
		AtmUser user1 = new AtmUser(obj,"성윤정");
		AtmUser user2 = new AtmUser(obj,"전수빈");
		AtmUser user3 = new AtmUser(obj,"전원지");
		
		user1.start();
		user2.start();
		user3.start();
		
	}//main
}//class
