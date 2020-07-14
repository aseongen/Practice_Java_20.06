package Stream_th;

import java.io.FileInputStream;
import java.io.IOException;

public class Input05 {
	public static void main(String[] args) {
    
		int data=0;
		String path = "./src/Stream_th/Input05.java"; // 파일경로

		try {
			FileInputStream fis = new FileInputStream(path);
			//파일로 부터 바이트 단위로 읽기 위한 fis 생성
			while ((data = fis.read())!= -1) {
				System.out.write(data);
			}
			
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	
	}
}
