/* 멤버 변수 : 예금주 이름(name:String) 비밀번호(password : int) 잔액 (balance: int)
 * 생성자 - 3가지 멤버 변수 모두 매개값으로 받아 초기화 하는 생성자 생성
 * 메서드 - 입금 가능 메서드 (deposit:void) 출금기능 메서드(withDraw : void) 잔액(getbalance: int)
 */
class Account{
	
	String name;
	String password;
	int balance;
	
	Account(){} //생성자
	
	Account(String name, String password, int balance){
		this.name=name; this.password = password; this.balance = balance;
	}
	
	void deposit(int deposit){
		deposit += balance;
	}
	
	void withDraw(int withDraw){
		withDraw -= balance;
	}
	
	int getBalance() {
	   return balance;
	}
	
	
}//Account


public class C4 {
	public static void main(String[] args) {

		Account myAcc = new Account ("홍길동","1234",600);
		
		myAcc.deposit(800);
		myAcc.deposit(1900);
		
		int bal = myAcc.getBalance();
		System.out.println(myAcc.name + "님의 계좌 잔액은: " + bal + "원입니다.");
		
	}
}
