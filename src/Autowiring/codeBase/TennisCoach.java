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
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	public String getDailyWorkout() {
		
		return "Practice your backhand volly";
	}

	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
