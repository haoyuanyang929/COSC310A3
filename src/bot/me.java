package bot;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class me implements TopicQuestions {
	
	public me () {
		
	};
	
	Scanner in = new Scanner(System.in);
	
	IrrelavantTopic irrTopic = new IrrelavantTopic();
	
	String[] who = {"I am a dinosaur.", "I am Tee-Tee.", "I am a T-rex. You can call me Tee-Tee.", "I am a ancient giant chicken.", "You are my lunch.", "You are a human and also my lunch.", "You are " /*user name*/}; 
	String[] what = {"I am a dinosaur.", "I am Tee-Tee.", "I am a T-rex. You can call me Tee-Tee.", "I am a ancient giant chicken.", "I can eat, eat, and… Talk to you.", "I like food and other things.", "It's "/*today date*/, "It's " /*today's day*/};
	String[] when = {"During luchtime", "Durig dinner time.", "Perhaps during breakfest time.", "Two days ago.", "It’s Triassic Period.","It's "/*today date*/, "It's " /*today's day*/, "250 million years later."};
	String[] where = {"You are at my place.", "You are in my stomach.", "You are in the midddle of a big continent."};
	String[] how = {"I am starving", "I am good.", "How rude! I am 35 years old", "My age is a secret.", "I am 40 ft tall.", "I am 12.3 meters tall.", "He died from a fireball from the sky."};
	String[] why = {"I have no idea.", "Because I am hungry.","Because you look delicious and juicy.","Because I am adorable.","Because I am a hardworking, and talented T-rex.","Because you are here." ,"Because… Because… Because…. What did you ask me again?",	"Because I am a dinosaur."};
	
	

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
		}
		
	}
	@Override
	public void whoQuestion(String input) {
		// TODO Auto-generated method stub
		if (input.contains("you")){
			int i ;
			double a = Math.random()*100/4;
			if ( a <= 25) i = 0;
			else if (a > 25 && a <= 50) i = 1;
			else if (a > 50 && a <= 75) i = 2;
			else i = 3;
			System.out.println(what[i]);//0,1,2,3
		}else if ( input.contains("i")) {
			int i ;
			double a = Math.random()*10/3;
			if ( a <= 1) i = 4;
			else if (a > 1 && a <= 2) i = 5;
			else{
				i = 6;
				String userName = in.nextLine();
				what[6] = what[6]+userName;
			}
			System.out.println(what[i]);//4, 5, 6 
		}else {
			System.out.println("My knowledge is limited. Can you reword it?");
		}
		
	}
	@Override
	public void whatQuestion(String input) {
		if (input.contains("name")) {
			System.out.println(what[1]);
		}else if(input.contains("you")){
			int i ;
			double a = Math.random()*10/3;
			if ( a <= 1) i = 0;
			else if (a > 1 && a <= 2) i = 2;
			else i = 3;
			System.out.println(what[i]);//0,2,3
		}else if(input.contains("can") || input.contains("capable")) {
			System.out.println(what[4]);
		}else if(input.contains("like")) {
			System.out.println(what[5]);
		}else if(input.contains("date")){
			SimpleDateFormat dayFormat = new SimpleDateFormat("MM, DD yyyy");  
		    Date date = new Date();  
			System.out.println(what[6] + dayFormat.format(date));
		}else if(input.contains("day")){
			// week day code 
		}else {
			System.out.println("My knowledge is limited. Can you reword it?");
		}
		
		
	}
	@Override 
	public void whereQuestion(String input) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void whenQuestion(String input) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void whyQuestion(String input) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void howQuestion(String input) {
		// TODO Auto-generated method stub
		
	}

}
