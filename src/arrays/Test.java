package arrays;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// 2D-Array example		
		TwoDArray twoDArray = new TwoDArray();
		List<List<Integer>> arr = Arrays.asList(
				Arrays.asList(-9 ,-9 ,-9  ,1 ,1 ,1),
				Arrays.asList(0 ,-9  ,0  ,4 ,3 ,2),
				Arrays.asList(-9 ,-9 ,-9  ,1 ,2 ,3),
				Arrays.asList(0  ,0  ,8  ,6 ,6 ,0),
				Arrays.asList(0  ,0  ,0 ,-2 ,0 ,0),
				Arrays.asList(0  ,0  ,1  ,2 ,4 ,0));
		System.out.println("2D-Array : Highest hourglass sum : " + twoDArray.hourglassSum(arr));
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// Left Rotation example
		LeftRotation leftRotation = new LeftRotation();
		List<Integer> rotList = Arrays.asList(33 ,47 ,70 ,37 ,8 ,53 ,13 ,93 ,71 ,72 ,51 ,100 ,60 ,87 ,97);
		System.out.println("Left rotation : new array after rotation : " + leftRotation.rotLeft(rotList, 13));
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// New Year Chaos
		NewYearChaos newYearChaos = new NewYearChaos();
		//List<Integer> q = Arrays.asList(2,1,5,3,4);
		//List<Integer> q = Arrays.asList(2,5,1,3,4);
		//List<Integer> q = Arrays.asList(1,2,3,5,4,6,7,8);
		//List<Integer> q = Arrays.asList(4,1,2,3);
		List<Integer> q = Arrays.asList(5, 1, 2, 3, 7, 8, 6, 4);		
		newYearChaos.minimumBribes(q);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// MinimumSwap2
		MinimumSwaps2 minimumSwap2 = new MinimumSwaps2();
		//int[] array = new int[] {4,3,2,1};
		//int[] array = new int[] {7,1,3,2,4,5,6};
		int[] array = new int[] {1, 3 ,5 ,2 ,4 ,6, 7};
		System.out.println("Minimum Swap 2 : " + minimumSwap2.minimumSwaps(array));
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		ArrayManipulation arrayManipulation = new ArrayManipulation();
		List<List<Integer>> queries = Arrays.asList(
				Arrays.asList(1,5,3),
				Arrays.asList(4,8,7),
				Arrays.asList(6,9,1));
		
		System.out.println("The maximum value in the resultant array : " + arrayManipulation.manipulateArray(10, queries));
		
	}

}
