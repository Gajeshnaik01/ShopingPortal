package org.github.pratice;

import org.testng.annotations.Test;

public class PraticeTest1 {
	

	@Test
	public void test1() {
		String browser=System.getProperty("browser");
		String url=System.getProperty("url");
		String un=System.getProperty("USERNAME");
		String pwd=System.getProperty("PASSWORD");
		System.out.println("test1 --> PraticeTest1");
		System.out.println("Browser --> "+browser);
		System.out.println("URL --> "+url);
		System.out.println("username --> "+un);
		System.out.println("password --> "+pwd);

		System.out.println("password --> "+pwd);
		//Mani changed
//arup change
//gajesh changed


		
	}
	
	@Test
	public void test2() {
		
		String browser=System.getProperty("browser");
		String url=System.getProperty("url");
		System.out.println(browser);
		System.out.println(url);
		System.out.println("hi shaan");
	}
	
	
	

}
