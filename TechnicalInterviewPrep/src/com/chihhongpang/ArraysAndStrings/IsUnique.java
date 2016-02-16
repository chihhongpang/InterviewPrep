package com.chihhongpang.ArraysAndStrings;

public class IsUnique {
	
	//Time O(N), Space O(1)
	public static boolean isUnique(String input) {
		if (input.length() > 256) return false;
		
		boolean[] charCheck = new boolean[256];
		for (int i = 0; i < input.length(); i++) { // O(N)
			int currentCharVal = input.charAt(i);
			if (charCheck[currentCharVal]) return false;
			charCheck[currentCharVal] = true;
		}
		return true;
	}
	
	public static void main(String[] args) {
		//First, ask if it's ASCII or Unicode. Assume it's ASCII. Unicode needs more storage.
		//Usually it's 128 characters for ASCII, or 256 for extended ASCII.
		System.out.println(isUnique("Hello"));
		System.out.println(isUnique("abcdefghi"));
	}
	
}
