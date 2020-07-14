package Stream_th;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Input06 {
	public static void main(String[] args) {
     int data=0;
     System.out.print("파일에 저장할 내용>> ");
     
     try {
        File f=new File("./src/Stream/test.txt");
        FileOutputStream fos = new FileOutputStream(f);
//주어진 파일에 바이트 단위로 쓰기위한 fos생성
        while((data= System.in.read()) != -1) {
        	fos.write(data);//파일에 기록
        }
        fos.close();
     }catch(FileNotFoundException fe) {
    	 fe.printStackTrace();
     }catch(IOException ie) {
    	 ie.printStackTrace();
     }
	}
}



