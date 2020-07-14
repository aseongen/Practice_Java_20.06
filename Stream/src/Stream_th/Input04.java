package Stream_th;

import java.io.File;

public class Input04 {
	public static void main(String[] args) {
      File dir = new File("./src");
      String[] strs = dir.list();//src폴더 경로의 파일목록을 문자열 배열로
      //받아온다.
      //일반 for반복문으로 출력
      for(int i=0;i<strs.length;i++) {
    	  System.out.println(strs[i]);
      }//for
      System.out.println("\n ===============>");
      //문제)확장for로 파일목록을 출력한다.
      for(String fileName:strs) {
    	  System.out.println(fileName);
      }
	}
}




