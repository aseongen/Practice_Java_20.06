package Stream_th2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.rmi.UnknownHostException;

public class NetWork01 {
	public static void main(String[] args) throws Exception{
     BufferedReader reader;
     String url=null;
     InetAddress addr=null;
/* InetAddress 클래스는 ip번호를 처리할 때 사용하는 클래스이다.      
 */
     try {
     reader = new BufferedReader(new InputStreamReader(System.in));
/* 1.System.in은 키보드 입력장치와 연결됨
 * 2. InputStreamReader는 바이트를 문자로 변환.
 * 3. BufferedReader는 읽어들인 문자를 효율적으로 읽어들이기 위해서 버퍼링한다.     
 */
     System.out.print("사이트 주소 입력(www.naver.com) >> ");
     url = reader.readLine();//한줄 끝까지 사이트주소를 읽어들임     
     
     addr = InetAddress.getByName(url);//InetAddress객체 생성
     }catch(UnknownHostException e) {
    	 e.printStackTrace();
     }
    System.out.println(url +" ip번호 : "+addr.getHostAddress());
    //getHostAddress()메서드는 ip주소를 알아낸다.
	}
}


















