
package bot;

import java.lang.reflect.*;

import java.util.*;
@SuppressWarnings("serial")
public class IrrelavantTopic extends chatBot{
	Object obj;
	String keyword, wHquestion;
	boolean topicExists, hasQuestion;
	Method runTopic;
	
	me meClass = new me();

	ArrayList<ArrayList<String>> topics = new ArrayList<ArrayList<String>>();
	
	ArrayList<String> foodRelated = new ArrayList<String>(){{add("food");add("eat");add("drink");add("tea");add("bubble");}};
	ArrayList<String> me = new ArrayList<String>(){{add("me");add("i");add("we");add("name");add("like");add("date");add("age");add("day");add("old");add("die");add("excellent");add("good");add("tall");add("long");add("size");add("big");add("can");add("capable");}};
	ArrayList<String> hobbies = new ArrayList<String>(){{add("shmeegulXD");add("reading");add("books");add("hobbies");add("shmeegul");add("hobbits");add("wizards");add("lotr");add("lord");add("movies");;}};
	ArrayList<String> collection = new ArrayList<String>(){{add("collection");add("rock");add("rocks");add("bone");add("bones");add("gem");add("gems");add("plant");add("plants");add("collect");add("dangerous");}};
	
	IrrelavantTopic(){ //constructor to initialize checking
		topics.add(foodRelated);
		topics.add(hobbies);
		topics.add(collection);
		topics.add(me);

	}
	
	//main relevancy method
	public boolean checkRelavancy(String input) throws NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		int qMark = input.indexOf("?");
		if(qMark>=0) {
			String key=input.substring(0,qMark);
			input = key;
		}
		hasQuestion = false;
		wHquestion = null;
		if(input.contains("quit") || input.contains("leave") || input.contains("stop")) {
			GUI.textArea.append("Thank you so much for talking to me! Have a good day!");
			return false;
		}
		//check for keyword
		if(input.contains("what do")) {
			hasQuestion = true;
			wHquestion = "what";
		}
		
		//This code is separate as "what are you" does not run in what question method
		if(input.contains("what are you")||input.contains("who are you")) {
			int i;
			double a = Math.random() * 10;
			if (a <= 3 ) i = 0;					// Generate a random num. and print respond accordingly 
			else if (a > 3 && a <= 6)i = 2;
			else i = 3;

			System.out.println(meClass.what[i]);// 0,2,3
			return true;
		}
		
		//splitting text to check for keywords
		String[] textInput = input.split(" ");
		
		//checking for keywords from split String array
		for(int i = 0; i < textInput.length; i++) {
			keyword = textInput[i];
			if(hasQuestion==false) { // if "what do" has not set hasQuestion to true
				switch (keyword) {
				// check for w/h questions
					case "who": case "what": case "where": case "when": case "how":
					hasQuestion = true; wHquestion=keyword; break;
				// check for "do you like..." questions	
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
		GUI.textArea.append("Sorry, I don't understand that.");	
		System.out.println("Sorry, I don't understand that.");
		return true;
		// - set up for irrelavant topics = "i dont understand"

	}
	
	public String getwHquestion() {
			return wHquestion;
		
	}
	
	public void doQuestion(String input) {
		if (input.contains("eating")||input.contains("eat")||input.contains("drink")||input.contains("rocks")||input.contains("bubble tea")||input.contains("collecting")||input.contains("lord of the rings")||input.contains("books")||input.contains("food")||input.contains("stones")) 
//		case "eating": case "eat": case "drinking": case "drink": case "bubble": case "rocks": case "rock": case "bones": case "bone":
			System.out.println("Yes I do.");
		else
			System.out.println("No I do not."); 
		
		return;
	}
		
}

