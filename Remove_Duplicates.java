

public class Remove_Duplicates {
	static int remove(int arr[]) {
			int i=0;
			int j=1;
			while(j<arr.length) {
				if(arr[i]!=arr[j]) {
					arr[i+1]=arr[j];
					i++;
				}
				j++;
			}
			return i;
	}
	static void printarr(int arr[],int n) {
	    for(int i=0;i<=n;i++) {
	    	System.out.print(arr[i]+" ");
	    }
	}

	public static void main(String[] args) {
		
		int arr[]= {1,1,2,2,3,3,5,5};
		int ans=remove(arr);
		printarr(arr,ans);
		
	}

}
