package number341;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Collections;

 interface NestedInteger {

     // @return true if this NestedInteger holds a single integer, rather than a nested list.
     public boolean isInteger();

     // @return the single integer that this NestedInteger holds, if it holds a single integer
     // Return null if this NestedInteger holds a nested list
     public Integer getInteger();

     // @return the nested list that this NestedInteger holds, if it holds a nested list
     // Return null if this NestedInteger holds a single integer
     public List<NestedInteger> getList();
 }

public class NestedIterator implements Iterator<Integer> {
	
	Stack<NestedInteger> s = new Stack<>();
	List<NestedInteger> l;
	
    public NestedIterator(List<NestedInteger> nestedList) {
//    	Collections.reverse(nestedList);
    	l = nestedList;
		if(!l.isEmpty()){
			s.add(l.get(0));
			l.remove(0);
			testEmpty();
		}
    }
    
    private void testEmpty(){
    	if(!s.isEmpty()){
	    	NestedInteger n = s.peek();
	    	if(!n.isInteger()){
	    		s.pop();
	    		if(!n.getList().isEmpty()){
	    			Collections.reverse(n.getList());
		    		for(NestedInteger nn : n.getList())
		    			if(nn != null)
		    				s.add(nn);
	    		}
	    		testEmpty();
	    	}
    	}
    	else{
    		if(!l.isEmpty()){
    			s.add(l.get(0));
    			l.remove(0);
    			testEmpty();
    		}
    	}
    }

    @Override
    public Integer next() {
    	
    	NestedInteger n = s.peek();
    	s.pop();
    	
    	if(n.isInteger()){
    		if(s.isEmpty()){
    			if(!l.isEmpty()){
    				s.add(l.get(0));
    				l.remove(0);
    			}
    		}
    		testEmpty();
    		return n.getInteger();
    	}
    	else{
    		if(!n.getList().isEmpty()){
    			Collections.reverse(n.getList());
	    		for(NestedInteger nn : n.getList())
	    			if(nn != null)
	    				s.add(nn);
    		}
    		return next();
    	}
    }

    @Override
    public boolean hasNext() {
        return s.isEmpty() ? false : true;
    }
}
