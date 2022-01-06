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
		
		// Left Rotation example
		LeftRotation leftRotation = new LeftRotation();
		List<Integer> rotList = Arrays.asList(33 ,47 ,70 ,37 ,8 ,53 ,13 ,93 ,71 ,72 ,51 ,100 ,60 ,87 ,97);
		System.out.println("Left rotation : new array after rotation : " + leftRotation.rotLeft(rotList, 13));
		
	}

}
