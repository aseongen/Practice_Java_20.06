package Stream_th2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Input_19 {
	
	public static void main(String[] args) {
     try {
    	 FileInputStream fis=new FileInputStream("./src/t3.txt");
    	 ObjectInputStream ois=new ObjectInputStream(fis);
    	 //파일로 부터 객체단위로 읽기 위한 ois생성
    	 Customer cus=(Customer)ois.readObject();
    	 //객체단위로 읽어서 다운캐스팅해서 저장
    	 System.out.println("id \t name \t age \t height");
    	 System.out.println("===============================>");
    	 System.out.println(cus);
    	 
    	 ois.close(); fis.close();
     }catch(ClassNotFoundException ce) {
    	 ce.printStackTrace();
     }catch(IOException ie) {
    	 ie.printStackTrace();
     }
	}
}



