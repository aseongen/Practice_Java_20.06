package Thread;

import java.util.Map;
import java.util.Set;

public class Thread18 {
	public static void main(String[] args) {

		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread"); //스레드 이름 설정
		autoSaveThread.setDaemon(true);//데몬 스레드 설정
		autoSaveThread.start();
	
	    Map<Thread,StackTraceElement[]> map = Thread.getAllStackTraces();
	    //getAllStackTrace : Map 타입의 객체를 리턴 
	    //프로세스 내에서 실행중인 모든 스레드에 대한 정보를 얻음 
	    //키는 스레드 객체, 값은 스레드의 상태기록을 갖고 있는 StackTraceElement 배열 
	    
	    Set<Thread> threads = map.keySet();//맵의 key를 다 가져온다.
	    
	    for(Thread thread: threads) {
	    	System.out.println("Name: " + thread.getName()+
	    			((thread.isDaemon())?"데몬" : "(주)"));
	    	//삼항조건연산자가 사용됨.
	    	//isDaemon(): 참이면 데몬 스레드이다.
	    	//getName(): 스레드 이름을 반환
	    	//thread.isDaemon()에서 ==true 생략 
	    	
	    	System.out.println("\t"+"소속그룹: " + thread.getThreadGroup().getName());
	    	//현재 스레드가 속한 스레드 그룹 이름을 얻는다. 
	    }//for
	}//main
}//class
