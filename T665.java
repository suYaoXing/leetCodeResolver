import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class T665 {

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
		System.out.println(checkPossibility(nums));
	}
	
    public static boolean checkPossibility(Integer[] nums) {
    	
    	if(nums.length <= 2) return true;
    	int count = 0;
    	boolean flag = false;
    	if(nums[0] > nums[1] && nums[2] >= nums[1])
    		count++;
    	if(nums[nums.length - 1] < nums[nums.length - 2] && nums[nums.length - 3] <= nums[nums.length - 1])
    		count++;
        for(int i = 1;i<=nums.length - 3; i++) {
        	if(nums[i] > nums[i - 1] && nums[i] > nums[i + 1] && nums[i + 1] >= nums[i - 1])
        		count++;
        }
        for(int i = 1;i<nums.length;i++) {
        	if(nums[i] < nums[i - 1])
        		flag = true;     		
        }
        if(flag == false)
        	return true;
    	return (count == 1 ? true : false);
    }
}
