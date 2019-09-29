package com.assignment.regex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RegexPatternTest {

	@Test
	void test() {
		RegexPattern pattern = new RegexPattern("Devesh.");
		boolean output1 = pattern.Check();
		assertEquals(true, output1);
		
		RegexPattern pattern1 = new RegexPattern("dev");
		boolean output2 = pattern1.Check();
		assertEquals(false, output2);
	}

}
