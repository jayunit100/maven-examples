package com.rhbd.jayunit100;

import java.util.Map;

import junit.framework.Assert;

import org.junit.Test;

public class TestProperties {
	@Test
	public void testSystemProps(){
		Map m = System.getProperties();
		Util.prettyPrint(System.getProperties());

		/**
		 * Examples of JVM System Properties...
		 * Note that they are all lower case.
		 */
		Assert.assertTrue(m.containsKey("file.separator"));
		Assert.assertTrue(m.containsKey("java.version"));
	
		/**
		 * Now, lets see the maven properties that
		 * Note that this only works when run via mvn.
		 */
		Assert.assertTrue(m.containsKey("example1"));

	}

	@Test
	public void testEnv(){
		Map m = System.getenv();
		//Util.prettyPrint(m);
		/**
		 * NOTE: These may fail on some systems, since they are 
		 * JVM independant environment variables.
		 */
		Assert.assertTrue(m.containsKey("SHELL"));
		Assert.assertTrue(m.containsKey("PATH"));
		Assert.assertTrue(m.containsKey("HOME"));

	}
	
}
