package Stream_th2;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiEchoServerEx {
	ServerSocket server;//서버 소캣=>서버상에서 사용자 접속을 기다리기 위해서 필요한 클래스
	static final int PORT=5600;
	Socket child;//사용자와 통신하기 위해서 필요한 클래스
	
	public MultiEchoServerEx() {
       try {
    	   server=new ServerSocket(PORT);
       }catch(Exception e) {
    	   e.printStackTrace();
    	   System.exit(0);//프로그램 종료
       }
       System.out.println("*** 채팅 서버 ***");
       System.out.println("서버는 클라이언트 접속을 기다리고 있음");
       
       while(true) {
    	   try {
    		   child = server.accept();//클라이언트 접속이 이루어 지면
    		   //서버상의 소캣객체가 생성됨.
    		   
    		   /*** 스레드 객체 생성 ***/
    		   EchoServerThread childThread=
    				   new EchoServerThread(child);
    		   Thread t=new Thread(childThread);
    		   t.start();//스레드가 시작되고 run()메서드 내부적 자동 호출
    	   }catch(Exception e) {
    		   e.printStackTrace();
    		   System.exit(0);
    	   }
       }//무한루프문
	}//생성자
	
	public static void main(String[] args) {
     new MultiEchoServerEx();
	}
}//MultiEchoServerEx class

//멀티스레드
class EchoServerThread implements Runnable{
    Socket child;
    
    InputStream is;
    ObjectInputStream ois;
    
    OutputStream os;
    ObjectOutputStream oos;
    
    String receiveData;//사용자로 부터 전송받은 자료를 저장할 변수
    
    public EchoServerThread(Socket s) {
    	child=s;
    	try {
    	System.out.println(child.getInetAddress()+"로 부터 연결");
    	//getInetAddress()메서드로 클라이언트 컴 ip주소를 얻는다.
    	
    	is=child.getInputStream();
    	ois=new ObjectInputStream(is);
    	
    	os=child.getOutputStream();
    	oos=new ObjectOutputStream(os);
    	}catch(IOException ie) {
    		ie.printStackTrace();
    	}		
	}//생성자
    
	@Override
	public void run() {
	try {
	  while(true) {
        receiveData = (String)ois.readObject();//사용자로 부터 받은 메시지를 저장
        System.out.println(child.getInetAddress()+"의 메시지 : "+
         receiveData);
        oos.writeObject(receiveData);//다시 사용자에게 보냄
        oos.flush();//출력스트림을 비움
	  }//무한루프 while
	}catch(Exception e) {
		System.out.println("클라이언트 강제 종료");
	}finally {
		try {
          if(is != null) is.close();
          if(os != null) os.close();
          if(ois != null) ois.close();
          if(oos != null) oos.close();
          if(child != null) child.close();
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}//finally
	}//멀티스레드 문장구현	
}
