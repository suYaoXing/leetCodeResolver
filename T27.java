import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class T27 {

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
		removeElement(nums, 5);
	}
	
	public static void removeElement(Integer[] nums,int val) {
		int m = 0;
		for(int n : nums) {
			if(n != val) {
				nums[m++] = n;
				
			}
		}
		System.out.println(m);
	}
}
 