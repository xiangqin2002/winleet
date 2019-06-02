package number225;

import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class MyStack {
	
	ArrayList<Integer> a;
	int size;

    /** Initialize your data structure here. */
    public MyStack() {
        a = new ArrayList<>();
        size = 0;
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        a.add(x);
        size++;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int res = a.get(a.size() - 1);
    	a.remove(a.size() - 1);
        size--;
        return res;
    }
    
    /** Get the top element. */
    public int top() {
        return a.get((a.size() - 1));
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return size == 0;
    }
}