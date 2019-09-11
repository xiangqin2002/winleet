package number1160;

public class Solution {
	
    public int countCharacters(String[] words, String chars) {
    	int res = 0;
        int charsC[] = new int[26];
        for(int i = 0; i < chars.length(); i++)
        	charsC[chars.charAt(i) - 97]++;
        
        for(String word : words){
        	int charsP[] = charsC.clone();
        	int l = word.length();
        	boolean j = true;
        	for(int i = 0; i < l; i++){
        		int c = word.charAt(i) - 97;
        		if(charsP[c] > 0)
        			charsP[c]--;
        		else{
        			j = false;
        			break;
        		}
        	}
        	if(j)
        		res += l;
        }
        
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
