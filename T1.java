import java.util.HashMap;
import java.util.Map;


public class T1 {
	public static void main(String[] args) {
		System.out.println(~5);
		
//		Scanner in = new Scanner(System.in);
//		List<Integer> numlist = new ArrayList<Integer>();
//		int k = in.nextInt();
//		int num = 0;
//		while(k-- > 0) {
//			num = in.nextInt();
//			numlist.add(num);
//		}
//		//int[] nums = new int[numlist.size()];
//		Integer[] a = new Integer[numlist.size()];
//		Integer[] nums = numlist.toArray(a);
//		removeElement(nums, 5);
	}
	
	public static int[] removeElement(Integer[] nums,int target) {
//		int index[] = new int[2];
//		for(int i = 0;i<nums.length-1;i++) {
//			for(int j = i+1;j<nums.length;j++){
//				if(nums[i] + nums[j] == target)
//				{
//					index[0] = i;
//					index[1] = j;
//				}
//			}
//		}
//		System.out.println(index[0]+","+index[1]);
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0;i<nums.length;i++) {
			if(map.containsKey(target-nums[i])) {
				System.out.println(map.get(target-nums[i])+","+i);
				return new int[]{map.get(target-nums[i]),i};
			}
			map.put(nums[i], i);			
		}
		return null;
		
//		int[] result = new int[2];
//	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//	    for (int i = 0; i < numbers.length; i++) {
//	        if (map.containsKey(target - numbers[i])) {
//	            result[1] = i + 1;
//	            result[0] = map.get(target - numbers[i]);
//	            System.out.println(result[0]+","+result[1]);
//	            return result;
//	        }
//	        map.put(numbers[i], i + 1);
//	    }
//	    return result;
//	}
	}
}
