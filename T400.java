
public class T400 {

	public static void main(String[] args) {
		//System.out.print(Integer.MAX_VALUE);
		System.out.println(findNthDigit(189));
		
		
		
	}
	
	
	public static int findNthDigit(int n) {
		int arr[] = new int[11];
		arr[1] = 9;
		arr[2] = 99 - 10 + 1;
		arr[3] = 999 - 100 + 1;
		arr[4] = 9999 - 1000 + 1;
		arr[5] = 99999 - 10000 + 1;
		arr[6] = 999999 - 100000 + 1;
		arr[7] = 9999999 - 1000000 + 1;
		arr[8] = 99999999 - 10000000 + 1;
		arr[9] = 999999999 - 100000000 + 1;
		arr[10] = Integer.MAX_VALUE - 1000000000 + 1;
		for(int num : arr) {
			//System.out.println(num);
		}
		int start[] = new int[11];
		start[1] = 1;
		start[2] = 10;
		start[3] = 100;
		start[4] = 1000;
		start[5] = 10000;
		start[6] = 100000;
		start[7] = 1000000;
		start[8] = 10000000;
		start[9] = 100000000;
		start[10] = 1000000000;
		long allDigits = 0;
		int digitIndex = 0;
		for(int i = 1;i<arr.length;i++) {
			allDigits = allDigits + i * arr[i];
			if(allDigits >= n) {
				allDigits = allDigits - i * arr[i];
				digitIndex = i;
				break;
			}
		}
		System.out.println("index="+digitIndex + ",all="+allDigits);
        return 0;
    }
}
