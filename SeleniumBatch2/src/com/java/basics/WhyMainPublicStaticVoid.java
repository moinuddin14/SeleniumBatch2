package com.java.basics;

import java.io.File;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class WhyMainPublicStaticVoid {

	@Rule
	public TemporaryFolder folder = new TemporaryFolder(new File(System.getProperty("user.dir")));
	
	@Test
	public void testMethod() throws IOException, InterruptedException{
		//folder.newFolder("temp");
		folder.newFile("test1.txt");
		Thread.sleep(10000);
	}
	
	@Test
	public void testMethod1() throws IOException, InterruptedException{
		folder.newFile("test2.txt");
		Thread.sleep(10000);
	}
}