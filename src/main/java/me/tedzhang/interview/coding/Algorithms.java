package me.tedzhang.interview.coding;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Algorithms {

	// Find the First non repeated character in the String
	public static Character getFirstNonRepeatedCharacter(String input) {

		Map<Character, Integer> charMap = new TreeMap<>();
		input.chars().forEach(charInt -> {
			Character character = Character.toChars(charInt)[0];
			if (charMap.containsKey(character)) {
				charMap.put(character, charMap.get(character) + 1);
			} else {
				charMap.put(character, 1);
			}
		});
		for (Character character : input.toCharArray()) {
			if (charMap.get(character) == 1) {
				return character;
			}
		}
		return null;
	}

	// Remove Specific Characters from the String
	public static String removeSpecificChars(String originalString, String removeCharacterString) {
		Map<Character, Object> removableCharacter = new HashMap<>();
		for (Character character : removeCharacterString.toCharArray()) {
			removableCharacter.put(character, null);
		}
		StringBuilder sb = new StringBuilder();
		for (Character character : originalString.toCharArray()) {
			if (removableCharacter.containsKey(character)) {
				continue;
			} else {
				sb.append(character);
			}
		}
		return sb.toString();
	}

	// Count number of Words in the String
	public static int countWords(String input) {

		int wordCount = 0;
		char[] inputCharArray = input.toCharArray();
		for (int i = 0; i < inputCharArray.length; i++) {
			if ((i > 0 && inputCharArray[i] != ' ' && inputCharArray[i - 1] == ' ')
					|| (inputCharArray[i] != ' ' && i == 0)) {
				wordCount++;
			}
		}

		return wordCount;
	}

	// Find permutations of string
	public static String[] findPermutationsOfString(String input) {
		Permutations perm = new Permutations(input);
		perm.permute();
		return perm.getPermutationResult();
	}

	// How To Convert String To Int In Java Without Using Integer ParseInt() Method
	public static int convertStringToInt(String input) {
		int sum = 0;
		for(int i=input.length()-1;i>=0;i--) {
			if(input.charAt(i) != '-') {
				Character c = input.charAt(i);
				int power = input.length() - 1 - i;
				sum += (Character.getNumericValue(c) * (Math.pow(10, power)));
			} else {
				sum = 0 - sum;
			}
		}
		return sum;
	}
}
