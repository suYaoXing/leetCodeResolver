
public class T557 {

	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}
	
    public static String reverseWords(String s) {
    	String arr[] = s.split(" ");
    	StringBuilder result = new StringBuilder();
    	for(int i = 0;i<arr.length;i++) {
    		if(i == 0)
    			result.append(reverseString(arr[0]));
    		else
    			result.append(" "+reverseString(arr[i]));
    			
    	}
		return result.toString();
        
    }
    
    public static String reverseString(String s) {
		 char[] arr = s.toCharArray();
		 int i = 0,j = arr.length - 1;
		 while(i < j) {
			 char temp = arr[i];
			 arr[i] = arr[j];
			 arr[j] = temp;
			 i++;
			 j--;
		 }
		 return new String(arr).toString();
	  }
}
