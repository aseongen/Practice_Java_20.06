package Stream_th2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Input_15 {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream("./src/Stream_th2/t.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		//파일로 부터 객체 단위로 읽기 위한 ois 생성
		
		String name = (String) ois.readObject(); ///객체 단위로 읽고 다운캐스팅
		
		Date d = new Date();
		
		System.out.println("이름: " + name);
		System.out.println("날짜: " + d.toString());
		
		
	
	}

}
