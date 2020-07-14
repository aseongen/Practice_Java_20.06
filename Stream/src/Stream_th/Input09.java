package Stream_th;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Input09 {
	public static void main(String[] args) {


		String fileName;
		String buf;
		
		Reader myIn = new InputStreamReader(System.in);
		/*조상타입으로 올라간 업캐스팅
		 * InputStreamReader 바이트를 문자 스트림으로 변경하는 증개 매개체
		 */

		BufferedReader keyBr = new BufferedReader(myIn);
		//BufferedReader : 읽어들인 문자를 버퍼링해서 효율적으로 읽어들임
		
		try {
			
			System.out.println("파일명 입력:(./src/Stream_th/Input09.java");
			fileName = keyBr.readLine();
			
			FileReader fr = new FileReader(fileName);
			//주어진 파일로부터 문자단위로 파일내용을 읽기 위한 fr 생성
			
			BufferedReader fileBr = new BufferedReader(fr);
			//파일 내용을 버퍼링해서 효율적으로 읽어들이기 위한 fileBr 생성
			
			//반복문 사용해서 읽어들일 파일 내용이 있을 경우 읽어들여  있을경우 buf변수에 저장
			
			while((buf = fileBr.readLine()) != null) {
                     System.out.println(buf);
			}
			fileBr.close(); fr.close();
			
		}catch(IOException ie) {ie.printStackTrace();}
	
	
	
	}
}
