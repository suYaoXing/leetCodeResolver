import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class T532 {

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
		System.out.println(findUnsortedSubarray(nums,2));
	}
	
	public static int findUnsortedSubarray(Integer[] nums, int k) {
		
		Set<Integer> set = new HashSet<Integer>();
		int result = 0;
		for(int i = 0;i<nums.length;i++) {
			if((set.contains(nums[i] + k) || set.contains(nums[i] - k)) && !set.contains(nums[i]) ) {
				result++;
				set.remove(nums[i]);
			} 
			set.add(nums[i]);
		}
		return result;
    }
}
