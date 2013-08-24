package com.rhbd.jayunit100;

import org.junit.Test;

public class TestProperties {
	@Test
	public void testSomethingSimple(){
		System.out.println(System.getenv());
		System.out.println(System.getProperties());
	}
}
