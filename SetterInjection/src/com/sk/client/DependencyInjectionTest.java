package com.sk.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sk.beans.SeasonFinder;

public class DependencyInjectionTest {
	public static void main(String[] args) {

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/sk/config/applicationContext.xml");
		Object obj = ctx.getBean("sf");
		SeasonFinder seasonFinder = (SeasonFinder)obj;
		String result = seasonFinder. currentSeason();
		System.out.println("Result:: " + result);
		ctx.close();
	}
}