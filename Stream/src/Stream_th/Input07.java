package Stream_th;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Input07 {
	public static void main(String[] args) throws IOException{
      FileInputStream in=null;
      FileOutputStream out=null;
      
      try {
    	 in = new FileInputStream("./src/input.txt");
    	 //input.txt를 만들고 이 파일로 부터 바이트 단위로 읽어들이는 in을 생성
    	 out = new FileOutputStream("./src/output.txt");
    	 //output.txt파일이 생성되면서 이 파일에 바이트 단위로 기록한다.
    	 int data=0;
    	 while((data = in.read()) != -1){
    		 out.write(data);//파일에 기록
    	 }
      }finally {
        if(out != null) out.close();
        if(in != null) in.close();
      }
	}
}



