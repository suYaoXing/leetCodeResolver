import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class T724 {

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
		System.out.println(pivotIndex(nums));
	}
	
    public static int pivotIndex(Integer[] nums) {
    	int sum = 0;
    	int leftSum = 0;
    	int left = 0;
    	int rightSum = 0;
    	for(int i = 0;i<nums.length;i++) {
    		sum = sum + nums[i];
    	}
    	for(int i = 0;i<nums.length;i++) {
    		left = left + nums[i];
    		rightSum = sum - left;
    		leftSum = sum - rightSum - nums[i];
    		if(rightSum == leftSum)
    			return i;
    	}
        return -1;
    }
}
