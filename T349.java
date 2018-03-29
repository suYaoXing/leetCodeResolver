import java.util.HashSet;
import java.util.Set;


public class T349 {

	public static void main(String[] args) {
		int arr[] = {3,1,2};
		int arr2[] = {};
		intersection(arr,arr2);
	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {
		
       Set<Integer> set = new HashSet<Integer>();
       for(int i = 0;i<nums1.length;i++) {
    	   if(!set.contains(nums1[i]))
    		   set.add(nums1[i]);
       }
       Set<Integer> result = new HashSet<Integer>();
       for(Integer index : nums2) {
    	   if(set.contains(index))
    		   result.add(index);
       }
       int value[] = new int[result.size()];
       int i = 0;
       for(Integer ele : result) {
    	   value[i++] = ele;
       }
       return value;
    }
}
