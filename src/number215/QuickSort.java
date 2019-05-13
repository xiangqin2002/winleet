package number215;

public class QuickSort {
	public QuickSort(int[] nums){
		QuickSort(nums, 0, nums.length - 1);
	}
	
	private void QuickSort(int[] nums, int l, int r){
        if(r <= l)
        	return;
		int p = nums[l];
        int left = l;
        int right = r;
        while(left < right){
	        while(right > l && nums[right] >= p)
	        	right--;
	        while(left < r && nums[left] <= p)
	        	left++;
	        if(left < right){
	            int t = nums[left];
	            nums[left] = nums[right];
	            nums[right] = t;
	        }
        }
        
         int t = nums[l];
         nums[l] = nums[right];
         nums[right] = t;
	
         QuickSort(nums, l, right - 1);
         QuickSort(nums, right + 1, r);
	}
	
	public static void main(String[] args){
		int[] arr = {3,3,2,1,5,6,4};
		QuickSort qs = new QuickSort(arr);
		for(int i: arr)
			System.out.print(i + " ");
	}
}
