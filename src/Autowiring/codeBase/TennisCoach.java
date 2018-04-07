package Autowiring.codeBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach{

	private FortuneService fortuneService;
	
	// constructor
	// we can comment this autowired annotations and it will work same for this scenario
	// becoz in new update of spring there are no need to annotate the constructor 
	// only on when one object is connected.
	// @{an @Autowired annotation on such a constructor is no longer necessary
	//   if the target bean only defines one constructor to begin with. 
	//   However, if several constructors are available, at least one must be annotated to teach the container which one to use.}
	/*@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/
	
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach : inside default constructor");
	}
	
	// define a setter method
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach : inside setFortuneSerive() method");
		this.fortuneService = fortuneService;
	}*/
	
	// define any method
	@Autowired
	public void doFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach : inside doFortuneService() method");
		this.fortuneService = fortuneService;
	}
	
	public String getDailyWorkout() {
		
		return "Practice your backhand volly";
	}

	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
