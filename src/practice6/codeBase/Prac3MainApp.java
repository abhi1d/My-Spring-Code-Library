package practice6.codeBase;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prac3MainApp {

	public static void main(String[] args) {
		
		// read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Prac3Config.xml");
		
		// retrieve the bean 
		FortuneServiceImpl theFortune = context.getBean("happyFortuneImpl",FortuneServiceImpl.class);
		
		// printing intro
		System.out.println("Entering into the file.");
		
		
		// calling  methods
		System.out.println(theFortune.getDailyFortune());
	
		// close the context
		context.close();
	}

}
