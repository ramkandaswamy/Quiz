/**
 * 
 */
package com.collegeboard.interview.numbergame;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author ramana
 *
 */
//@RunWith(Parameterized.class)
public class AppTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.setIn(System.in);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
	}

//	@Parameters (name = "{index}: setIn({0})={1}")
//	public static List<Object[]> guessNumber() {
//		return Arrays.asList(new Object[][] { { "higher lower yes", 50 },{ "higher lower lower yes", 25 }});
//	}

	/**
	 * Test method for
	 * {@link com.collegeboard.interview.numbergame.App#main(java.lang.String[])}
	 * .
	 * @throws IOException 
	 */
//	@Test
//	public final void testPlayGame() throws IOException {
//		ByteArrayInputStream in = new ByteArrayInputStream("higher lower yes".getBytes());
//		System.setIn(in);
//		int compGuessValue = App.playGame();
//		Assert.assertEquals(compGuessValue, 50);
//		assertTrue("game worked", true); 
//		in.close();
//	}

	/**
	 * Test method for
	 * {@link com.collegeboard.interview.numbergame.App#main(java.lang.String[])}
	 * .
	 * @throws IOException 
	 */
	@Test
	public final void testPlayGameWithParams() throws IOException {
		ByteArrayInputStream in = new ByteArrayInputStream(
				"higher lower lower higher lower higher lower higher lower yes".getBytes());
		System.setIn(in);
		int compGuessValue = App.playGame();
		Assert.assertEquals(compGuessValue, 32);
		assertTrue("game worked", true); 
		in.close();
	}
}
