
public class T326 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(isPowerOfThree(242));
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	
	public static boolean isPowerOfThree(int n) {
		if(n <= 0)
			return false;
		while(n > 1) {
			if(n % 3 != 0)
				return false;
			n = n / 3;
		}
        return true;
    }
}
