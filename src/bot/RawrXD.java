package bot;

import java.util.Scanner;

public class RawrXD extends chatBot{

	public static void main(String[] args) { //roar game class
		Scanner roar = new Scanner(System.in);
		System.out.println("So, " + name + " do you really think you can out Roar me!"); //dialogue
		System.out.println("Well Challenge accepted! Goodluck!");
		String yourroar = roar.nextLine();
		
		int size = yourroar.length();
		if ((size >= 0) && (size < 10)){
			System.out.println("I'm sorry, I couldn't hear you. Please don't mumble. What do you say? Try again?");
			cont();
		}
		else if ((size >= 10) && (size < 20)){
			System.out.println("Oh you actually know how to talk. Not good enough, Try again?");
			cont();
		}
		else if ((size >= 20) && (size < 30)){
			System.out.println("Oh you actually know how to talk. Not good enough, Try again?");
			cont();
		}
		else if ((size >= 30) && (size < 40)){
			System.out.println("Oh you actually know how to talk. Not good enough, Try again?");
			cont();
		}
		else if ((size >= 40) && (size < 50)){
			System.out.println("Oh you actually know how to talk. Not good enough, Try again?");
			cont();
		}
		else if ((size >= 50) && (size < 60)){
			System.out.println("Oh you actually know how to talk. Not good enough, Try again?");
			cont();
		}
		else if ((size >= 60) && (size < 70)){
			System.out.println("Oh you actually know how to talk. Not good enough, Try again?");
			cont();
		}
		else if ((size >= 70) && (size < 80)){
			System.out.println("Oh you actually know how to talk. Not good enough, Try again?");
			cont();
		}
		else if ((size >= 80) && (size < 90)){
			System.out.println("Oh you actually know how to talk. Not good enough, Try again?");
			cont();
		}
		else if ((size >= 90) && (size < 100)){
			System.out.println("Oh you actually know how to talk. Not good enough, Try again?");
			cont();
		}
		else if ((size >= 100) && (size < 125)){
			System.out.println("You're almost there! just try a little bit harder okay!");
			cont();
		}
		else if ((size >= 125) && (size < 256)){
			System.out.println("Now THAT was a Roar, Excellent Job! Do you still want to roar with me?");
			cont();
		}
		else if (size >= 256){
			System.out.println("Y-y-you don't have to shout at me o-okay!"); //an easter egg
			cont();
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		roar.close();
		chatBot.inputfield();
	}
	public static void cont(){
		Scanner quitormiss = new Scanner(System.in);
		String choice = quitormiss.nextLine();
		
		
		
		quitormiss.close();
	}

}
