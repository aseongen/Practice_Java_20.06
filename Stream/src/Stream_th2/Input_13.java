package Stream_th2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Input_13 {
	public static void main(String[] args) throws IOException {

		ObjectInputStream in =null;
		//파일로부터 객체 단위로 읽어옴
		ObjectOutputStream out = null;
        //파일에 객체단위로 기록
		
		try {
			out = new ObjectOutputStream(
					new FileOutputStream("./src/Stream_th2/object01.txt"));
			
        //object01.txt 파일이 생성되고 ObjectOutputStream 에 의해서 객체 단위로 파일에 기록저장한다.
	    //하지만 객체로 주소가 저장되기 떄문에(DATE 내용) 해당 파일을 열었을 때 파일 깨짐 현상이 발생한다.
			out.writeObject(new Date());
			out.flush();
			
			in = new ObjectInputStream(
					new FileInputStream("./src/Stream_th2/object01/txt"));
			//파일로부터 객체 단위로 읽어드리기 위한 in 객체 생성
			Date d = (Date) in.readObject();//객체 단위로 읽어들임
			System.out.println(d.toString()); //문자열로 변경해서 날짜값 출력
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(in != null) in.close();
			if(out != null) out.close();
		 //final 에서는 자손클래스 만들지(상속)받지 못한다. ->해킹 방지하기 위해
		 //해당 메서드가 final 오버라이딩 안됨
		 //상수 수정할 수 없다. 
		}
		
	
		
	}
}
