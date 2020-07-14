package Stream_th2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Input_17 {
	public static void main(String[] args) throws ClassNotFoundException {

		int id;
		String name = "";
		int age;
		double height;

		try {
			FileInputStream fis = new FileInputStream("./src/Stream_th2/t2.txt");
			ObjectInputStream oos = new ObjectInputStream(fis);
			//t2.txt 파일로 부터 객체 단위로 읽어들어와서 출력한다.
			
			id =(Integer)oos.readObject();//다운캐스팅 +오토언박싱
			//오토언박싱: 참조타입이 기본타입으로 변경되는 것
			name =(String)oos.readObject();
			age=(Integer)oos.readObject();
			height=(Double)oos.readObject();
			
			System.out.println("id \t name \t age \t height");
			System.out.println("==============================");
			System.out.println(id + "\t" + name + "\t" +height );
			
			oos.close(); fis.close();
			
		} catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		
		} catch (IOException ie) {
			ie.printStackTrace();
			
		}

	}
}
