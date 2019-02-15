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
		Loadingscrean.main(args); 

		System.out.println("ROAr roar roooar roar rrrroooaaaarrr RoaaaaaaaaaaaaaaaAAArrArArAr");
		System.out.println("Welcome to the Dino-Bot, Please Enter the name you would like to be called by.");
		Scanner mainscan = new Scanner(System.in);
		name = mainscan.nextLine();
		System.out.println("Greetings " + name + ". My name is Tee-Tee the T-Rex!!");
		System.out.println("If you are curious type \"help\" to get a list of topics I will talk to you about!");
		//feel free to change later, just did this so i could access code from main area
		inputfield();
		mainscan.close();

		
	}
	
	public static void inputfield(){ //input method. Subject to change like crazy
		Scanner inscan = new Scanner(System.in);
		String startoption;
		
		//checking what they are talking about.
		boolean continueConv;
		do {
			startoption = (inscan.nextLine()).toLowerCase(); //scanning an input
			continueConv = conversation(startoption);
		}while(continueConv!=false);
		if (continueConv == false) {
			System.exit(0);
		}
		//roar else
		
	}
	
	public static boolean conversation(String userIn) {
		checktopic(userIn); // - keep checktopic for roar contest

		try {
			return irrTopic.checkRelavancy(userIn);
			
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | ClassNotFoundException | InstantiationException e) {
			// TODO Auto-generated catch block
			System.out.println("Sorry! There seems to be an issue.");
			System.out.println("Please restart the program.");
			return false;
		}
	}
	
	public static String thinking(){ //prints a line of dots after 1.5 seconds to mimic thinking animation
		long curtime = System.currentTimeMillis();
		
		long waittime1 = curtime + 1000;
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
		else if(top.equals("help")) {
			helpMe();
			inputfield();
		}
		else if(top.equals("about")) {
			aboutMe();
			inputfield();
		}
		//swear filter
		else if(top.contains("fuck") || top.contains("bitch") || top.contains("shit") || top.contains("ass") || top.contains("fucking") || top.contains("motherfucker") || top.contains("damn")){
			System.out.println("Please do not swear at me!");
			thinking();
			thinking(); //just giving spacing
			System.out.println("If you are going to be rude this conversation is over!");
			thinking();
			thinking();//more spacing
			thinking();
			System.exit(0); //closing the program forcibly
		}
	}
	
	//helpMe prompts user with list of topics the bot is able to talk about.
	public static void helpMe() {
		System.out.println("Curious to know what I can talk about? Have a list"); //prints list of topics
		System.out.println(thinking());	  //************************************************
		System.out.println(thinking());   //*ISSUE WITH THINKING METHOD OMITTED FOR TESTING*
		System.out.println(thinking());   //************************************************
		System.out.println("..........."); //spacer
		System.out.println("We can test how well your roar is!");			 	//Prompts roar contest
		System.out.println("Or we can talk about food");						//Prompts food topic
		System.out.println("We can discuss my rock collection!");				//Prompts collection topic
		System.out.println("How about talking about Lord of The Rings?");		//Prompts Lord of The Rings topic
		System.out.println("Or if you want to get to know me thats fine too!");	//Prompts general qna
		System.out.println(thinking());
		
	}
	
	public static void aboutMe() {
		System.out.println("My name is Tee-Tee and I am a Java jar program,");
		System.out.println("coded by Eric, Noah, Yue, Aidan and Kathryn - for their COSC 310 Assignment.");
		System.out.println("They hope you'll get the full experience of talking to an old dinosaur like me!");
	}
	
}
