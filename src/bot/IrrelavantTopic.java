package bot;

import java.lang.reflect.*;
import java.util.*;

public class IrrelavantTopic {
	Object obj;
	String keyword, wHquestion;
	boolean topicExists, hasQuestion;
	Method runTopic;

	ArrayList<String> topics = new ArrayList<String>();

	IrrelavantTopic(){
		topics.add("food");
		topics.add("hobbies");
		topics.add("me");
		topics.add("roar");
		topics.add("collections");
	}
	
	public Method checkRelavancy(String input) throws NoSuchMethodException, SecurityException {
		//check for keyword
		String[] textInput = input.split(" ");
		for(int i = 0; i < textInput.length; i++) {
			keyword = textInput[i];
			switch (keyword) {
				case "who": case "what": case "where": case "when": case "how":
				hasQuestion = true; wHquestion = keyword; break;
				default: break;
			}
			if (topics.contains(keyword)) {
				// If the String array contains any keyword; run class method
				String methodRunner = topics.get(topics.indexOf(keyword))+".runTopic(" + wHquestion +")";
				System.out.println(methodRunner);
				runTopic = obj.getClass().getMethod(methodRunner);
				
				return runTopic;
			}

		}

		return null;
	}
}
