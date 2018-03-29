
public class T88 {

	public static void main(String[] args) {
		int[] nums1 = {0};
		int[] nums2= {1};
		merge(nums1, 0, nums2, 1);
		
	}
	
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int index = 0;
        int[] result = new int[m + n];
        while(i <= m-1 && j <= n-1) {
        	if(nums1[i] < nums2[j]) {
        		result[index++] = nums1[i++];
        	} else {
        		result[index++] = nums2[j++];
        	}
        }
        while(i <= m-1) {
        	result[index++] = nums1[i++];
        }
        
        while(j <= n-1) {
        	result[index++] = nums2[j++];
        }
        
        for(int ii = 0;ii<result.length;ii++) {
        	System.out.print(result[ii]+" ");
        }
        nums1 = result;
    }
}
