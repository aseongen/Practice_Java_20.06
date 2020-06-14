
public class TEST17 {
	public static void main(String[] args) {

    int array[] = {1,2,3,4,5,6,7};
    
    int max = array[0];
    int min = array[0];
    
    for (int i=0;i<array.length;i++) {
    	if(max<array[i]) {
    		max = array[i];
    	}
    	if(min>array[i]){
    		min = array[i];
    	}
     }//for    

    System.out.println("최대 " + max);
    System.out.println("최소 " + min);
	}
}
