package solve.problem;

import java.util.ArrayList;
import java.util.List;

// https://www.hackerrank.com/challenges/lisa-workbook/problem?isFullScreen=false

public class WorkSheet {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(4);
		arr.add(2);
		int c = workbook(2, 3, arr);
		Common.printInt(c);
	}

	public static int workbook(int chapters, int k, List<Integer> arr) {

		int special_indices = 0;
		int pages = 1;

		for (int chapter = 0; chapter < chapters; chapter++) {
			int num_problems = arr.get(chapter);
			for (int problem = 1; problem <= num_problems; problem++) {
				if (problem == pages) {
					special_indices++;
				}
				if (problem % k == 0 || problem == num_problems) {
					pages++;
				}
			}
		}

		return special_indices;
	}

}
