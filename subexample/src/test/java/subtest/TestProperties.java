package subtest;

import java.util.Map;

import junit.framework.Assert;

import org.junit.Test;

public class TestProperties {
	@Test
	public void testSystemProps(){
		Assert.assertTrue(System.getProperties().get("example1").equals("hello-maven"));
	}

	@Test
	public void testEnv(){
		Map m = System.getenv();
		Assert.assertTrue(m.containsKey("SHELL"));
		Assert.assertTrue(m.containsKey("PATH"));
		Assert.assertTrue(m.containsKey("HOME"));
	}
	
}
