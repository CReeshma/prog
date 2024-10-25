


public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {5,7,12,22,35,56};
		int target=35;
		int result=binary(nums,target);
		if(result!=-1) {
			
		System.out.println("Element found at Index : " + result);
		}
		else {
			System.out.println("Element not found");
		}
		
	}

	private static int binary(int[] nums, int target) {
		// TODO Auto-generated method stub
		int left=0;
		int right=nums.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(nums[mid]==target) {
				return mid;
			}
			else if(nums[mid]<target) {
				left=mid+1;
			}
			else {
				right=mid+1;
			}
				
		}
		return 0;
	}

//	private static int linear(int[] nums, int target) {
//		// TODO Auto-generated method stub
//		for(int i=0;i<nums.length;i++) {
//			if(nums[i]==target)
//			return i;
//		}                                                       //this code will run even if we remove the comments for linear
//		
//		return -1;
//	}

}
