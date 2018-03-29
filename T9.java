
public class T9 {
	
	public static void main(String[] args) {

		long now = System.currentTimeMillis();
		

		System.out.println(isPalindrome(5665));
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - now);
		
	}
	
	public static boolean isPalindrome(int x) {
		
		String arr = Integer.valueOf(x).toString();
		int i = 0,j = arr.length();
		while(i < j) {
			if(arr.charAt(i) != arr.charAt(j - 1))
				return false;
			i++;
			j--;
		}
        return true;
    }
}
