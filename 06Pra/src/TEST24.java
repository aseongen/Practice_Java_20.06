import java.util.Scanner;

public class TEST24 {
	public static void main(String[] args) {

 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("장바구니에 구매할 물건을 넣어주세요: ");
		System.out.println("다 담았으면 <그만>을 입력하세요");
	
		int count =0;
		String [] basket = new String [20];
		
		while(true) {
			
			System.out.print(">> ");
			String product = sc.nextLine();
			
			if(product.equals("그만")) {
				System.out.println("선택을 완료했습니다. 계산해주세요^^ ");
				break;
			}//if
			
			basket[count] = product;
			count++;
			
		}//while
	
		//출력 
		for( int buy=0; buy< count ; buy++) {
			System.out.println("장바구니에 담은 물품: " + basket[buy]);
		}
     sc.close();	
	}//main
}//clas
