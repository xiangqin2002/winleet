package binarySearch;

public class solution {
	

	
	public int bs(int[] arr, int val){
		int l = 0;
		int r = arr.length - 1;  
		while(l <= r){
			int mid = l + (r-l) / 2;
			System.out.println(arr[mid]);
			if(arr[mid] == val)
				return mid;
			else if(arr[mid] < val)
				l = mid + 1;
			else if(arr[mid] > val)
				r = mid - 1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ee";
		System.out.println(Math.abs(0) + " " + Math.abs(-1));
		System.out.println(Math.abs(0) > Math.abs(-1));
		System.out.println((char)(147));
		
//		int[] nums = {1,1,2,3,4,5,5,6,7,7,8};
//		solution s = new solution();
//		int res = s.bs(nums, 1);
//		System.out.println(res + 1);
	}

}
