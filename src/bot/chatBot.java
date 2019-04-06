package bot;
import java.lang.reflect.*;
import java.util.Scanner;
public class chatBot {

	static String name; 
	static String checkstring;
	public static IrrelavantTopic irrTopic;
	
	public static void main(String args[]) {
		irrTopic = new IrrelavantTopic();
		Loadingscrean.main(args); 

		System.out.println("ROAr roar roooar roar rrrroooaaaarrr RoaaaaaaaaaaaaaaaAAArrArArAr");
		System.out.println("Welcome to the Dino-Bot, Please Enter the name you would like to be called by.");
		Scanner mainscan = new Scanner(System.in);
		name = mainscan.nextLine();
		System.out.println("Greetings " + name + ". My name is Tee-Tee the T-Rex!!");
		System.out.println("If you are curious type \"help\" to get a list of topics I will talk to you about!");
		//feel free to change later, just did this so i could access code from main area
		inputfield(GUI.userInput);
		mainscan.close();

		
	}
	
	public static void inputfield(String fromBTN) { //input method. Subject to change like crazy
		irrTopic = new IrrelavantTopic();
		//Scanner inscan = new Scanner(System.in);
		String startoption = fromBTN;
		
		//checking what they are talking about.
		boolean continueConv;
		//do {
			//startoption = (inscan.nextLine()).toLowerCase(); //scanning an input
			continueConv = conversation(startoption);
		//}while(continueConv!=false);
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
			GUI.textArea.append("Sorry! There seems to be an issue.");
			System.out.println("Sorry! There seems to be an issue.");
			GUI.textArea.append("Please restart the program.");
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
			GUI.textArea.append("Sorry! My dino-speech is better than my english, did you want to have a roaring contest?");
			System.out.println("Sorry! My dino-speech is better than my english, did you want to have a roaring contest?"); //maybe you didn't mean to go here
			
			String topicyesno = (topche.nextLine()).toLowerCase();
			String[] topicsentence = topicyesno.split(" "); //splitting it up
			for(int i = 0; i < topicsentence.length; i++){ //
				String topgrabbed = topicsentence[i];
				switch(topgrabbed){ //switch parsing string to see what happens
				
				case "yes": case "yup": case "okay": case "sure": case "ok": case "ye": case "yeah":
					RawrXD.main(null); // plays roaring contest
				case "no": case "nope": case "nah": case "never":
					System.out.println("No? Okay then.");
					inputfield(GUI.userInput); //returns false to where it was called.
					
				default:
					GUI.textArea.append("I still don't understand.");
					System.out.println("I still don't understand."); //default incase you spam the keyboard
					
				}
				topche.close();
				inputfield(GUI.userInput);
			}
		}
		else if(top.equals("help")) {
			helpMe();
			inputfield(GUI.userInput);
		}
		else if(top.equals("about")) {
			aboutMe();
			inputfield(GUI.userInput);
		}
		//swear filter
		else if(top.contains("fuck") || top.contains("bitch") || top.contains("shit") || top.contains("ass") || top.contains("fucking") || top.contains("motherfucker") || top.contains("damn")){
			System.out.println("Please do not swear at me!");
			GUI.textArea.append("Please do not swear at me!");
			thinking();
			thinking(); //just giving spacing
			System.out.println("If you are going to be rude this conversation is over!");
			GUI.textArea.append("If you are going to be rude this conversation is over!");
			thinking();
			thinking();//more spacing
			thinking();
			System.exit(0); //closing the program forcibly
		}
	}
	
	//helpMe prompts user with list of topics the bot is able to talk about.
	public static void helpMe() {
		System.out.println("Curious to know what I can talk about? Have a list"); //prints list of topics
		GUI.textArea.append("Curious to know what I can talk about? Have a list");
		System.out.println(thinking());	  //************************************************
		GUI.textArea.append(thinking());
		System.out.println(thinking());   //*ISSUE WITH THINKING METHOD OMITTED FOR TESTING*
		GUI.textArea.append(thinking());
		System.out.println(thinking());   //************************************************
		GUI.textArea.append(thinking());
		System.out.println("..........."); //spacer
		GUI.textArea.append("...........");
		System.out.println("We can test how well your roar is!");			 	//Prompts roar contest
		GUI.textArea.append("We can test how well your roar is!");
		System.out.println("Or we can talk about food");						//Prompts food topic
		GUI.textArea.append("Or we can talk about food");
		System.out.println("We can discuss my rock collection!");				//Prompts collection topic
		GUI.textArea.append("We can discuss my rock collection!");
		System.out.println("How about talking about Lord of The Rings?");		//Prompts Lord of The Rings topic
		GUI.textArea.append("How about talking about Lord of The Rings?");
		System.out.println("Or if you want to get to know me thats fine too!");	//Prompts general qna
		GUI.textArea.append("Or if you want to get to know me thats fine too!");
		System.out.println(thinking());
		GUI.textArea.append(thinking());
	}
	
	public static void aboutMe() {
		System.out.println("My name is Tee-Tee and I am a Java jar program,");
		GUI.textArea.append("My name is Tee-Tee and I am a Java jar program,");
		System.out.println("coded by Eric, Noah, Yue, Aidan and Kathryn - for their COSC 310 Assignment.");
		GUI.textArea.append("coded by Eric, Noah, Yue, Aidan and Kathryn - for their COSC 310 Assignment.");
		System.out.println("They hope you'll get the full experience of talking to an old dinosaur like me!");
		GUI.textArea.append("They hope you'll get the full experience of talking to an old dinosaur like me!");
	}
	
	//Below are all for GUI
	public static String welcome() {
		String welcome = "ROAr roar roooar roar rrrroooaaaarrr RoaaaaaaaaaaaaaaaAAArrArArAr! \nWelcome to the Dino-Bot, Please Enter the name you would like to be called by. \n";
		return welcome;
	}
	
	public static String printTextInput() {
		String text = GUI.userInput + "\n";
		return text;
	}
	
}
