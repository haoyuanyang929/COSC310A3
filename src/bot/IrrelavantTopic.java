
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
	ArrayList<String> me = new ArrayList<String>(){{add("me");add("i");add("we");add("name");add("dinosaur");add("date");add("tall");add("like");add("age");add("day");add("old");add("die");add("excellent");add("good");add("tall");add("long");add("size");add("big");}};
	ArrayList<String> hobbies = new ArrayList<String>(){{add("shmeegulXD");add("reading");add("books");add("hobbies");add("shmeegul");add("hobbits");add("wizards");}};
	ArrayList<String> collection = new ArrayList<String>(){{add("collection");add("rock");add("rocks");add("bone");add("bones");add("gem");add("gems");add("plant");add("plants");add("collect");add("dangerous");}};
	
	IrrelavantTopic(){
		topics.add(foodRelated);
		topics.add(hobbies);
		topics.add(collection);
		topics.add(me);

	}
	
	public boolean checkRelavancy(String input) throws NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		if (input.split("?")[1]==null) {
			System.out.println("null");
		}else {
			input = input.split("?")[0];
		}
		hasQuestion = false;
		wHquestion = null;
		if(input.contains("quit") || input.contains("leave") || input.contains("stop")) {
			System.out.println("Thank you so much for talking to me! Have a good day!");
			return false;
		}
		//check for keyword
		if(input.contains("what do")) {
			hasQuestion = true;
			wHquestion = "what";
		}
		String[] textInput = input.split(" ");
		//
		for(int i = 0; i < textInput.length; i++) {
			keyword = textInput[i];
			if(hasQuestion==false) {
				switch (keyword) {
					case "who": case "what": case "where": case "when": case "how":
					hasQuestion = true; wHquestion=keyword; break;
					case "do":
					doQuestion(input); return true;
					default: break;
				}
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
	
	public void doQuestion(String input) {
		if (input.contains("eating")||input.contains("eat")||input.contains("drink")||input.contains("rocks")||input.contains("bubble tea")||input.contains("collecting")) 
//		case "eating": case "eat": case "drinking": case "drink": case "bubble": case "rocks": case "rock": case "bones": case "bone":
			System.out.println("Yes I do.");
		else
			System.out.println("No I do not."); 
		
		return;
	}
		
}

