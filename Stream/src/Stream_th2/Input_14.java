package Stream_th2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Input_14 {
	public static void main(String[] args) 
	throws IOException{
      String name = new String("홍길동");
      Date d=new Date();
      
      FileOutputStream fos = new FileOutputStream("./src/Stream_th2/t.txt");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      //t.txt파일이 생성되고 객체 단위로 기록함
      
      oos.writeObject(name);//문자열 객체가 업캐스팅 되면서 저장됨.
      oos.writeObject(d);
      oos.flush();
      oos.close();	
	}
}






