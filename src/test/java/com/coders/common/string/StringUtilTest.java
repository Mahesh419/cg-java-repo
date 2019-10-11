package com.coders.common.string;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chinthakad
 */
public class StringUtilTest {

	private StringUtil stringUtil;

	@Before
	public void setUP() {
		stringUtil = new StringUtil();
	}

	@Test
	public void testGetCommaSeparatedSet() {
		Set<String> inputStringSet = new LinkedHashSet<>();
		inputStringSet.add("Your");
		inputStringSet.add("Java");
		inputStringSet.add("Knowledge");
		String result = stringUtil.getCommaSeparatedSet(inputStringSet);
		assertEquals("Resulted comma separated String is wrong !", "Your,Java,Knowledge", result);
	}
}
