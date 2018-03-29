import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class T674 {

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
		System.out.println(findLengthOfLCIS(nums));
	}

	public static int findLengthOfLCIS(Integer[] nums) {
        if(nums == null) return 0;
		int maxLength = -1;
		int temp = 1;
		for(int i = 1;i<nums.length;i++) {
			if(nums[i] > nums[i - 1]) {
				temp++;
			} else if(nums[i] == nums[i - 1]) {
				continue;
			} else {
				if(temp > maxLength) {
					maxLength = temp;
					temp = 1;
				}
			}
		}
		if(temp > maxLength)
			maxLength = temp;
		return maxLength;
    }
}
