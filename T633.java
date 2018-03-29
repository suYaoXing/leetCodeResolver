
public class T633 {
	
	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		
		System.out.println(judgeSquareSum(5));
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - now);
	}
	
	public static boolean judgeSquareSum(int c) {
		int j = (int)Math.sqrt(c);
		for(int i = 0;i<=j;) {
			if(i*i + j*j < c) 
				i++;
			else if(i*i + j*j > c)
				j--;
			else
				return true;
			}
		return false;
    }
	
}
