package Stream_th2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Input_12 {
	public static void main(String[] args) throws IOException{
//초기화
	  Scanner sc=null;
      double sum=0;//누적합
      PrintWriter out=null;//문자를 기록/출력
      
      try {
    	  out = new PrintWriter(
    			  new FileWriter("./src/outTest.txt"));
//outTest.txt파일이 생성되고 생성되는 파일에 기록하기 위한 out객체를 생성 	  
    	  out.println("10.5");
    	  out.println("100.0");//파일에 기록
    	  out.flush();//출력스트림을 비움
    	  sc=new Scanner(new BufferedReader(
    			  new FileReader("./src/outTest.txt")));
/* 1.자바 5에서 추가된 스캐너는 읽는 속도가 BufferedReader보다 떨어진다.그러므로
 * 읽는 속도 향상을 위해서 파일로 읽어들인 문자를 버퍼링한 스캐너 객체를 생성하면 읽는 속
 * 도가 향샹된다.     	  
 */
          while(sc.hasNext()) {//스캐너로 읽어들인 문자를 보관유지하면 참
        	  if(sc.hasNextDouble()) {//스캐너로 읽어들인것이 double타입
        		  //이면 참
        		  sum += sc.nextDouble();//실수값을 구해서 누적합을 계산
        	  }else {
        		  sc.next();//스캐너로 다음 문자를 검색
        	  }
          }//while
          System.out.println("누적합 = "+sum);          
      }finally {
        if(out != null) out.close();
        if(sc != null) sc.close();
      }
	}
}






