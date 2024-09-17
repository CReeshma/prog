public class SecLarSmal {

	public static void main(String[] args) {
		int[] arr= {111, 13, 25, 9, 34, 1};
		int secLargest=Integer.MIN_VALUE;
		int max=Integer.MIN_VALUE;
		int secSmallest=Integer.MAX_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if (arr[i] > max) {
                secLargest = max;
                max = arr[i];
            } else if (arr[i] > secLargest && arr[i] != max) {
                secLargest = arr[i];
            }
			if (arr[i] < min) {
                secSmallest = min;
                min = arr[i];
            } else if (arr[i] < secSmallest && arr[i] != min) {
                secSmallest = arr[i];
            }
		}
		System.out.println("Second largest: " + secLargest);
        System.out.println("Second smallest: " + secSmallest);

	}

}
