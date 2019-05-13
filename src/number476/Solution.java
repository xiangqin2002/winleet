package number476;

public class Solution {
	
    public int findComplement(int num) {
        return ~num;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.findComplement(5));
		
		String result = Integer.toBinaryString(8);
		char[] c = new char[result.length()];
		for(int i = result.length() - 1; i >= 0; i--){
			if(result.charAt(i) == '0')
				c[i] = '1';
			else if(result.charAt(i) == '1')
				c[i] = '0';
		}
		int sum = 0;
		for(int i = c.length - 1; i >= 0; i--){
			sum += 2^(i - c.length - 1);
		}
		System.out.println(c);
		System.out.println(sum);
	}

}
