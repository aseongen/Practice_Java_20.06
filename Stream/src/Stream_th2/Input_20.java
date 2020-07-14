package Stream_th2;
import java.io.File;
import java.io.IOException;

public class Input_20 {
	public static void main(String[] args) throws IOException{
      String path="./src";
      File dir= new File(path);
      String[] fileList=dir.list();//src폴더의 파일 또는 폴더 목록을 
      //배열로 반환
      for(String s:fileList) {
        File f=new File(path+"/"+s);
        System.out.println("======================");
        System.out.println("파일 이름:"+f.getName());
        System.out.println("경로:"+ f.getPath());
        System.out.println("부모 경로 : "+f.getParent());
        System.out.println("절대 경로 : "+f.getAbsolutePath());
        System.out.println("폴더 여부 : "+f.isDirectory());
        System.out.println("파일 여부 : "+f.isFile());
        System.out.println("========================");
      }
	}	
}









