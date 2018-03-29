

public class T344 {
	public static void main(String[] args) {
		System.out.println(reverseString("124956"));
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
