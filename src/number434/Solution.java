package number434;

public class Solution {
	
    public int countSegments(String s) {
		// 连续两个 replaceAll 
		// 第一个是去掉前端的空格， 第二个是去掉后端的空格
    	s = s.replaceAll("^[　*| *| *|//s*]*", "").replaceAll("[　*| *| *|//s*]*$", "");
    	
    	if(s.length() < 1)
    		return 0;
//        s = s.replaceAll("[^a-zA-Z ]+", "");
//    	s = s.replaceAll("\\s","");
//    	s.trim();
    			
    	
    	

		

    	
//    	s.replaceAll("\\s", "");
		
		System.out.println(s);
		
        String [] arr = s.split("\\s+");
        for(String a : arr)
        	System.out.println(a);
        return arr.length;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.print(s.countSegments("    foo    bar"));
	}

}
