import java.util.ArrayList;
import java.util.List;


public class T118 {
   
	public static void main(String[] args) {
		System.out.println(generate(5));
	}

	
	
	public static List<List<Integer>> generate(int numRows) {
        
		List<Integer> inner,pre = null;
		List<List<Integer>> outer = new ArrayList<List<Integer>>();
		for(int i = 1;i<=numRows;i++) {
			inner = new ArrayList<Integer>();
			for(int j = 1;j <= i;j++) {
				if(j == 1 || j == i) {
					inner.add(1);
				} else {
					inner.add(pre.get(j - 2) + pre.get(j - 1));
				}
			}
			pre = inner;
			outer.add(inner);
		}
		return outer;
    }
}
