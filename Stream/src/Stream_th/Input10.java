package Stream_th;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Input10 {
	public static void main(String[] args) throws IOException{

    	 FileReader inputStream = null;
    	 //FileReader : 파일로 부터 문자단위로 읽어들임
    	 
    	 FileWriter outputStream = null;
    	 //FileWrtier : 파일에 문자단위로 기록
    	 
         try {
        	 inputStream = new FileReader("./src/input.txt");
        	 outputStream = new FileWriter("./src/output2.txt");
        	 int data = 0; //읽어들인 데이터를 저장할 변수 
        	 
        	 while((data = inputStream.read()) != -1) {
        		 outputStream.write(data);
        		 
        	 }
         }finally {
        	 if(inputStream != null) inputStream.close();
        	 if(outputStream != null) outputStream.close();
         }
	
	}
}
