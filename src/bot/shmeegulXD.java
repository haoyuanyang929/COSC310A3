package bot;

import java.util.Scanner;

public class shmeegulXD implements TopicQuestions {
static int shmeegultest;
	public void runTopic(String input)  {
		Scanner mainshmeegul = new Scanner(System.in);
		String usershmeegul = input;
		
		//saying lotr is good
		if(usershmeegul.contains("like") || usershmeegul.contains("love") && usershmeegul.contains("lotr") || usershmeegul.contains("lord") && usershmeegul.contains("of") && usershmeegul.contains("the") && usershmeegul.contains("rings") || usershmeegul.contains("shmeegul")){
			System.out.println("Lord of the Rings is great! Who is your favorite character?");
			String charfav = (mainshmeegul.nextLine()).toLowerCase();
			favoritechar(charfav);
		}
		//asking why he likes lotr
		else if(usershmeegul.contains("why") && ((usershmeegul.contains("like")) || usershmeegul.contains("love"))) {
			shmeegultest = (int)(Math.random()*2);
			if(shmeegultest == 1)
				System.out.println("Because tolkien is a master mind!");
			else
				System.out.println("Because everyone is so tough");
		}
		//ask how he started lotr
		else if(usershmeegul.contains("how")) {
			shmeegultest = 2;
			if(shmeegultest == 0)
				System.out.println("I found the audio books in a pterodactyl nest");
			else if(shmeegultest == 1)
				System.out.println("Hunting Birds!");
			else if(shmeegultest == 2)
				System.out.println("I climbed a tree and found them all.");
			else 
				System.out.println("I dont know. HMMMMM!");
		}
		//checking when he began
		else if(usershmeegul.contains("when")) {
			shmeegultest = (int)(Math.random()*3);
			if(shmeegultest == 0)
				System.out.println("Musta been about a decade now. time flies");
			else
				System.out.println("Wow its been ten years");
		}
		//checking least favorite character
		else if((usershmeegul.contains("what")) && (usershmeegul.contains("least")) && usershmeegul.contains("favorite") && (usershmeegul.contains("character") || usershmeegul.contains("characters"))){
			shmeegultest = (int)(Math.random()*2);
			if(shmeegultest == 0)
				System.out.println("Definately wormtongue. Hes the worst roar!");
			else
				System.out.println("Cant think of any. Wait! I HATE wormtongue");
		}
		//checking favorite COUNTRY
		else if((usershmeegul.contains("what")) && usershmeegul.contains("favorite") && (usershmeegul.contains("location") || usershmeegul.contains("country"))){
			System.out.println("Definately Mordor! Sauron lives their!");
		}
		//favorite character
		else if((usershmeegul.contains("what")) && usershmeegul.contains("favorite") && (usershmeegul.contains("character") || usershmeegul.contains("characters"))){
			System.out.println("Sauron because hes tougher than a t-rex");
		} 
		//asking what he would do with the ring
		else if(usershmeegul.contains("you") && ((usershmeegul.contains("do") && (usershmeegul.contains("ring"))))){
			shmeegultest = (int)(Math.random()*2);
			if(shmeegultest == 0)
				System.out.println("Use it to collect more stuff of course");
			else
				System.out.println("be the toughest dino!");
		}
				
		//asking what
		else if(usershmeegul.contains("what")) {
			shmeegultest = (int) (Math.random()*3);
			if(shmeegultest == 0) { //multiple random for different responses for generic what
				System.out.println("Shelob is scary");
			}
			else if (shmeegultest == 1){
				System.out.println("I bet orcs are tasty");	
			}
			else {
				System.out.println("I could beat the balrog in an arm wrestle");
			}
		}
		//saying wormtongue
		else if(usershmeegul.contains("wormtongue")) {
			shmeegultest = (int) (Math.random()*5);
			if(shmeegultest == 0) {
				System.out.println("what a bad dude. rawrXD");
			}
			else {
				System.out.println("Dont like that one. hes a bad egg");
			}
		}
		//asking if he likes the movies
		else if(usershmeegul.contains("movies")) {
			shmeegultest = (int) (Math.random()*4);
			if(shmeegultest == 0) {
				System.out.println("UGH!");
			}
			else if(shmeegultest == 1) {
				System.out.println("HATE those. read the books");
			}
			else if(shmeegultest == 2) {
				System.out.println("those are the worst");
			}
			else {
				System.out.println("NO I WONT HEAR IT");
			}
			mainshmeegul.close();
		  }
		return;
	  }
	
	
	
	public static void favoritechar(String fav) { //checks to see if the chatbot knows your character
		Scanner secondshmeegul = new Scanner(System.in);
		String useryshmeegul = secondshmeegul.nextLine();
		switch (fav) {
		case "aragorn":
			System.out.println("Your favorite character is " + fav + " ? Do you want to hear about gondor?");
			if(useryshmeegul.contains("yes")) {
				System.out.println("Gondor is the home of man. Its a good place to get a bite to eat. RAWR!");
			}
			else
				System.out.println("ok");
			break;
		case "gimli":
			System.out.println("Your favorite character is " + fav + " ? Do you want to hear about moria?");
			if(useryshmeegul.contains("yes")) {
				System.out.println("Moria is a dwarven mining city destroyed by the balrog");
			}
			else
				System.out.println("ok");
			break;
		case "legolas":
			System.out.println("Your favorite character is " + fav + " ? Do you want to hear about rivendell?");
			if(useryshmeegul.contains("yes")) {
				System.out.println("Rivendell is that place with the guy from the matrix");
			}
			break;
		case "frodo":
			System.out.println("Your favorite character is " + fav + " ? Do you want to hear about the shire?");
			if(useryshmeegul.contains("yes")) {
				System.out.println("The shire is the wonderful home of hobbits");
			}
			break;
		case "bilbo":
			System.out.println("Your favorite character is " + fav + " ? Do you want to hear about the shire?");
			if(useryshmeegul.contains("yes")) {
				System.out.println("The shire is the wonderful home of hobbits");
			}
			break;
		case "sam":
			System.out.println("Your favorite character is " + fav + " ? Do you want to hear about the shire?");
			if(useryshmeegul.contains("yes")) {
				System.out.println("The shire is the wonderful home of hobbits");
			}
			break;
		case "merry":
			System.out.println("Your favorite character is " + fav + " ? Do you want to hear about the shire?");
			if(useryshmeegul.contains("yes")) {
				System.out.println("The shire is the wonderful home of hobbits");
			}
			break;
		case "pippin":
			System.out.println("Your favorite character is " + fav + " ? Do you want to hear about the shire?");
			if(useryshmeegul.contains("yes")) {
				System.out.println("The shire is the wonderful home of hobbits");
			}
			break;
		case "gandalf":
			System.out.println("Your favorite character is " + fav + " ? Do you want to hear about the shire?");
			if(useryshmeegul.contains("yes")) {
				System.out.println("The shire is the wonderful home of hobbits");
			}
			break;
		case "sauroman":
			System.out.println("Your favorite character is " + fav + " ? Do you want to hear about isengard");
			if(useryshmeegul.contains("yes")) {
				System.out.println("Isengard is sauromans home but hew wrecked the place");
			}
			break;
		case "sauron":
			System.out.println("Your favorite character is " + fav + " ? Do you want to hear about mordor?");
			if(useryshmeegul.contains("yes")) {
				System.out.println("Mordor is saurons home. great place");
			}
			break;
		case "smeagul":
			System.out.println("Your favorite character is " + fav + " ? I dont like him");
			break;
		case "shmeegul":
			System.out.println("Your favorite character is " + fav + " ? REEEEEEEEEEEEEEEE!");
			break;
		default:
			System.out.println("I don't think I know who that is.");
		}
		return;
	}



	@Override
	public void whoQuestion(String input) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void whatQuestion(String input) {
		// TODO Auto-generated method stub
		
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


