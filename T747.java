import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class T747 {

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
		System.out.println(dominantIndex(nums));
	}
	
	public static int dominantIndex(Integer[] nums) {
		if(nums.length == 0) return -1;
		if(nums.length == 1) return 0;
        int max = nums[0];
        int index = 0;
        for(int i = 0;i<nums.length;i++) {
            if(max < nums[i]) {
            	max = nums[i];
                index = i;
            }
        }
        Arrays.sort(nums);
        return nums[nums.length - 2] * 2 <= nums[nums.length - 1] ? index : -1;
	}
}
