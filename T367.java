
public class T367 {
	
	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		System.out.println(isPerfectSquare(1));
		long end = System.currentTimeMillis();
		System.out.println(end - now);
	}
	
	public static boolean isPerfectSquare(int num) {
        
		for(long i = 1;i <= 46341;i++) {
			if(i * i == num) 
				return true;
			else if(i * i > num)
				return false;
		}
		return false;
    }
}
