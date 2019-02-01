package bot;
import java.util.Scanner;
public class chatBot {
	static String name; 
	public static void main(String args[]) {
		//added a cute little printing thing. lemme know thoughts. keep it until we get GUI
		//Loadingscrean.main(args); BLOCKED LOADING SCREEN FOR QUICKER TESTING
		
		System.out.println("ROAr roar roooar roar rrrroooaaaarrr RoaaaaaaaaaaaaaaaAAArrArArAr");
		System.out.println("(Welcome to the Dino-Bot, Please Enter the name you would like to be called by.)");
		Scanner mainscan = new Scanner(System.in);
		name = mainscan.nextLine();
		System.out.println("Rouarar " + name);
		System.out.println("(Greetings " + name + ")");
		
		//feel free to change later, just did this so i could access code from main area
		inputfield();
		mainscan.close();

		
	}
	
	public static void inputfield(){ //input method. Subject to change like crazy
		Scanner inscan = new Scanner(System.in);
		System.out.println("What would you like to do?");
		String startoption = inscan.nextLine(); //scanning an input
		String[] optionpicked = startoption.split("\\s+"); //splitting it up
		for(int i = 0; i < optionpicked.length; i++ ){ //looking for roar or rawr
			if (optionpicked[i].equals("roar")){ //goes to roargame method
				roargame();
			}
			else if (optionpicked[i].equals("rawr")){ //goes to roargame method
				roargame();
			}
			else if (optionpicked[i].equals("what")) {
				System.out.println("Curious to know what I can do? Have a list"); //prints list of topics
				System.out.println(thinking());
				System.out.println(thinking());
				System.out.println(thinking());
				System.out.println("We can test how well your roar is!");
				System.out.println("Or we can talk about food");
				System.out.println("I know a decent amount about INSERT TOPIC 1");
				System.out.println("We can discuss INSERT TOPIC 2");
				System.out.println("How about talking about INSERT TOPIC 3");
				System.out.println("INSERT TOPIC 4 happens to be something that interests me");
				System.out.println("Or maybe you want to talk about INSERT TOPIC 5");
				System.out.println("Or if you want to get to know me thats fine too!");
				System.out.println(thinking());
				inputfield();

			}
			else{ //if neither roar nor rawr then ignore
				
			}
		}
		System.out.println("Sorry I don't understand that."); //nothing useful in the phrase
		inputfield(); //go back to input and try again
		inscan.close();
			
	}
	
	
	public static void roargame(){ //method that activated the roar game
		//calling the thinking method
		Scanner confrawr = new Scanner(System.in);
		System.out.println(thinking()); //these are making it look like it is thinking
		System.out.println(thinking());
		System.out.println(thinking());
		System.out.println(thinking());

		
		//rawr checking
		System.out.println("Sorry! My dino-speech is better than my english, did you want to have a roaring contest?"); //maybe you didn't mean to go here
		String rawryesno = confrawr.nextLine();
		String[] rawrpick = rawryesno.split(" "); //splitting it up
		for(int i = 0; i < rawrpick.length; i++ ){ //looking for roar or rawr
			String rawrgrabbed = rawrpick[i];
			switch(rawrgrabbed){ //switch parsing string to see what happens
			case "yes":
				RawrXD.main(null);
				break;
			case "yup":
				RawrXD.main(null);
				break;
			case "okay":
				RawrXD.main(null);
				break;
			case "sure":
				RawrXD.main(null);
				break;
			case "ok":
				RawrXD.main(null);
				break;
			case "no":
				System.out.println("No? Okay then.");
				inputfield();
				break;
			case "nope":
				System.out.println("No? Okay then.");
				inputfield();
				break;
			case "nah":
				System.out.println("No? Okay then.");
				inputfield();
				break;
			case "never":
				System.out.println("No? Okay then.");
				inputfield();
				break;
			default:
				System.out.println("I still don't understand."); //default incase you spam the keyboard
				inputfield();
				
			}
		}
		confrawr.close();
		//calling the roar method

	}

	public static String thinking(){ //prints a line of dots after 1.5 seconds to mimic thinking animation
		long curtime = System.currentTimeMillis();
		long waittime1 = System.currentTimeMillis() + 150;
		while (curtime != waittime1){
			 curtime = System.currentTimeMillis();
		}
		 return "............";

	}
	
	
}
