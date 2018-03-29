
public class T387 {
	
	 public static void main(String[] args) {
		 //System.out.println(firstUniqChar("ltltlt"));
		 //System.out.println("loveleetcode".lastIndexOf('t'));
		 System.out.println("ssssttt ".lastIndexOf(" "));
	 }
	 
	 //法1
//	 public static int firstUniqChar(String s) {
//	        
//		 int[] arr = new int[124];
//		 for(char c : s.toCharArray()) {
//			 arr[c]++;
//		 }
//		 
//		 for(int i = 0;i<s.length();i++) {
//			 if(arr[s.charAt(i)] == 1) 
//				 return i;
//		 }
//		 return -1;
//	 }
	 
	 //法2
	 public static int firstUniqChar(String s) {
	        
		 for(int i = 0;i<s.length();i++) {
			 if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
				 return i;
		 }
		 return -1;
	 }
}
