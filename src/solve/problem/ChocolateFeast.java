package solve.problem;

/*
 * HackerRank Problem Link
 * https://www.hackerrank.com/challenges/chocolate-feast/problem?isFullScreen=true
 */

public class ChocolateFeast {

	public static void main(String[] args) {
		int c = chocolateFeast(15, 3, 2);
		Common.printInt(c);
	}

	public static int chocolateFeast(int total_money, int cost, int free_wrapper) {

		int wrappers = total_money / cost;
		int total_chocolates = wrappers;

		while (wrappers >= free_wrapper) {
			int new_wrappers = wrappers / free_wrapper;
			int remaining_wrappers = wrappers % free_wrapper;
			total_chocolates += new_wrappers;
			wrappers = new_wrappers + remaining_wrappers;
		}

		return total_chocolates;
	}

}
