
public class T69 {
	
	public static void main(String[] args) {
		System.out.println(mySqrt(24));
	}

    public static int mySqrt(int x) {
    	
    	int xx = (int)Math.sqrt(x);
    	int temp = 1;
    	while(true) {
    		
    		 if(temp == xx)
    			 break;
    		 temp++;
    	}
    	return temp; 
    }
}
