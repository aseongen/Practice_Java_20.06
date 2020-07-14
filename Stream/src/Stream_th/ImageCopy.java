package Stream_th;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ImageCopy {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		Scanner sc = new Scanner(System.in);

		/*
		 * Scanner 자바 5버전에서 추가됨, 무엇을 콘솔로부터 입력 받을 때 사용한다. System.in은 입력장치 키보드와 연결됨
		 */

		System.out.println("사전에 구글로부터 다운로드 받은 원본 그림" + "한여름에 지리산 계곡물 빨간 수박(./src/a.jpg) >> ");
		String name01 = sc.nextLine();
		System.out.println("복사되어질 이미지 파일명 (./src/b.jpg) >> ");
		String name02 = sc.nextLine();

		/*
		 * 문제 구글로부터 해당 그림을 a.jpg로 다운받고 스캐너로부터 입력받은 b.jpg 복사본 이미지를 만드는 프로그램 만들기 사용되어질
		 * 사용클래스 : FileInptStream, FileOutpitStream 이 클래스는 자바 7에서 추가된AutoCloseable
		 * 인터페이스를 구현했기 때문에 try() 
		 * 
		 */
		FileInputStream in = null;
		FileOutputStream out = null;

		try {

			in = new FileInputStream("./src/"+name01+".JPG");
			// input.txt를 만들고 이 파일로 부터 바이트 단위로 읽어들이는 in을 생성
			out = new FileOutputStream("./src/"+name02+".JPG");
			// output.txt파일이 생성되면서 이 파일에 바이트 단위로 기록한다.
			int data = 0;
			
			while ((data = in.read()) != -1) {
				out.write(data);// 파일에 기록
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		
		System.out.println(name01 + "을 " + name02 + "로 복사했습니다.");
		
//---------------------------------------------------------------------------------
		
		try(FileInputStream in1 = new FileInputStream(name01);
				FileOutputStream out1 = new FileOutputStream(name02)){
			int data; //파일로 부터 읽어들인 데이터를 저장할 변수 
			
			while((data = in.read())!= -1) {
				out.write(data);
				
			}
		}
		
		System.out.println(name01 + "을 " + name02 + "로 복사했습니다.");

	}
}
