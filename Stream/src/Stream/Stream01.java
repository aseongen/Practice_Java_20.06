package Stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stream01 {
	public static void main(String[] args) {
		
		
		InputStreamReader rd = new InputStreamReader(System.in);
		//표준 입력 스트림인 System.in 은 InputStream 타입으로 바이트 입력 스트림
		
		try {
			int c = rd.read();
			System.out.println(c);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		
		try {
			FileReader fin = new FileReader("c:\\test.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
