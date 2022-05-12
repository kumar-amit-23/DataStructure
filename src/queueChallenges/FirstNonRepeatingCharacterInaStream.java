package queueChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class FirstNonRepeatingCharacterInaStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		Queue<Character> q = new LinkedList<>();
		HashMap<Character, Integer> map = new HashMap<>();
		while (ch != '.') {
			q.add(ch);
			if (map.containsKey(ch)) {
				int ov = map.get(ch) + 1;
				map.put(ch, ov);
			} else {
				map.put(ch, 1);
			}
			while (!q.isEmpty()) {
				char c = q.peek();
				if (map.get(c) == 1) {
					System.out.println(c + " ");
					break;
				} else {
					q.poll();
				}
			}

			if (q.isEmpty())
				System.out.println("-1");

			ch = scn.next().charAt(0);

		}

		scn.close();

	}

	public List<Integer> addToArrayForm(int[] nums, int k) {
		int number = 0;
		for (int i = 0; i < nums.length; i++) {
			number += nums[i] * (int) Math.pow(10, nums.length - 1);
		}

		number = number + k;
		List<Integer> ans = new ArrayList<>();
		while (number != 0) {
			int rem = number % 10;
			ans.add(rem);
			number /= 10;
		}

		Collections.reverse(ans);
		return ans;
	}

}
