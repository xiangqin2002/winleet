package number27;

class solution {
    public int removeElement(int[] nums, int val) {
        int r = nums.length - 1;
        int l = 0;
        boolean check = true;
        if(l == r)
        	if(nums[l] != val)
        		return 1;
        	else
        		return 0;
//        boolean lock = false;
//    		System.out.println("i: " + i + " " + nums[i] + " " + val);
		while(l <= r){
			System.out.println("nums[l]: " + nums[l] + " val: " + val);
    		if(nums[l] == val){
//    			System.out.println("i: " + i + nums[i]);
    			check = false;
    			for(; r >= l; r--){
//    				System.out.println("kk: " + k);
    				if(nums[r] != val){
	    				int t = nums[l];
	    				nums[l] = nums[r];
	    				nums[r] = t;
//	    				System.out.println("r: " + r + " nums: " + nums[0] + nums[1] + nums[2]
//	    						+ nums[3]);
	    				break;
    				}
    				if(r == l)
    					break;
    			}
    		}
    		System.out.println("l: " + l + " r: " + r);
    		System.out.println();
    		l++;
		}
    	for(int i = 0; i < nums.length; i++)
    		System.out.print(nums[i] + " ");
    	System.out.println("end");
		System.out.println("l: " + l + " r: " + r);
		System.out.println(check);
		if(r == nums.length - 1)
			return check ?  nums.length : r;
    	return r == -1 ? 0 : r;
    }
    
    public static void main(String[] args){
    	int[] arr = {2,3};
    	for(int i = 0; i < arr.length; i++)
    		System.out.print(arr[i] + " ");
    	System.out.println();
    	int val = 3;
    	System.out.println(val);
    	solution s = new solution();
    	int k = s.removeElement(arr, val);
    	System.out.println(k);
    }
}