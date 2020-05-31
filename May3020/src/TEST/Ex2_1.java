package TEST;
import java.util.ArrayList;
import java.util.List;

public class Ex2_1 {
    public static void main(String[] args) {
        List <String>nameList=new ArrayList<>();
        nameList.add("seoul");
        nameList.add("busan");

        
        for(String str:nameList) {
           System.out.println(str.toUpperCase());
        }//for
    }//main
}//class