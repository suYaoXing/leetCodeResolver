
public class T507 {

	public static void main(String[] args) {
		System.out.println(checkPerfectNumber(0));
	}
	
	public static boolean checkPerfectNumber(int num) {
		if(num == 1)
			return false;
        int middle = (int)Math.sqrt(num);
        int sum = 0;
        for(int i = 2;i <= middle;i++) {
        	if(num % i == 0) 
        		sum = sum + i + num / i;
        }
		return sum + 1 == num ? true : false;
    }
}
