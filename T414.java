import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class T414 {
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
		System.out.println(thirdMax(nums));
	}
	
	public static int thirdMax(Integer[] nums) {
		Arrays.sort(nums);
		int min = nums[nums.length - 1];
		int count = 1;
		for(int i = nums.length - 1;i>=0;i--) {
			if(nums[i] < min) {
				count++;
				min = nums[i];
				if(count == 3)
					break;
			}
		}
		if(count < 3)
			return nums[nums.length - 1];
		return min;
	}
}
