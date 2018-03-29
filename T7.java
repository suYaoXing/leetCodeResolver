import java.util.Scanner;


public class T7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		
		System.out.println(reverse(x));
	}
	
	public static int reverse(int x) {
		int judge = x;
		long temp = 1;
	    int arr[] = new int[33];
	    int index = 0;
	    boolean flag = true;
	    if(x < 0)
	    	x = -x;
		while(x != 0) {
			int num = x % 10;
			if(num == 0 && flag) {
				x = x / 10;
				continue;
			}
			flag = false;
			arr[index++] = num;
			temp = temp * 10;
			x = x / 10;
		}
		long sum = 0;
		index = 0;
		//System.out.println("temp="+temp);
		temp = temp / 10;
		while(temp > 0) {
			System.out.println(arr[index]+ "   "+ temp);
			sum = (long)arr[index] * (long)temp + sum;
			index++;
			temp = temp / 10;
		}
		if(sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) 
			return 0;
		
		return judge < 0 ? (int)-sum : (int)sum;
	}
	
}
