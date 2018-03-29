
public class T443 {

	public static void main(String[] args) {
		char[] chars = {'a','a','b','b','c','c','c'};
		System.out.println(compress(chars));
	}
	
	public static int compress(char[] chars) {
	       int[] arr = new int[128];
	        for(int i = 0;i<chars.length;i++) {
	            arr[chars[i]]++;
	        }
	        for(int i = 35;i<arr.length;i++) {
	        	System.out.println(arr[i]);
	        }
	        int sum = 0;
	        for(int i = 0;i<arr.length;i++) {
	            if(arr[i] == 1)
	                sum = sum + 1;
	            else if(arr[i] <= 9) 
	                sum = sum + 2;
	            else if(arr[i] <= 99)
	                sum = sum + 3;
	            else if(arr[i] <= 999)
	                sum = sum + 4;
	            else
	                sum = sum + 5;
	        }
	        return sum;
	    }
}
