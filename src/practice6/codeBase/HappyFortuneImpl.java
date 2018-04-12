package practice6.codeBase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.sun.tools.javac.parser.Scanner;

@Component("happyFortuneImpl")
public class HappyFortuneImpl implements FortuneServiceImpl {

	public String getDailyFortune() {
		
		return "Live a Log Life";
	}
	public Scanner sc;
	
	public HappyFortuneImpl() {
		System.out.println(" >> inside the Happy fortune constructor");
	}
	
	// post constructor method
	@PostConstruct
	public void doReadFile() throws IOException {
	
		 File file = new File("/home/abhi/eclipse-projects/My-Spring-Code-Library/src/fortunes.txt");
		 
		 BufferedReader br = new BufferedReader(new FileReader(file));
		 
		 String st;
		 while ((st = br.readLine()) != null)
		    System.out.println(st);
		  }
		
		
	
	

}


