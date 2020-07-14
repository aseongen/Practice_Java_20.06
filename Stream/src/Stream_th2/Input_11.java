package Stream_th2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Input_11 {
	public static void main(String[] args) throws IOException {


	BufferedReader inputStream = null;
	PrintWriter outputStream = null;
	
	try {
		inputStream = new BufferedReader(new FileReader("./src/Stream_th2/input_11.java"));
		//파일로부터 문자단위로 읽어들인 내용을 버퍼링한다.
		//input : 읽어들임 , output: 기록하고,생성한다
		outputStream = new PrintWriter(new FileWriter("./src/Stream_th2/output3.txt"));
		//파일에 문자단위로 기록한다 =>효율적으로 기록하기 위해서 PrintWriter 객체 생성
				
		String data;
		while((data = inputStream.readLine())!= null){
			outputStream.print(data);
			
		}
	}finally {
		if(outputStream != null) outputStream.close();
		if(inputStream != null) inputStream.close();
	}
	
	}
}
