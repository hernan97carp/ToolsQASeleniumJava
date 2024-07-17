package com.toolsqa.base;
import org.junit.AfterClass;

public class BaseTest extends BaseClass {

	@AfterClass
	public static void tearDown() {
		quit();
	}

}
