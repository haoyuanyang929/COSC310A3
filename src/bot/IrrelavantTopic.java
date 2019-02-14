package bot;

import java.lang.reflect.*;
import java.util.*;

public class IrrelavantTopic {
	Object obj;
	String keyword, wHquestion;
	boolean topicExists, hasQuestion;
	Method runTopic;

	ArrayList<ArrayList<String>> topics = new ArrayList<ArrayList<String>>();
	ArrayList<String> foodRelated = new ArrayList<String>(){{add("food");add("eat");add("drink");add("tea");}};
	ArrayList<String> hobbies = new ArrayList<String>(){{add("lotr");add("reading");add("like");add("books");add("hobbies");}};
	ArrayList<String> me = new ArrayList<String>(){{add("me");add("name");add("dinosaur");add("date");add("tall");add("age");add("day");add("old");add("die");add("excellent");add("good");}};
	ArrayList<String> collection = new ArrayList<String>(){{add("collection");add("rock");add("enjoy");add("dinosaur");}};
	
	
	IrrelavantTopic(){
		topics.add(foodRelated);
		topics.add(hobbies);
		topics.add(me);
		topics.add(collection);
	}
	
	public boolean checkRelavancy(String input) throws NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		if(input.contains("quit") || input.contains("leave") || input.contains("stop")) {
			System.out.println("Thank you so much for talking to me! Have a good day!");
			return false;
		}
		//check for keyword
		String[] textInput = input.split(" ");
				
		for(int i = 0; i < textInput.length; i++) {
			keyword = textInput[i];
			switch (keyword) {
				case "who": case "what": case "where": case "when": case "how":
				hasQuestion = true; wHquestion=keyword; break;
				default: break;
			}
			for(int j = 0; j < topics.size(); j++) {
				if (topics.get(j).contains(keyword)) {
					// If the String array contains any keyword; run class method
					String cls = "bot."+topics.get(j).get(0);
					Class tpic = Class.forName(cls);
					Method methodRunner = tpic.getMethod("runTopic", String.class);
					
					methodRunner.invoke(tpic.getConstructor().newInstance(), input);
					return true;
				}
			}
		}
		
		System.out.println("Sorry, I don't understand that.");
		return true;
		// - set up for irrelavant topics = "i dont understand"

	}
	
	public String getwHquestion() {
			return wHquestion;
		
	}
		
	/**
	if(startoption.contains("roar")) { //if it contains roar jump to roar file
		boolean grab = checktopic("roar"); //checking topic for user confirmation
		if(grab == true) {
			System.out.println("roar accepted");
			RawrXD.main(null); //if user says yes it goes to collection topic
		}
		else {
			System.out.println("roar denied");
			inputfield(); //if user say no it goes back to input
		}
	}
	//collection else if it contains collection go here
	else if(startoption.contains("collection")) {
		boolean grab = checktopic("Collections"); //checking topic for user confirmation
		if(grab == true) {
			Collectiontopic.main(null); //if user says yes it goes to collection topic
		}
		else {
			inputfield(); //if user say no it goes back to input
		}
	}
	//Food else
	else if(startoption.contains("food")) { //if someone says food
		boolean grab = checktopic("Food"); //goes to checktopic to check if you want to talk food
		if(grab == true) {
			System.out.println("food accepted"); //food accepted go to food class
			
		}
		else {
			System.out.println("Food denied"); //denied go back to input
			inputfield();
		}
	}
	else if(startoption.contains("quit") || startoption.contains("leave") || startoption.contains("stop")) {
		System.out.println("Thank you so much for talking to me! Have a good day!");
		System.exit(0);
	}
	//if it doesn't understand
	else {
	System.out.println("Sorry I don't understand that."); //nothing useful in the phrase
	inputfield(); //go back to input and try again
	}
	***/
}
