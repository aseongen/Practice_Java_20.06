package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice_03 {
	public static void main(String[] args) {

		InputStreamReader in = null;
		FileInputStream fin = null;
		
		try{
			
			fin = new FileInputStream("./src/practice/practice_03.java");
			in = new InputStreamReader(fin, "MS949");
			int c;
			
			System.out.println("인코딩 문자 집합은 " + in.getEncoding());
			
			while((c = in.read())!= -1) {
				System.out.println((char)c);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
