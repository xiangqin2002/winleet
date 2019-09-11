package number1165;

public class Solution {
	
    public int calculateTime(String keyboard, String word) {
        int charsC[] = new int[26];
        for(int i = 0; i < 26; i++){
            for(int j = 0; j < keyboard.length(); j++)
            	if(keyboard.charAt(j) - 97 == i)
            		charsC[i] = j;
        }

    	int res = 0;
    	int location = 0;
    	int l = word.length();
    	for(int i = 0; i < l; i++){
    		res += Math.abs(charsC[word.charAt(i) - 97] - location);
    		location = charsC[word.charAt(i) - 97];
    	}
    	return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
