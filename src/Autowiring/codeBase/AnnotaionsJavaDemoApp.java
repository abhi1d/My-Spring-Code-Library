package Autowiring.codeBase;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotaionsJavaDemoApp {

	public static void main(String[] args) {
		
		// read spring config file 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring containdr
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		// call a method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// call a method to get daily work out
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();

	}

}
