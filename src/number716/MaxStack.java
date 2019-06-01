package number716;

import java.util.ArrayList;

public class MaxStack {
	
	ArrayList<Integer> a;
	int max = -9999999;
	
    public MaxStack() {
        a = new ArrayList<>();
    }
    
    public void push(int x) {
        a.add(x);
        max = Math.max(max, x);
    }
    
    public int pop() {
        int res = a.get(a.size() - 1);
        a.remove(a.size() - 1);
        max = -9999999;
        for(int i = 0; i < a.size(); i++)
        	max = Math.max(a.get(i), max);
        return res;
    }
    
    public int top() {
        return a.get(a.size() - 1);
    }
    
    public int peekMax() {
        return max;
    }
    
    public int popMax() {
    	int res = max;
        for(int i = a.size() - 1; i >= 0; i--){
        	if(a.get(i) == max){
        		a.remove(i);
        		break;
        	}
        }
        max = -9999999;
        for(int i = 0; i < a.size(); i++)
        	max = Math.max(a.get(i), max);
        System.out.println(max + " new " + a.toString());
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxStack stack = new MaxStack();
		stack.push(5); 
		stack.push(1);
//		stack.push(5);
		System.out.println(stack.top()); //-> 5
		System.out.println(stack.popMax()); //-> 5
		System.out.println(stack.top()); //-> 1
		System.out.println(stack.peekMax()); //-> 5
//		System.out.println(stack.pop()); //-> 1
//		System.out.println(stack.top()); //-> 5
	}

}
