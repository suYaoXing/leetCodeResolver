
public class T231 {
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(17));
	
	}
	
    public static boolean isPowerOfTwo(int n) {
    	if(n == 1)
    		return true;
    	int temp = 1;
    	while(true) {
    		temp = temp * 2;
    		if(temp > n || temp == n)
    			break;
    	}
        return temp > n ? false : true;
    }
}
