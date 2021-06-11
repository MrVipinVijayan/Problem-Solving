package solve.problem;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingStringLength {

	public static void main(String[] args) {
		int c = nonRepeatingStringLength("abcdefhhha");
		Common.printInt(c);
	}

	public static int nonRepeatingStringLength(String input) {
		
		int max_length = 0;
		int cur_length = 0;
		
		Map<Character, Integer> visited = new HashMap<>();
		
		for(int index = 0; index < input.length(); index++) {
			char current_char = input.charAt(index);
			if(visited.containsKey(current_char)) {
				max_length = Math.max(max_length, cur_length);
				visited.remove(current_char);
				cur_length = 1;
			}else {
				cur_length++;
				visited.put(current_char, index);
			}
		}
		
		return  Math.max(max_length, cur_length) - 1;
		
	}

}
