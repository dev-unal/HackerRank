package arrays;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
	public List<Integer> rotLeft(List<Integer> a, int d) {
		List<Integer> retList = new ArrayList<Integer>(a.size());
		for (int i = 0; i < a.size(); i++) {
			retList.add(0);
		}
		
		for (int i = 0; i < a.size(); i++) {
			int diff = i - d;
			
			if (diff >= 0 )
				retList.set(diff, a.get(i));
			else {
				int newIndex = diff + a.size();
				retList.set(newIndex, a.get(i));	
			}
		}
		return retList;
	}
}
