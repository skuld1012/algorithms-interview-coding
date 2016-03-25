package me.tedzhang.interview.coding;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAlgorithms {

	@Test
	public final void testFirstNonRepeatedCharacter() {
		assertEquals(Algorithms.getFirstNonRepeatedCharacter("stress"), Character.valueOf('t'));
		assertEquals(Algorithms.getFirstNonRepeatedCharacter("teeter"), Character.valueOf('r'));
	}

	@Test
	public final void testReomveSpecificCharacters() {
		assertEquals(Algorithms.removeSpecificChars("Alive is awesome", "alwsr"), "Aive i eome");
		assertEquals(Algorithms.removeSpecificChars("Learning never stops", "estp"), "Larning nvr o");
	}
	
	@Test
	public final void testCountWord() {
		assertEquals(Algorithms.countWords("Alive is awesome "), 3);
		assertEquals(Algorithms.countWords("   manchester united is also known as red devil "), 8);
	}
	
	@Test
	public final void testPermutations() {
		assertArrayEquals(Algorithms.findPermutationsOfString("sky"), new String[]{"sky", "syk", "ksy", "kys", "ysk", "yks"});
	}
	
	@Test
	public final void convertString2Int() {
		assertEquals(Algorithms.convertStringToInt("12345"), 12345);
		assertEquals(Algorithms.convertStringToInt("-12345"), -12345);
	}
}
