package Ramda;

public class FunctionTest06 {
	public static void main(String[] args) {
/* 문제)
 * 람다식 활용해서 Runnable 인터페이스 구현 한 스레드 만들어 for반복문으로 1부터 7까지 출력되는 문장 만들기
 * 
 * 람다식 활용해서 Thread 클래스 구현한 스레드를 만들어 while 반복문을 사용해 1부터 5까지 누적합 구해서 출력해본다. 
 */
		
		Runnable runnable =()->{
			for(int i =1;i<=7;i++) {
			System.out.print(i + "  ");
		   }
		};
       new Thread(runnable). start();
       /* 1. 클래스를 만들어 생성자를 생성한다. 
        * 2. 메인에서 생성자를 생성해서 호출한다. 
        */
       
       //2번문제)
       Thread th = new Thread(() ->  {
    	   int sum=0;
    	   int i=1;
    	   while(i<=5) {
    		   sum+=i;
    		   i++;
    	   }//while
    	   System.out.println("\n누적합: "+ sum);
       });
       th.start();
       
		
	}//main
}//class 
