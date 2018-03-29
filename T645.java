import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class T645 {

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
		findErrorNums(nums);
	}
	
	public static int[] findErrorNums(Integer[] nums) {
		System.out.println(Integer.MAX_VALUE);
		int result[] = new int[2];
		int sum = 0;
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0;i<nums.length;i++) {
			if(set.contains(nums[i])) {
				result[0] = nums[i];
			} else {
				set.add(nums[i]);
				sum = sum + nums[i];
			}
		}
		result[1] = ((1 + nums.length) * (nums.length)) / 2 - sum;
		System.out.println(result[0]+"  "+result[1]);
        return result;
    }
}
