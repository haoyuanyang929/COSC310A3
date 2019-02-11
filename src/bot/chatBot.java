package bot;
import java.util.Scanner;
public class chatBot {

	static String name; 
	static String checkstring;
	public static void main(String args[]) {
		//added a cute little printing thing. lemme know thoughts. keep it until we get GUI
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
		Scanner inscan = new Scanner(System.in);
		String startoption;
		System.out.println("..........."); //spacer
		System.out.println("Curious to know what I can talk about? Have a list"); //prints list of topics
		System.out.println(thinking());	  //************************************************
		System.out.println(thinking());   //*ISSUE WITH THINKING METHOD OMITTED FOR TESTING*
		System.out.println(thinking());   //************************************************
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
		
		
		startoption = (inscan.nextLine()).toLowerCase(); //scanning an input
		//roar else
		if(startoption.contains("roar")) { //if it contains roar jump to roar file
			boolean grab = checktopic("roar"); //checking topic for user confirmation
			if(grab == true) {
				System.out.println("roar accepted");
				RawrXD.main(null); //if user says yes it goes to collection topic
			}
			else {
				System.out.println("roar denied");
				inputfield(); //if user say no it goes back to input
			}
		}
		//collection else if it contains collection go here
		else if(startoption.contains("collection")) {
			boolean grab = checktopic("Collections"); //checking topic for user confirmation
			if(grab == true) {
				Collectiontopic.main(null); //if user says yes it goes to collection topic
			}
			else {
				inputfield(); //if user say no it goes back to input
			}
		}
		//Food else
		else if(startoption.contains("food")) { //if someone says food
			boolean grab = checktopic("Food"); //goes to checktopic to check if you want to talk food
			if(grab == true) {
				System.out.println("food accepted"); //food accepted go to food class
				
			}
			else {
				System.out.println("Food denied"); //denied go back to input
				inputfield();
			}
		}
		else if(startoption.contains("quit") || startoption.contains("leave") || startoption.contains("stop")) {
			System.out.println("Thank you so much for talking to me! Have a good day!");
			System.exit(0);
		}
		//if it doesn't understand
		else {
		System.out.println("Sorry I don't understand that."); //nothing useful in the phrase
		inputfield(); //go back to input and try again
		}
	}
	
	public static String thinking(){ //prints a line of dots after 1.5 seconds to mimic thinking animation
		long curtime = System.currentTimeMillis();
		long waittime1 = curtime + 150;
		while (curtime != waittime1){				//************************************************
			 curtime = System.currentTimeMillis();  //*ISSUE WITH THINKING METHOD OMITTED FOR TESTING*
		}                                           //************************************************
		 return "............";

	}
	//CHECKING THE TOPIC
	public static boolean checktopic(String top) { //grabs the topic, to save space this is used fo most topics
		Scanner topche = new Scanner(System.in);
		if(top.equals("roar")) {
			System.out.println("Sorry! My dino-speech is better than my english, did you want to have a roaring contest?"); //maybe you didn't mean to go here
		}
		else {
			System.out.println("Sorry! My dino-speech is better than my english, did you want to talk about " + top + " ?"); //maybe you didn't mean to go here
		}
		String topicyesno = (topche.nextLine()).toLowerCase();
		String[] topicsentence = topicyesno.split(" "); //splitting it up
		for(int i = 0; i < topicsentence.length; i++){ //
			String topgrabbed = topicsentence[i];
			switch(topgrabbed){ //switch parsing string to see what happens
			
			case "yes": case "yup": case "okay": case "sure": case "ok":
				return true; //returns true to where it was called
				
			case "no": case "nope": case "nah": case "never":
				System.out.println("No? Okay then.");
				return false; //returns false to where it was called.
				
			default:
				System.out.println("I still don't understand."); //default incase you spam the keyboard
				
			}
		}
		topche.close();
		return false; //default case is to return false.
	}
	
}
