import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class T448 {
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
		System.out.println(findDisappearedNumbers(nums));
	}
	
	  public static List<Integer> findDisappearedNumbers(Integer[] nums) {
		  List<Integer> list = new ArrayList<Integer>();	
		  //法1
//		  Set<Integer> set = new HashSet<Integer>();
//		  for(int i = 0;i<nums.length;i++) {
//			  set.add(nums[i]);
//		  }
//		  for(int i = 1;i<=nums.length;i++) {
//			  if(!set.contains(i))
//				  list.add(i);
//		  }	  
		  
		  int[] flag = new int[nums.length + 1];
		  for(int i = 0;i<nums.length;i++) {
			  flag[nums[i]] = 1;
		  }
		  for(int i = 1;i<flag.length;i++) {
			  if(flag[i] != 1)
				  list.add(i);
		  }
		  return list;
	  }
}
