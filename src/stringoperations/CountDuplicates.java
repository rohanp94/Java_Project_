package stringoperations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountDuplicates {
	
	public static void main (String args[]) {
		
		List<Integer> listof =  Arrays.asList( 1,2,1,2,4,5,4,5,5);
		Map<Integer,Integer> countDupli = new HashMap<>();
		for (int num : listof) {
			countDupli.put(num, countDupli.getOrDefault(num, 0)+1);
		}
		countDupli.forEach((key,value)-> {
			if (value > 1) {
				System.out.println(key + " Appears " + value + " Times ");
			}
		});
				}


	


	

}
