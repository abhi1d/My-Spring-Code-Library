package practice1.codeBase;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("appPracDemoConfig.xml");
		
		// get the bean from spring container
		CoachImpl theCoach = context.getBean("tennisCoachImpl", CoachImpl.class);
		
		CoachImpl alphaCoach = context.getBean("tennisCoachImpl", CoachImpl.class);
				
		
		System.out.println("object 1: " + theCoach +"\nobject 2 : " + alphaCoach);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
				
		// close the context
		context.close();	
	}

}


