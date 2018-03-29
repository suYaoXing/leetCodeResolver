import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class T121 {

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
		System.out.println(maxProfit(nums));
	}
	
    public static int maxProfit(Integer[] prices) {
    	if(prices.length == 0)
    		return 0;
    	int min = prices[0];
    	int currentMax = 0;
    	for(int i = 1;i<prices.length;i++) {
    		if(prices[i] < min) 
    			min = prices[i];
    		else if(prices[i] - min > currentMax) {
    			currentMax = prices[i] - min;
    		}
    	}
         return currentMax;
    }
}
