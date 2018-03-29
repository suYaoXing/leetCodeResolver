import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class T581 {

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
		System.out.println(findUnsortedSubarray(nums));
	}
	
	public static int findUnsortedSubarray(Integer[] nums) {
        
        Integer[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        int left = 0;
        int right = 0;
        for(int i = 0;i<nums.length;i++) {
        	if(nums[i] != copy[i]) {
        		left = i;
        		break;
        	}
        }
        
        for(int i = nums.length - 1;i>=0;i--) {
        	if(nums[i] != copy[i]) {
        		right = i;
        		break;
        	}
        }
       // System.out.println(list);
        if(right + left == 0)
        	return 0;
        return right - left + 1;
        
    }
}
