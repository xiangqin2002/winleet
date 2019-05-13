package number56;

import java.util.List;
import java.util.ArrayList;

public class Solution {
	private Interval merge(Interval ii, Interval iii, int k, List<Interval> list){
		Interval t = new Interval();
		if(iii.start <= ii.start &&
				iii.end >= ii.end){
			t.start = iii.start;
			t.end = iii.end;
		}
		else if(iii.start <= ii.start &&
				iii.end <= ii.end){
			t.start = iii.start;
			t.end = ii.end;	
		}
		else if(iii.start >= ii.start &&
				iii.end <= ii.end){
			t.start = ii.start;
			t.end = ii.end;	
		}
		else if(iii.start >= ii.start &&
				iii.end >= ii.end){
			t.start = ii.start;
			t.end = iii.end;	
		}
		System.out.println("ok " + k);
		list.remove(k);
		if(k - 1 < 0)
			ii = null;
		else
			ii = list.get(k - 1);
		System.out.println(t.start + " t.start " + t.end + " t.end");
//		list.add(t);
//		for(int i = 0; i < list.size(); i++)
//			System.out.println(list.get(i).start + " " + list.get(i).end);
//		System.out.println();
		if(ii != null && t.start <= ii.end && t.end >= ii.start)
			return merge(ii, t, k - 1, list);
		return t;
	}
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> list = new ArrayList<>();
        if(intervals.isEmpty())
        	return list;
        list.add(intervals.get(0));
        for(int i = 1; i < intervals.size(); i++){
        	Interval ii = list.get(list.size() - 1);
        	Interval iii = intervals.get(i);
        	if(iii.start <= ii.end && iii.end >= ii.start){
        		System.out.println("co");
        		Interval tt = merge(ii, iii, list.size() - 1, list);
        		int n = list.size();
				int count = 0;
				for(; count < n; count++){
					if(tt.end < list.get(count).start){
						list.add(count, tt);
						break;
					}
				}
				if(count == n)
					list.add(tt);
        	}
        	else if(iii.end >= list.get(0).start){
        		System.out.println("cc");
        		int j = list.size() - 2;
        		for(; j >= 0; j--){
        			if(iii.start <= list.get(j).end && iii.end >= list.get(j).start){
        				System.out.println(j + " j: " +list.size());
        				Interval tt = merge(list.get(j), iii, j, list);
        				int n = list.size();
        				int count = 0;
        				for(; count < n; count++){
        					if(tt.end < list.get(count).start){
        						list.add(count, tt);
        						break;
        					}
        				}
        				if(count == n)
        					list.add(tt);
        				break;
        			}
        			else if(iii.start > list.get(j).end && iii.end < list.get(j + 1).start){
        				list.add(j + 1, iii);
        				break;
        			}
        		}
        		if(j == -1)
        			list.add(iii);
        	}
        	else{
        		
        		int kk = 0;
        		System.out.println(kk + " kk " + list.size());
        		int n = list.size();
        		for(; kk < n; kk++){
//        			System.out.println(kk + " kk " + list.size());
        			if(list.get(kk).start > iii.end){
        				list.add(kk, iii);
        				break;
        			}
        		}
        		
        		if(kk == list.size())
        			list.add(iii);
        	}
        	
        	System.out.println("No. " + i);
    		for(int d = 0; d < list.size(); d++)
    			System.out.println(list.get(d).start + " " + list.get(d).end);
    		System.out.println();
    		System.out.println();
        }
    	return list;
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Interval> ll = new ArrayList<>();
		ll.add(new Interval(0,0));
		ll.add(new Interval(0,0));
		ll.add(new Interval(4,4));
		ll.add(new Interval(0,0));
		ll.add(new Interval(1,3));
		ll.add(new Interval(5,5));
		ll.add(new Interval(4,6));
		ll.add(new Interval(1,1));
		ll.add(new Interval(0,2));
		for(int i = 0; i < ll.size(); i++)
			System.out.println(ll.get(i).start + " " + ll.get(i).end);
		System.out.println();
		Solution s = new Solution();
		ll = s.merge(ll);
//		for(int i = 0; i < ll.size(); i++)
//			System.out.println(ll.get(i).start + " " + ll.get(i).end);
		
	}

}
class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}
