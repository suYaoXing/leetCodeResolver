
public class T441 {

	public static void main(String[] args) {
		System.out.println(arrangeCoins(8));
	}
	
	
	 public static int arrangeCoins(int n) {
		 int sum = 0;
		 for(int i = 1;;i++) {
			 sum = sum + i;
			 if(sum > n)
				 return i - 1;
		 }        
	  }
}
