package Stream_th2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Input_18 {

	public static void main(String[] args) {
      Customer cus=new Customer(7,"이순신",27,175);
      try {
   	  System.out.println(cus.toString());
/* 문제)toString()메서드를 이클립스 메뉴로 오버라이딩을 해서 초기화 된 멤버변수값을 
 * 반환해서 출력해 보자.    	  
 */
   	  FileOutputStream fos=new FileOutputStream("./src/t3.txt");
   	  ObjectOutputStream oos=new ObjectOutputStream(fos);
   	  //생성된 파일에 객체단위로 저장하기 위한 oos를 생성
   	  oos.writeObject(cus);
   	  
   	  oos.close(); fos.close();
      }catch(IOException ie) {
    	  ie.printStackTrace();
      }
	}
}


