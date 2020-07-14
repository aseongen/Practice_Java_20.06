package Stream_th2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ImageCopy {
	public static void main(String[] args) 
	throws IOException{
     Scanner scan = new Scanner(System.in);
/* 1.Scanner는 자바5에서 추가된 클래스로 무엇을 콘솔로 부터 입력받을 때 사용한다.
 * 2.System.in 은 입력장치 키보드와 연결됨.     
 */
     System.out.println("사전에 구글로 부터 다운로드 받은 원본그림 "+
 " 한여름에 지리산계곡물 빨간수박(./src/a.jpg) >> ");
     String name01 = scan.nextLine();
     System.out.println("복사되어질 이미지 파일명(./src/b.jpg) >> ");
     String name02 = scan.nextLine();
 /*문제)구글로 부터 해당 그림을 a.jpg로 다운받는다. 그리고 스캐너로 입력받은 b.jpg
  *  복사본이미지를 만드는 프로그램을 만든다.사용되어질 클래스는 FileInputStream,
  *  FileOutputStream이다. 이 2클래스는 자바 7에서 추가된 AutoCloseable인터
  *  페이스를 구현했기 때문에 try()내에서 객체를 in,out으로 생성하면 finally에서
  *  명시적으로 close()를 하지 않아도 자동으로 닫힌다. 참고소스 Input07.java를
  *  참조해서 이미지 복사프로그램을 만들어 보자.     
  */     
     try(FileInputStream in=new FileInputStream(name01);
    		 FileOutputStream out=new FileOutputStream(name02)){
    	 int data;//파일로 부터 읽어들인 데이터를 저장할 변수
    	 
    	 while((data = in.read()) != -1) {
    		 out.write(data);//복사본 이미지가 만들어 진다.
    	 }
     }     
     System.out.println(name01+"을 "+name02+"로 복사했습니다.");
	}
}







