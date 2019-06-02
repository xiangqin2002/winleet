package number232;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue q = new MyQueue();
		q.push(1);
		System.out.println(q.pop());
		System.out.println(q.empty());
	}

}

class MyQueue {
	Stack<Integer> s;
	int size;
	int front;
    /** Initialize your data structure here. */
    public MyQueue() {
        s = new Stack<>();
        size = 0;
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        s.add(x);
        size++;
        if(size == 1)
        	front = x;
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        ArrayList<Integer> a = new ArrayList<>();
        while(!s.isEmpty())
        	a.add(s.pop());
        int res = a.get(a.size() - 1);
        if(a.size() - 2 >= 0)
        	front = a.get(a.size() - 2);
        else
        	front = 0;
        for(int i = a.size() - 2; i >= 0; i--)
        	s.add(a.get(i));
        size--;
        return res;
    }
    
    /** Get the front element. */
    public int peek() {
        return front;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return size == 0;
    }
}
