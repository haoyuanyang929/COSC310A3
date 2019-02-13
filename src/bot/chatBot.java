package bot;
import java.lang.reflect.*;
import java.util.Scanner;
public class chatBot {

	static String name; 
	static String checkstring;
	public static IrrelavantTopic irrTopic;
	
	public static void main(String args[]) {
		//added a cute little printing thing. lemme know thoughts. keep it until we get GUI

		irrTopic = new IrrelavantTopic();
		//Loadingscrean.main(args); 

		
		System.out.println("ROAr roar roooar roar rrrroooaaaarrr RoaaaaaaaaaaaaaaaAAArrArArAr");
		System.out.println("Welcome to the Dino-Bot, Please Enter the name you would like to be called by.");
		Scanner mainscan = new Scanner(System.in);
		name = mainscan.nextLine();
		System.out.println("Greetings " + name + ". My name is Tee-Tee the T-Rex!!");
		
		//feel free to change later, just did this so i could access code from main area
		inputfield();
		mainscan.close();

		
	}
	
	public static void inputfield(){ //input method. Subject to change like crazy
		
		System.out.println("..........."); //spacer
		System.out.println("Curious to know what I can talk about? Have a list"); //prints list of topics
		System.out.println(thinking());	  
		System.out.println(thinking());   
		System.out.println(thinking());   
		System.out.println("..........."); //spacer
		System.out.println("We can test how well your roar is!");
		System.out.println("Or we can talk about food");
		System.out.println("I know a decent amount about INSERT TOPIC 1");
		System.out.println("We can discuss collection!");
		System.out.println("How about talking about INSERT TOPIC 3");
		System.out.println("INSERT TOPIC 4 happens to be something that interests me");
		System.out.println("Or maybe you want to talk about INSERT TOPIC 5");
		System.out.println("Or if you want to get to know me thats fine too!");
		System.out.println(thinking());
		
		
		//checking what they are talking about.
		boolean continueConv;
		do {
		continueConv = conversation();
		}while(continueConv!=false);
		if (continueConv == false) {
			System.exit(0);
		}
		//roar else
		
	}
	
	public static boolean conversation() {
		Scanner inscan = new Scanner(System.in);
		String startoption = (inscan.nextLine()).toLowerCase(); //scanning an input
		checktopic(startoption); // - keep checktopic for roar contest
		try {
			return irrTopic.checkRelavancy(startoption);
			
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | ClassNotFoundException | InstantiationException e) {
			// TODO Auto-generated catch block
			System.out.println("Sorry! There seems to be an issue.");
			System.out.println("Please restart the program.");
			return false;
		}
	}
	
	public static String thinking(){ //prints a line of dots after 1.5 seconds to mimic thinking animation
		long curtime = System.currentTimeMillis();
		long waittime1 = curtime + 150;
		while (curtime != waittime1){				
			 curtime = System.currentTimeMillis();  
		}                                           
		 return "............";

	}
	//CHECKING THE TOPIC
	public static void checktopic(String top) { //grabs the topic, to save space this is used fo most topics
		Scanner topche = new Scanner(System.in);
		if(top.contains("roar")) {
			System.out.println("Sorry! My dino-speech is better than my english, did you want to have a roaring contest?"); //maybe you didn't mean to go here
			String topicyesno = (topche.nextLine()).toLowerCase();
			String[] topicsentence = topicyesno.split(" "); //splitting it up
			for(int i = 0; i < topicsentence.length; i++){ //
				String topgrabbed = topicsentence[i];
				switch(topgrabbed){ //switch parsing string to see what happens
				
				case "yes": case "yup": case "okay": case "sure": case "ok":
					RawrXD.main(null); // plays roaring contest
				case "no": case "nope": case "nah": case "never":
					System.out.println("No? Okay then.");
					inputfield(); //returns false to where it was called.
					
				default:
					System.out.println("I still don't understand."); //default incase you spam the keyboard
					
				}
				topche.close();
				inputfield();
			}
		}
		//no need for this after fixing irrTopic
		/***
		else {
			System.out.println("Sorry! My dino-speech is better than my english, did you want to talk about " + top + " ?"); //maybe you didn't mean to go here
		}
		
		topche.close();
		return false; //default case is to return false.
		***/
	}
	
}
