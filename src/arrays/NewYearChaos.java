package arrays;

import java.util.HashMap;
import java.util.List;

public class NewYearChaos {
	
	public void minimumBribes(List<Integer> q) {
		int countBribe = 0;
		HashMap<Integer, Integer> bribeMap = new HashMap<Integer, Integer>();
		for (int i = 1; i < q.size(); i++) {
			int j=i;
			while(j>=1 && q.get(j) < q.get(j-1)) {
				int temp = q.get(j-1);
				q.set(j-1, q.get(j));
				q.set(j, temp);
				countBribe++;
				bribeMap.put(q.get(j), bribeMap.getOrDefault(q.get(j), Integer.valueOf(0)) + 1);
				if (bribeMap.getOrDefault(q.get(j), Integer.valueOf(0)) > 2) {
					System.out.println("Too chaotic");
					return;
				}
				j--;
			}
			
		}
		System.out.println("Minimum Bribe count : " + countBribe);
	}

}
