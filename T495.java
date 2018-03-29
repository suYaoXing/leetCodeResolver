
public class T495 {
	
   public static void main(String[] args) {
	   int[] arr = {1,2,6,7,9};
	   int n = 2;
	   System.out.println(findPoisonedDuration(arr,n));
   }

   public static int findPoisonedDuration(int[] timeSeries, int duration) {
      
	   int result = 0;
	   for(int i = 1;i<timeSeries.length;i++) {
		   if(timeSeries[i] - timeSeries[i - 1] >= duration)
			   result = result + duration;
		   else
			   result = result + timeSeries[i] - timeSeries[i - 1];
	   }
	   return result + duration;
   }
}
