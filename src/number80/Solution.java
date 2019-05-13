package number80;



public class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i = 1; i < nums.length - k; i++){
            if(nums[i] == nums[i - 1]){
                while(i + 1 < nums.length - k && nums[i + 1] == nums[i]){
                    for(int j = i + 2; j < nums.length - k; j++){
                        System.out.print(j + " " + i + " ");
                        nums[j - 1] = nums[j];
                    }
                        
                    k++;
                }
                System.out.println();
            }
        }
        return nums.length - k;
    }
    
    public static void main(String[] args){
    	int[] arr = {0,0,1,1,1,1,2,3,3};
    	for(int i = 0; i < arr.length; i++)
    		System.out.print(arr[i] + " ");
    	System.out.println();
    	int val = 3;
    	System.out.println(val);
    	Solution s = new Solution();
    	int k = s.removeDuplicates(arr);
    	System.out.println(k);
    }
}
