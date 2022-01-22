package arrays;

import java.util.HashMap;
import java.util.List;

public class ArrayManipulation {

    public  long manipulateArray(int n, List<List<Integer>> queries) {
    	
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < queries.size(); i++){
        	int startIndex = queries.get(i).get(0);
        	int lastIndex = queries.get(i).get(1);
        	int val = queries.get(i).get(2); 
        	
        	map.put(startIndex, (map.containsKey(startIndex) ? map.get(startIndex) : 0) + val);
        	map.put(lastIndex+1, (map.containsKey(lastIndex + 1) ? map.get(lastIndex + 1) : 0) - val );
        }
        
        long max = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (map.containsKey(i + 1) ? map.get(i + 1) : 0);
            max = Math.max(max, sum);
        }
        
        return max;
    }
}
