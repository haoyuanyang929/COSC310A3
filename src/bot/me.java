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

	// all the possible responses are categorize by "wh-" keywords
	String[] who = { "I am a dinosaur.", "I am Tee-Tee.", "I am a T-rex. You can call me Tee-Tee.",
			"I am a ancient giant chicken.", "You are my lunch.", "You are a human and also my lunch.",
			"You are " /* user name */ };
	String[] what = { "I am a dinosaur.", "I am Tee-Tee.", "I am a T-rex. You can call me Tee-Tee.",
			"I am a ancient giant chicken.", "I can eat, eat, and Talk to you.", "I like food and other things.",
			"It's 100,000,000,000 years before ", "It's " /* today's day */, "You are " /* user name */, "I like stone.", "I like gem.", "I like rock.", "I like bones", "I like bubble tea", "I like milk tea", "I love Lord of the Ring"};
	String[] when = { "During luchtime", "During dinner time.", "Perhaps during breakfast time.", "Two days ago.",
			"It's Triassic Period.", "It's 100,000,000,000 years before ", "250 million years later." };
	String[] where = { "You are at my place.", "You are in my stomach.", "You are in the middle of a big continent." };
	String[] how = { "I am starving", "I am good.", "How rude! I am 35 years old", "My age is a secret.",
			"I am 40 ft tall.", "I am 12.3 meters tall.", "He died from a fireball from the sky." };
	String[] why = { "I have no idea.", "Because I am hungry.", "Because you look delicious and juicy.",
			"Because I am adorable.", "Because I am a hardworking, and talented T-rex.", "Because you are here.",
			"Because... Because... Because... What did you ask me again?", "Because I am a dinosaur." };

	@Override
	public void runTopic(String input) {
		
		String wHquestion = irrTopic.getwHquestion();
		switch (wHquestion) {
		case "what":
			whatQuestion(input);
			break;
		case "where":
			whereQuestion(input);
			break;									// This section run the method by input's wh-
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
		// print out the following when "who" is asked in the class 
		GUI.textArea.append("My knowledge is limited. Can you ask other question?");


	}

	@Override
	public void whatQuestion(String input) {
		if (input.contains("can") || input.contains("capable")) {
			GUI.textArea.append(what[4]);
		} else if (input.contains("like")) { // this part list one of the things that Tee-Tee likes 
			int i; 
			int a = (int)(Math.random()*((8-1)+1))+1;
			if ( a == 1) i = 5;
			else if ( a == 2 ) i = 9;
			else if ( a == 3 ) i = 10;
			else if ( a == 4 ) i = 11;      // Generate a random num. and print respond accordingly 
			else if ( a == 5 ) i = 12;
			else if ( a == 6 ) i = 13;
			else if ( a == 7 ) i = 14;
			else  i = 15;
			GUI.textArea.append(what[i]); //Possible position:5,9,10,11,12,13,14,15  //print
		} else if (input.contains("date")) { // print out the date of today 
			SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy");
			Date date = new Date();
			GUI.textArea.append(what[6] + dayFormat.format(date) + ".");
		} else if (input.contains("day")) { // print out the day of the week of today 
			// week day code
			SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
			Date date = new Date();
			GUI.textArea.append(what[7] + dayFormat.format(date)+".");
		} else if (input.contains("name") && input.contains("my")) {  // print out user's name 
			GUI.textArea.append(what[8] + name);

		} else if ((input.contains("you") || input.contains("your"))&& input.contains("name")) {
			GUI.textArea.append(what[1]);	// print out Tee-Tee's name 
		}else if (input.contains("you")) {	// define what is Tee-Teee (i.e. what are you)
			int i;
			double a = Math.random() * 10;
			if (a <= 3 ) i = 0;					// Generate a random num. and print respond accordingly 
			else if (a > 3 && a <= 6)i = 2;
			else i = 3;

			GUI.textArea.append(what[i]);// 0,2,3
		} else if ( input.contains("i")) { // the the user what the user is (i.e. what am i ) 
			int i;
			double a = Math.random() * 10;
			if (a <= 3)
				i = 4;
			else if (a > 3 && a <= 6)			// Generate a random num. and print respond accordingly 
				i = 5;
			else
				i = 6;
			GUI.textArea.append(who[i]);// 4,5,6
		} else {						// exception
			System.out.println("My knowledge is limited. Can you reword it?");
		}

	}

	@Override
	public void whereQuestion(String input) {
		// TODO Auto-generated method stub
//		where = { 0 "You are at my place.", 
//					1 "You are in my stomach.", 
//					2 "You are in the middle of a big continent." };
		if (input.contains("i")) {		// tell the user where the user is located 
			int i;
			double a = Math.random() * 10;
			if (a <= 3)
				i = 0;
			else if (a > 3 && a <= 6)		// Generate a random num. and print respond accordingly 
				i = 1;
			else
				i = 2;
			GUI.textArea.append(where[i]);// 0,1,2
		} else if (input.contains("we")) {	// tell the user where are they 
			int i;
			double a = Math.random() * 10;
			if (a >= 5)
				i = 0;						// Generate a random num. and print respond accordingly 
			else
				i = 2;
			GUI.textArea.append(where[i]);// 0,2
		} else {	//exception
			GUI.textArea.append("My knowledge is limited. Can you reword it?");
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
		// 6"250 million years later." */
		if (input.contains("eat") && input.contains("me")) {		// tell the user when will he or she going to be eaten by Tee-Tee
			int i;
			double a = Math.random() * 10;
			if (a <= 3)
				i = 0;
			else if (a > 3 && a <= 6)			// Generate a random num. and print respond accordingly 
				i = 1;
			else
				i = 2;
			GUI.textArea.append(when[i]);// 0,1,2
		} else if (input.contains("did") || input.contains("was") || input.contains("were")) { // ask about past 
			GUI.textArea.append(when[3]);
		} else if (input.contains("are") || input.contains("is") || input.contains("does")) { // ask about present 
			SimpleDateFormat dayFormat = new SimpleDateFormat("MMM, dd yyyy");
			Date date = new Date();			// print out today's date 
			GUI.textArea.append(when[5] + dayFormat.format(date) + ".");
		} else if (input.contains("will") || input.contains("2019")) { // ask about future 
			GUI.textArea.append(when[7]);
		} else { 		//exception
			SGUI.textArea.append("My knowledge is limited. Can you reword it?");
		}
	}

	@Override
	public void whyQuestion(String input) {
		// TODO Auto-generated method stub
		if ((input.contains("eat") || input.contains("food")) && (input.contains("i") && input.contains("me"))) { // why eat me ? & why i am your food?
			int i;
			double a = Math.random() * 100;
			if (a <= 25)
				i = 1;
			else if (a > 25 && a <= 50)		// Generate a random num. and print respond accordingly 
				i = 2;
			else if (a > 50 && a <= 75)
				i = 5;
			else
				i = 7;
			GUI.textArea.append(why[i]);// 1,2,5,7

		} else if ((input.contains("good") || input.contains("excellent")) && input.contains("you")) { // why you are so good? & why you are excellent?
			int i;
			double a = Math.random() * 10;
			if (a >= 5)
				i = 3;						// Generate a random num. and print respond accordingly 
			else
				i = 4;
			GUI.textArea.append(why[i]);// 3,4
		} else {								// exception
			int i;
			double a = Math.random() * 10;
			if (a >= 5)						// Generate a random num. and print respond accordingly 
				i = 0;
			else
				i = 7;
			GUI.textArea.append(why[i]);// 0,7
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

		if (input.contains("age") || input.contains("old")) { // ask about age
			int i;
			int a = (int) Math.random() * 2;
			if (a == 0)									// Generate a random num. and print respond accordingly 
				i = 2;
			else
				i = 3;
			GUI.textArea.append(how[i]);// 2,3
		} else if (input.contains("tall") || input.contains("long") || input.contains("big") || input.contains("size")) {	// ask about hight 
			int i;
			double a = Math.random() * 10;
			if (a >= 5)
				i = 4;								// Generate a random num. and print respond accordingly 
			else
				i = 5;
			GUI.textArea.append(how[i]);// 4,5
		} else if (input.contains("die") || input.contains("dead") || input.contains("died")) { // ask about death 
			GUI.textArea.append(how[6]);
		} else if (input.contains("you") && (input.contains("are") || input.contains("do"))) {  // how are you? or how do you do?
			int i;
			double a = Math.random() * 100;
			if (a >= 50)
				i = 0;
			else								// Generate a random num. and print respond accordingly 
				i = 1;
			GUI.textArea.append(how[i]);// 0,1
		} else {			// exception
			GUI.textArea.append("My knowledge is limited. Can you reword it?");
		}

	}

}
