import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class T26 {

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
		removeDuplicates(nums);
	}

	private static void removeDuplicates(Integer[] nums) {
		// TODO Auto-generated method stub
		int k = 0;
		
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0;i<nums.length;i++) {
			if(!set.contains(nums[i])) {
				nums[k++] = nums[i];
				set.add(nums[i]);
			}
		}
		System.out.println(set.size());
	}
}
