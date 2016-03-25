package me.tedzhang.interview.coding;

import java.util.LinkedList;
import java.util.List;

public class Permutations {
	private boolean[] used;
	private StringBuilder out = new StringBuilder();
	private final String in;
	private List<String> result = new LinkedList<>();

	public Permutations(final String str) {
		in = str;
		used = new boolean[in.length()];
	}

	public void permute() {
		if (out.length() == in.length()) {
			result.add(out.toString());
			return;
		}
		for (int i = 0; i < in.length(); ++i) {
			if (used[i])
				continue;
			out.append(in.charAt(i));
			used[i] = true;
			permute();
			used[i] = false;
			out.setLength(out.length() - 1);
		}
	}
	
	public String[] getPermutationResult() {
		return result.toArray(new String[result.size()]);
	}
	
	public static void main(String[] args) {
		Permutations perm = new Permutations("sky");
		perm.permute();
	}
}
