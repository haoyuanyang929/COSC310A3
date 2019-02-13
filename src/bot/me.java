package bot;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class me extends chatBot implements TopicQuestions {
	IrrelavantTopic irrTopic;

	public me() {
		irrTopic = chatBot.irrTopic;
	};

	Scanner in = new Scanner(System.in);

	String[] who = { "I am a dinosaur.", "I am Tee-Tee.", "I am a T-rex. You can call me Tee-Tee.",
			"I am a ancient giant chicken.", "You are my lunch.", "You are a human and also my lunch.",
			"You are " /* user name */ };
	String[] what = { "I am a dinosaur.", "I am Tee-Tee.", "I am a T-rex. You can call me Tee-Tee.",
			"I am a ancient giant chicken.", "I can eat, eat, and… Talk to you.", "I like food and other things.",
			"It's "/* today date */, "It's " /* today's day */, "You are " /* user name */ };
	String[] when = { "During luchtime", "During dinner time.", "Perhaps during breakfast time.", "Two days ago.",
			"It’s Triassic Period.", "It's "/* today date */, "250 million years later." };
	String[] where = { "You are at my place.", "You are in my stomach.", "You are in the middle of a big continent." };
	String[] how = { "I am starving", "I am good.", "How rude! I am 35 years old", "My age is a secret.",
			"I am 40 ft tall.", "I am 12.3 meters tall.", "He died from a fireball from the sky." };
	String[] why = { "I have no idea.", "Because I am hungry.", "Because you look delicious and juicy.",
			"Because I am adorable.", "Because I am a hardworking, and talented T-rex.", "Because you are here.",
			"Because… Because… Because…. What did you ask me again?", "Because I am a dinosaur." };

	@Override
	public void runTopic(String input) {
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
		}
		return;
	}

	@Override
	public void whoQuestion(String input) {
		// TODO Auto-generated method stub
		if (input.contains("you")) {
			int i;
			double a = Math.random() * 100 / 4;
			if (a <= 25)
				i = 0;
			else if (a > 25 && a <= 50)
				i = 1;
			else if (a > 50 && a <= 75)
				i = 2;
			else
				i = 3;
			System.out.println(who[i]);// 0,1,2,3
		} else if (input.contains("i")) {
			int i;
			double a = Math.random() * 10 / 3;
			if (a <= 1)
				i = 4;
			else if (a > 1 && a <= 2)
				i = 5;
			else {
				i = 6;
				who[6] = who[6] + name;
			}
			System.out.println(who[i]);// 4, 5, 6
		} else {
			System.out.println("My knowledge is limited. Can you reword it?");
		}

	}

	@Override
	public void whatQuestion(String input) {
		if (input.contains("name")) {
			System.out.println(what[1]);
		} else if (input.contains("you")) {
			int i;
			double a = Math.random() * 10 / 3;
			if (a <= 1)
				i = 0;
			else if (a > 1 && a <= 2)
				i = 2;
			else
				i = 3;
			System.out.println(what[i]);// 0,2,3
		} else if (input.contains("can") || input.contains("capable")) {
			System.out.println(what[4]);
		} else if (input.contains("like")) {
			System.out.println(what[5]);
		} else if (input.contains("date")) {
			SimpleDateFormat dayFormat = new SimpleDateFormat("MM, DD yyyy");
			Date date = new Date();
			System.out.println(what[6] + dayFormat.format(date));
		} else if (input.contains("day")) {
			// week day code
			DateFormatSymbols dfs = new DateFormatSymbols();
			System.out.println(what[7] + dfs.getWeekdays());
		} else if (input.contains("name") && input.contains("my")){
			System.out.println(what[8] + name);
		}else {
			System.out.println("My knowledge is limited. Can you reword it?");
		}

	}

	@Override
	public void whereQuestion(String input) {
		// TODO Auto-generated method stub
//		where = { 0 "You are at my place.", 
//					1 "You are in my stomach.", 
//					2 "You are in the middle of a big continent." };
		if ( input.contains("i")) {
			int i;
			double a = Math.random() * 3;
			if (a == 0) i = 0;
			else if (a == 1)i = 1;
			else i = 2;
			System.out.println(where[i]);// 0,1,2
		}else if (input.contains("we")){
			int i;
			double a = Math.random() * 100 / 2;
			if (a <= 50) i = 0;
			else i = 2;
			System.out.println(where[i]);// 0,2
		}else {
			System.out.println("My knowledge is limited. Can you reword it?");
		}

	}

	@Override
	public void whenQuestion(String input) {
		// TODO Auto-generated method stub
		// 0"During luchtime",
		// 1"Durig dinner time.",
		// 2"Perhaps during breakfest time.",
		// 3"Two days ago.", 
		// 4"It’s Triassic Period.",
		// 5"It's "/*today date*/,
		//
		// 6"250 million years later." */
		if (input.contains("eat") || input.contains("food") || input.contains("meal")) {
			int i;
			double a = Math.random() * 10 / 3;
			if (a <= 1) i = 0;
			else if (a > 1 && a <= 2)i = 1;
			else i = 2;
			System.out.println(when[i]);// 0,1,2
		} else if (input.contains("did") || input.contains("was") || input.contains("were")) {
			System.out.println(when[3]);
		} else if (input.contains("are") || input.contains("is") || input.contains("does")|| input.contains("date")) {
			SimpleDateFormat dayFormat = new SimpleDateFormat("MM, DD yyyy");
			Date date = new Date();
			System.out.println(when[5] + dayFormat.format(date));
		} else if ( input.contains("will") || input.contains("2019")) {
			System.out.println(when[7]);
		} else {
			System.out.println("My knowledge is limited. Can you reword it?");
		}
	}

	@Override
	public void whyQuestion(String input) {
		// TODO Auto-generated method stub
//		 why = {0 "I have no idea.", 
//				1 "Because I am hungry.", 
//				2 "Because you look delicious and juicy.",
//				3"Because I am adorable.", 
//				4"Because I am a hardworking, and talented T-rex.", 
//				5"Because you are here.",
//				6"Because… Because… Because…. What did you ask me again?", 
//				7"Because I am a dinosaur." };
		if (input.contains("eat") || input.contains("food")) {
			int i;
			double a = Math.random() * 4;
			if (a == 0)
				i = 1;
			else if (a == 1)
				i = 2;
			else if (a == 2)
				i = 5;
			else
				i = 7;
			System.out.println(why[i]);// 1,2,5,7
			
		}else if(input.contains("good") || input.contains("excellent")) {
			int i;
			double a = Math.random() * 100 / 2;
			if (a <= 50) i = 3;
			else i = 4;
			System.out.println(why[i]);// 3,4
		}else {
			int i;
			double a = Math.random() * 100 / 2;
			if (a <= 50) i = 0;
			else i = 7;
			System.out.println(why[i]);// 0,7
		}
		
	}

	@Override
	public void howQuestion(String input) {
		// TODO Auto-generated method stub
//		how = { 0"I am starving", 
//				1"I am good.", 
//				2"How rude! I am 35 years old", 
//				3"My age is a secret.",
//				4"I am 40 ft tall.", 
//				5"I am 12.3 meters tall.", 
//				6"He died from a fireball from the sky." };
		if (input.contains("you") && (input.contains("are") || input.contains("do"))) {
			int i;
			double a = Math.random() * 100 / 2;
			if (a <= 50) i = 0;
			else i = 1;
			System.out.println(how[i]);// 0,1
		} else if ( input.contains("age") || input.contains("old")) {
			int i;
			double a = Math.random() * 100 / 2;
			if (a <= 50) i = 2;
			else i = 3;
			System.out.println(how[i]);// 2,3
		} else if ( input.contains("tall") || input.contains("long") || input.contains("big") || input.contains("size")) {
			int i;
			double a = Math.random() * 100 / 2;
			if (a <= 50) i = 4;
			else i = 5;
			System.out.println(how[i]);// 4,5
		} else if ( input.contains("die") || input.contains("dead") || input.contains("died")) {
			System.out.println(how[6]);
		}else {
			System.out.println("My knowledge is limited. Can you reword it?");
		}
		 
	}

}
