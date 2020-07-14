package Stream_th2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Input_16 {
	public static void main(String[] args) {
		
		int id = 10;
		String name = "이순신";
		int age =25;
		double height = 165.6;
		
		try {
		 FileOutputStream fos = new FileOutputStream("./src/Stream_th2/t2.txt");
		 ObjectOutputStream oos = new ObjectOutputStream(fos);
		 //t2.txt 파일이 생성되고 객체 단위로 기록하기 위한 oos 생성
		 
		 oos.writeObject(new Integer(id));
		 //기본타입  int id 같이 참조 레퍼클래스 타입 Integer 타입으로 변경되는 오토박싱화 되면서 업캐스팅되면서 저장
			
		 oos.writeObject(name);//업캐스팅 되면서 저장
		 oos.writeObject(new Integer(age));//오토박싱 + 업캐스팅
		 oos.writeObject(new Double(height));
		 
		 oos.close(); fos.close();
		 
		}catch(IOException ie) {
			ie.printStackTrace();

		}
		
		
		
		

	}

}
