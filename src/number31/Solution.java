package number31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public void nextPermutation(int[] nums) {
    	int n = nums.length;
    	int flag = NotExists(nums);
    	if(flag == -1){
    		for(int i = 0; i < n / 2; i++){
    			int t = nums[i];
    			nums[i] = nums[n - i - 1];
    			nums[n - i - 1] = t;
    		}
    	}
    	else{
    		int[] tem;
    		while(true){
	    		tem = Arrays.copyOfRange(nums, flag, n);
	    		System.out.println(flag + " flag");
	    		for(int ii = 0; ii < tem.length; ii++)
	    			System.out.print(tem[ii] + " ");
	    		System.out.println();
	    		int f1 = NotExists(tem);
	    		System.out.println(f1 + " f1");
	    		if(f1 == -1){
	    			flag--;
	    			tem = Arrays.copyOfRange(nums, flag, n);
	    			break;
	    		}
	    		else{
	    			flag = f1 + flag;
	    		}
    		}
    		for(int ii = 0; ii < tem.length; ii++)
    			System.out.print(tem[ii] + " ");
    		System.out.println(" tem " + " flag " + flag);
    		Arrays.sort(tem);
    		int length = tem.length;
    		System.out.println(nums[flag] + " flagg ");
    		for(int i = 0; i < length; i++)
    			if(tem[i] > nums[flag]){
    				nums[flag] = tem[i];
    				break;
    			}
    		for(int i = 0; i < length; i++)
    			if(tem[i] == nums[flag] && i < length - 1){
    				for(int j = i; j < length - 1; j++)
    					tem[j] = tem[j + 1];
    				break;
    			}
    				
//    		nums[flag] = tem[length - 1];
    		for(int ii = 0; ii < tem.length; ii++)
    			System.out.print(tem[ii] + " tem after");
    		System.out.println();
    		for(int i = flag + 1; i < flag + length; i++){
    			if(i == n)
    				break;
    			nums[i] = tem[i - flag - 1];
    		}
//    		boolean f = false;
//    		boolean f1 = false;
//    		boolean f2 = false;
//    		int s = 0;
//    		int count = 0;
//    		int flag = 0;
//    		for(int k = n - 1; k > s;){
//    			f2 = false;
////    			for(int i = 0; i < nums.length; i ++)
////    				System.out.println(nums[i]);
////    			System.out.println("start k: " + k + " s : " + s);
//	    		for(int i = k - 1; i >= s; i--){
//	    			if(!f && nums[k] > nums[i]){
//	    				int t = nums[k];
//	    				for(int j = k; j > i; j--){
//	    					nums[j] = nums[j - 1];
//	    				}
//	    				nums[i] = t;
////	    				System.out.println("k: " + k + " s : " + s);
//	    				s = i + 1;
//	    				k = n;
////	    				System.out.println("k: " + k + " s : " + s);
//	    				f = true;
//	    				break;
//	    			}
//	    			else if(!f && nums[k] == nums[i]){
//	    				System.out.println(i + " i " + k + " k ==========");
//	    				flag = i;
////	    				count++;
////	    				s = i;
////	    				k--;
////	    				f2 = true;
////	    				break;
////	    				System.out.println("k: " + k + " s : " + s);
//	    			}
//	    			else if(!f && i == s){
////	    				System.out.println(flag + " flag " + i + " i ");
//	    				s = flag;
//	    				k--;
//	    				f2 = true;
//	    				System.out.println(flag + " flag " + i + " i " + k + " k ");
//	    			}
//	    			else if(f){
//	    				System.out.println(k + " k: " + s + " s :");
//	    				int[] tem = Arrays.copyOfRange(nums, s, k + 1);
////	    				for(int ii = 0; ii < tem.length; ii++)
////	    					System.out.println(tem[ii] + " q");
//	    				Arrays.sort(tem);
////	    				for(int ii = 0; ii < tem.length; ii++)
////	    					System.out.println(tem[ii] + " h");	    				
//    					for(int l = 0; l < tem.length; l++)
//							nums[l + s] = tem[l];
//    					f1 = true;
//	    				break;
//	    			}
//	    
//	    		}
//	    		if(!f2)
//	    			k--;
////	    		System.out.println("last k: " + k + " s : " + s);
//	    		if(f1)
//	    			break;
//    		}
    	}
    	for(int i = 0; i < nums.length; i++)
    		System.out.print(nums[i] + " ");
    	System.out.println("ccc");
    }
    
    private int NotExists(int[] nums){
    	for(int i = 0; i < nums.length - 1; i++)
    		if(i < nums.length - 1 && nums[i] < nums[i + 1])
    			return i + 1;
    	return -1;
    }
    
    private int ifUp(int[] nums){
    	for(int i = 0; i < nums.length - 1; i++)
    		if(i < nums.length - 1 && nums[i] > nums[i + 1])
    			return i + 1;
    	return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] test = {1,2,0,3,0,1,2,4};
//		int[] t1 = Arrays.copyOfRange(test, 2, test.length);
//    	for(int i = 0; i < t1.length; i++)
//    		System.out.print(t1[i] + " ");
//    	System.out.println("ccc");
    	for(int i = 0; i < test.length; i++)
    		System.out.print(test[i] + " ");
    	System.out.println("ccc");
		s.nextPermutation(test);
	}

}
