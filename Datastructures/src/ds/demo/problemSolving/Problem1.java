package ds.demo.problemSolving;

import java.util.HashSet;


public class Problem1 {

	/**
	 * @param args
	 */
	public static int solution(int[] A) {
		int N = A.length;
		int[] hashed = new int[N];

		for (int i : A) {
			if (i > 0 && i <= N) {
				hashed[i - 1] = 1;
			}
		}

		for (int i = 0; i < N; i++) {
			if (hashed[i] == 0) {
				return i + 1;
			}
		}
		return N + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {-88,5,1,2,3,10,4};
		System.out.println(solution(a));
	}

}
