import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class T66 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> numlist = new ArrayList<Integer>();
		int k = in.nextInt();
		int num = 0;
		while(k-- > 0) {
			num = in.nextInt();
			numlist.add(num);
		}
		//int[] nums = new int[numlist.size()];
		Integer[] a = new Integer[numlist.size()];
		Integer[] nums = numlist.toArray(a);
		//System.out.println(plusOne(nums));
		plusOne(nums);
	}
	
    public static int[] plusOne(Integer[] digits) {
    	int temp = 0;
    	if(digits[digits.length - 1] == 9) {
    		temp = 1;
    		digits[digits.length - 1] = 0;
    	} else {
    		digits[digits.length - 1] = digits[digits.length - 1] + 1;
    	}
    	for(int i = digits.length - 2;i>=0;i--) {
    		if(digits[i] + temp == 10 ) {
    			digits[i] = 0;
    			temp = 1;
    		} else {
    			digits[i] = digits[i] + temp;
    			temp = 0;
    		}
    	}      
    	int[] result = new int[digits.length + 1];
    	result[0] = 1;
    	for(int i = 1;i<result.length;i++) {
    		result[i] = digits[i - 1];
    	}  	
    	return (int[]) (temp == 1 ? result : digits);	
    }
}
