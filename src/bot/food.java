package bot;

import java.util.Scanner;

public class food extends chatBot implements TopicQuestions {
	
	IrrelavantTopic irrTopic;
	
	public food(){
		 irrTopic = chatBot.irrTopic;
		}
	
	Scanner in = new Scanner(System.in);
	
	
	String[] what = {"Meat, like human", "Human, just like you", "Bubble Tea", "It's delisious"};
	String[] where = {"In my cave", "In Taiwan"};
	String[] who = {"Sometimes with myself", "Sometimes with other dinosaurs", "by myself", "The owner."};
	String[] how = {"four times", "It's so delicious", "By my hand", "It's a combination of tea and milk and tapioca balls.", "I like it half sweet."};
	String[] why = {"I need to eat.", "Because you look delicious."};
	String[] when = {"During luchtime", "Durig dinner time.", "Perhaps during breakfest time.", "Two days ago.", "When I am hungry."};		

	
	@Override
	public void runTopic(String input) {
		// TODO Auto-generated method stub
		String wHquestion = irrTopic.getwHquestion();
		switch (wHquestion) {
		case "what": 
			whatQuestion(input);
			break;
		case "where":
			whereQuestion(input);
			break;
		case "when":
			whenQuestion(input);
			break;
		case "why":
			whyQuestion(input);
			break;
		case "how":
			howQuestion(input);
			break;
		case "who":
			whoQuestion(input);
			break;
		}
		
	}
	


	@Override
	public void whoQuestion(String input) {
		// TODO Auto-generated method stub
		if (input.contains("with")){
		int mathtest = (int)(Math.random()*2);
			if(mathtest == 1)
				System.out.println(who[0]);
			else
				System.out.println(who[1]);
		}
			else if(input.contains("cook")){
				System.out.println(who[2]);
			}else if(input.contains("make")){
				System.out.println(who[3]);
			}
		
		
		
	}



	@Override
	public void whatQuestion(String input) {
		// TODO Auto-generated method stub
		if (input.contains("eat")){
			int mathtest = (int)(Math.random()*2);
				if(mathtest == 1)
					GUI.textArea.append(what[0]);
				else
					GUI.textArea.append(what[1]);
			}
		else if(input.contains("drink")){
			GUI.textArea.append(what[2]);
		}
		else if(input.contains("about")){
			GUI.textArea.append(what[3]);
		}
		
	}



	@Override
	public void whereQuestion(String input) {
		// TODO Auto-generated method stub
		if (input.contains("eat")){
			GUI.textArea.append(where[0]);		
		}
		else if (input.contains("bubble tea") && input.contains("invent")){
			GUI.textArea.append(where[1]);
		}
	}



	@Override
	public void whenQuestion(String input) {
		// TODO Auto-generated method stub
		if (input.contains("eat") && input.contains("lunch")){
			GUI.textArea.append(when[0]);
		}
		else if (input.contains("eat") && input.contains("dinner")){
			GUI.textArea.append(when[1]);
		}
		else if (input.contains("eat") && input.contains("breakfast")){
			GUI.textArea.append(when[2]);
		}
		
		else if (input.contains("last") && input.contains("meal")){
			GUI.textArea.append(when[3]);
		}
		else if (input.contains("eat")){
			GUI.textArea.append(when[4]);
		}
	}



	@Override
	public void whyQuestion(String input) {
		// TODO Auto-generated method stub
		if (input.contains("eat") && (input.contains("me")|| input.contains("human"))){
			GUI.textArea.append(who[1]);
		}
		else if (input.contains("eat")){
			GUI.textArea.append(who[0]);
		}
	}



	@Override
	public void howQuestion(String input) {
		// TODO Auto-generated method stub
		if (input.contains("about")){
			GUI.textArea.append(how[1]);
		} else if (input.contains("many") && input.contains("meal") && (input.contains("eat"))){
			GUI.textArea.append(how[0]);
		} else if (input.contains("do") && input.contains("eat")){
			GUI.textArea.append(how[2]);
		} else if (input.contains("bubble tea") && input.contains("made")){
			GUI.textArea.append(how[3]);
		} else if (input.contains("do") && input.contains("like") && input.contains("bubble tea")){
			GUI.textArea.append(how[4]);
			
		}
	}
}
