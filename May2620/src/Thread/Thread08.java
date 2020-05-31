package Thread;

class CalcThread extends Thread{

	CalcThread(String name){
	  setName(name);//스레드 이름을 변경설정 	
	}//생성자 오버로딩 
	
	@Override
	public void run() {

		for(int i=1;i<=2000000000;i++) {} //스레드 문장 구현
	    System.out.println(getName()); //getName()으로 스레드 이름 반환
	}//override
	
}//class CalcThread

public class Thread08 {
	public static void main(String[] args) {


     //thread1~thread10까지 스레드 이름 생성 
		for(int i=1; i<=10;i++) {
			Thread th= new CalcThread("thread" + i);
			
			if(i !=10) {//1부터 9까지 인 경우 실행 
				th.setPriority(Thread.MIN_PRIORITY); //가장 낮은 우선순위를 1로 설정
				//Min_priority : 정적상수 : 스레드 우선순위 값 : 1
			}else{ //10일때 실행
			 th.setPriority(Thread.MAX_PRIORITY);//가장 높은 우선순위 10으로 설정
			//Max_Priority : 정적상수는 스래드 우선순위값 10 
			}//if~else 
			th.start();
			
		}//for
	}//main
}//class

//랜덤으로 실행된다. 
