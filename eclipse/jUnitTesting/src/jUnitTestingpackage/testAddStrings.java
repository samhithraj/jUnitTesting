package jUnitTestingpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction junitstring = new jUnitFunction();
		String result = junitstring.addString("capstone", "project");
		assertEquals("capstoneproject",result);
	}

}
