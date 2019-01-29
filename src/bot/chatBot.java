package bot;
import java.util.Scanner;
public class chatBot {
	public static void main(String args[]) {
		System.out.println("ROAr roar roooar roar rrrroooaaaarrr RoaaaaaaaaaaaaaaaAAArrArArAr");
		System.out.println("(Welcome to the Dino-Bot, Please Enter the name you would like to be called by.)");
		Scanner namegrab = new Scanner(System.in);
		String name = namegrab.nextLine();
		System.out.println("Rouarar " + name);
		System.out.println("(Greetings " + name + ")");
		namegrab.close();
	}
	
}
