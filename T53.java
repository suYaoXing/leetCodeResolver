import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class T53 {
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
		System.out.println(maxSubArray(nums));
	}
	
    public static int maxSubArray(Integer[] nums) {
    	
    	//if(nums.length == 1) return nums[0];
    	List<String> list = new ArrayList<String>();
    	
    	int[] sum = new int[nums.length];
    	sum[0] = nums[0];
    	for(int i = 1;i<nums.length;i++) {
    		sum[i] = sum[i - 1] + nums[i];
    	}
    	int min = 0;
    	int max = sum[0];
    	for(int i = 1;i<sum.length;i++) {
    		if(sum[i - 1] < min) min = sum[i - 1];
    		if(sum[i] - min > max) max = sum[i] - min;
    	}
    	return max;
    }
}
