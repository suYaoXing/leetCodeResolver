import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class T283 {

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
		moveZeroes(nums);
	}
	
	public static void moveZeroes(Integer[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int count = 0;
        for(int i = 0;i < nums.length;i++) {
        	if(nums[i] != 0) {
        		list.add(nums[i]);
        	} else {
        		count++;
        	}
        }
        for(int i = 1;i<=count;i++) {
        	list.add(0);
        }
        for(int i = 0;i<list.size();i++) {
        	nums[i] = list.get(i);        
        }
        
    }
}
