import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class T628 {
	
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
		System.out.println(maximumProduct(nums));
	}
	
	public static int maximumProduct(Integer[] nums) {
        Arrays.sort(nums);
        if(nums[0] >= 0 || nums[0] * nums[1] <= 0 || nums[nums.length - 1] <= 0)
          return nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];   
        	int temp = Math.max(nums[0]*nums[1], nums[nums.length - 2] * nums[nums.length - 3]);
        	return temp * nums[nums.length - 1];       
    }
}
