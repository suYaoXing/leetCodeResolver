import java.util.ArrayList;
import java.util.List;


public class T155 {

	public static void main(String[] args) {
		MinStack stack = new MinStack();
		stack.push(512);
		stack.push(-1024);
		stack.push(-1024);
		stack.push(512);
		stack.pop();
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.getMin());
	}
}

class MinStack {

    /** initialize your data structure here. */
    private List<Integer> list ;
    
    private List<Integer> minList ;
    
    private int min;
    
    private int minSize;
    
    private int size;
    
    public MinStack() {
        
        list = new ArrayList<Integer>();
        
        minList = new ArrayList<Integer>();
        
        size = 0;
        
        minSize = 0;
        
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        if(x <= min) {
            min = x;
            minList.add(minSize,min);
            minSize++;
        }              
        list.add(size,x);
        size++;
    }
    
    public void pop() {
        
        if(size != 0 && minSize != 0 && list.get(size - 1).equals(minList.get(minSize - 1))) {
            minSize--;
        }
        size--;
    }
    
    public int top() {
        return list.get(size - 1);
    }
    
    public int getMin() {
        if(minSize != 0)
            return minList.get(minSize - 1);
        return 0;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */