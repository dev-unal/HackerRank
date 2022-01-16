package arrays;
;

public class MinimumSwaps2 {

	public int minimumSwaps(int[] arr) {
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(i+1 != arr[i]){
	            int temp = arr[i];
	            arr[i] = arr[temp-1];
	            arr[temp-1] = temp;
	            i--;
	            count++;
			}
		}
		
		return count;
	}
}
