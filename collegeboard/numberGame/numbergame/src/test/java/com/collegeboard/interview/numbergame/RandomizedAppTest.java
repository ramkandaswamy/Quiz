/**
 * 
 */
package com.collegeboard.interview.numbergame;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author ramana
 *
 */
public class RandomizedAppTest {

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

	/**
	 * Test method for {@link com.collegeboard.interview.numbergame.RandomizedApp#playGame()}.
	 * @throws IOException 
	 */
	@Test
	public final void testPlayGame() throws IOException {
		//Since behavior is random this method cannot be tested automatically
	}

}
