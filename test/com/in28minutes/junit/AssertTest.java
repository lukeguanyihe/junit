package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	void test() {
		boolean condn = true;
		assertTrue(condn);
		assertFalse(condn);
	}

}
