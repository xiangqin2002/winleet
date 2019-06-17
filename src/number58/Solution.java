package number58;

public class Solution {
	
    public int lengthOfLastWord(String s) {
        String[] res= s.split(" ");
//        for(int i = 0; i < res.length; i++){
//        	System.out.println(res[i]);
//        }
        return res.length != 0 ? res[res.length - 1].length() : 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String str = " ";
		System.out.println(s.lengthOfLastWord(str));
	}

}
