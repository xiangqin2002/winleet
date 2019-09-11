package number1119;

public class Solution {
	
    public String removeVowels(String S) {
        char s[] = S.toCharArray();
        int length = S.length();
        int l = s.length;
        for(int i = 0; i < l; i++){
        	if(s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u'){
        		s[i] = '.';
        		length--;
        	}
        }
        char r[] = new char[length];
        int j = -1;
        for(int i = 0; i < l; i++){
        	if(s[i] != '.')
        		r[++j] = s[i];
        }
        String res = String.copyValueOf(r);
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
