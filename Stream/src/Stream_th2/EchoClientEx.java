package Stream_th2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EchoClientEx {
    Socket client = null;//클라이언트 소캣클래스.소캣을 통해서 서버와 자료 송수신
    
    String ipAddress;//서버 ip주소를 저장할 변수
    static final int PORT=7000;//정적상수로 포트번호 저장
    
    BufferedReader read;//읽어들인 데이터를 버퍼링한다.
    
    InputStream is;
    ObjectInputStream ois;
    
    OutputStream os;
    ObjectOutputStream oos;
    
    String receiveData;//서버로 부터 받은 메시지를 저장할 변수
    String sendData;//사용자부로 입력받은 메시지를 저장할 변수=>서버로 전송
    
    public EchoClientEx(String ip) {
    	ipAddress=ip;//서버 ip주소 저장
    	
    	try {
    	System.out.println("***에코 클라이언트***");	
    	client = new Socket(ipAddress,PORT);//소캣 객체 생성
    	read=new BufferedReader(new InputStreamReader(System.in));
/* 1.System.in은 키보드 입력장치와 연결
 * 2.InputStreamReader는 바이트를 문자스트림으로 변경
 * 3.BufferedReader는 읽어들인 자료를 버퍼링해서 효율적으로 읽어들임.    	
 */
    	os=client.getOutputStream();
    	oos=new ObjectOutputStream(os);
    	
    	is=client.getInputStream();
    	ois=new ObjectInputStream(is);
    	
    	System.out.print("입력 -> ");
    	while((sendData = read.readLine()) != null) {
    	//readLine()메서드로 한줄끝까지 입력받음
    		oos.writeObject(sendData);//서버로 전송
    		oos.flush();//출력스트림을 비움
    		if(sendData.equals("quit")) {
    			break;
    		}
    		receiveData=(String)ois.readObject();//서버가 보낸 데이
    		//터를 읽어들여서 다운캐스팅해서 변수에 저장
    		System.out.println(client.getInetAddress()+"로 부터 "
    				+" 받은 메시지 : "+receiveData);
    		System.out.print("입력 -> ");
    	}
    	}catch(Exception e) {
    		e.printStackTrace();
    		System.exit(0);//프로그램종료
   		}finally {
   			try {
   				if(is != null) is.close();
   				if(ois != null) ois.close();
   				if(os != null) os.close();
   				if(oos != null) oos.close();
   				if(client != null) client.close();
   			}catch(Exception e) {e.printStackTrace();}
   		}//finally
    }//생성자 오버로딩
	public static void main(String[] args) {
      new EchoClientEx("localhost");//생성자 호출하면서 서버 ip주소 전달
	}
}




