

public class linearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {5,7,12,22,35,56};
		int target=35;
		int result=linear(nums,target);
		if(result!=-1) {
			
		System.out.println("Element found at Index : " + result);
		}
		else {
			System.out.println("Element not found");
		}
		
	}

	private static int linear(int[] nums, int target) {
		// TODO Auto-generated method stub
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target)
			return i;
		}
		return -1;
	}

}
