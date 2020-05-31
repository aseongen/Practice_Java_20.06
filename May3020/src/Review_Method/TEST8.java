package Review_Method;

import java.util.Scanner;

/* scanner 해당 메뉴를 입력받으세요
 * 없는 메뉴라면 ~은 메뉴에 없습니다.
 * switch 구문을 이용하세요 
 * 
 */
public class TEST8 {
	public static void main(String[] args) {

		
   Scanner sc = new Scanner (System.in);
 
  
    System.out.println("[ " + "수박," +" 사과" + ", 멜론" +", 포도" + ", 귤 " + " ]");
    System.out.println("구입할 메뉴는? ");
    String name = sc.nextLine();
    
    String value = name ;
    
    switch(value){
    case "수박":
    	System.out.println("수박을 선택하셨습니다.");
    	break;
    case "사과" : 
    	System.out.println("사과을 선택하셨습니다.");
    	break;
	case "멜론" :
		System.out.println("멜론을 선택하셨습니다.");
		break;
	case "포도" :
		System.out.println("포도을 선택하셨습니다.");
		break;
	case "귤" :
		System.out.println("귤을 선택하셨습니다.");
		break;
	default :
		System.out.println("선택하신 메뉴는 없습니다. ");
		System.out.println("다시 입력해주세요");
		break;
    }	//swtich
	}//main

}//class
