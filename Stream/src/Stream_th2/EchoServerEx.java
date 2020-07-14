package Stream_th2;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerEx {
    ServerSocket server=null;//서버소캣클래스는 서버상에서 사용자 접속을 기다리
    //기 위해서 필요하다.
    static final int PORT = 5000;//정적상수로 서버상의 포트번호 지정
    Socket child;//소캣은 사용자와 데이터 송수신을 위해서 필요한 클래스
    
    InputStream is;//바이트 단위로 읽어들이기 위한 최상위 추상클래스
    ObjectInputStream ois;//객체단위로 읽어들이기 위해서 필요한 클래스    
    
    OutputStream os;//바이트 단위 출력스트림 최상위 추상클래스
    ObjectOutputStream oos;//객체단위로 출력하기 위한 클래스
    
    String receiveData;//사용자로 부터 전송받은 자료를 저장할 변수
    
    public EchoServerEx() {
    	try {
    		server=new ServerSocket(PORT);//서버소캣객체 생성
    		System.out.println("***채팅 에코 서버***");
     System.out.println("서버는 클라이언트 소캣의 접속요청을 기다리고 있음!");
            child=server.accept();//사용자 접속이 이루어지면 서버상의 소캣객
            //체가 생성
 System.out.println(child.getInetAddress()+"로 부터 연결요청받음.");
 //클라이언트 ip주소를 얻음.
 
            is=child.getInputStream();
            ois=new ObjectInputStream(is);//입력스트림 객체 생성
            
            os=child.getOutputStream();
            oos=new ObjectOutputStream(os);//출력스트림 객체 생성
            
            while((receiveData =(String)ois.readObject()) != null) {
            	//사용자가 보낸 데이터를 읽어옴
            	if(receiveData.equals("quit"))
            		break;//반복문 중단
            	oos.writeObject(receiveData);//다시 사용자에게 전송
            	oos.flush();//출력스트림 버퍼를 비움
            }            
    	}catch(Exception e) {
    		e.printStackTrace();
    		System.exit(0);//정상적으로 프로그램 종료
    	}finally {
    		try {
    			if(is != null) is.close();
    			if(ois != null) ois.close();
    			if(os != null) os.close();
    			if(oos != null) oos.close();
    		}catch(Exception e) {e.printStackTrace();}
    	}//finally
    }//생성자
    
	public static void main(String[] args) {
      new EchoServerEx();//생성자
	}
}



