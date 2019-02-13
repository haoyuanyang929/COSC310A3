package bot;

import java.util.Scanner;

   public class lotr extends chatBot{
	   static boolean hobbit;//used for conversation
	   static boolean wizard;
	   static boolean aragorn;
	   static boolean helpers;
	   static boolean sauron;
	public static void startconv() { 
		System.out.println("Lord of the Rings is great! Who is your favorite character?");
		Scanner lscan = new Scanner(System.in);
		String yourfavorite = lscan.nextLine();
		String[] namecheck = yourfavorite.split("\\s+"); 
		if (namecheck.length > 1) { 
			for(int i = 0; i < namecheck.length; i++) {
				switch(namecheck[i]) { 
				case "quit":	case "stop":	case "end": 	case "leave":	case "cease":
					System.out.println("Well too bad. Maybe Later?");
					chatBot.inputfield();
					break;
				default: 
					break;
				}
			}
		  nochar();
		}
		else if (namecheck.length == 0) {
			System.out.println("Speak up please!");
			startconv();
		}
		else {
			switch (yourfavorite) {
			case "quit":	case "stop":	case "end": 	case "leave":	case "cease":
				System.out.println("Well too bad. Maybe Later?");
				chatBot.inputfield();
			switch (yourfavorite) {
			case "Frodo":	case "Sam":	case "Pippin": 	case "Merry":	case "Bilbo":
				System.out.println("Hobbits are very cool.");
				hobbit = true;
			switch (yourfavorite) {
			case "Gandalf":	case "Sauroman":
				System.out.println("Wizards are very cool.");
				wizard = true;
			switch (yourfavorite) {
			case "Aragorn":
				System.out.println("Hes the best because hes the king. RAWR!");
				aragorn = true;
			switch (yourfavorite) {
			case "Gimli":	case "Legolas":
				System.out.println("Oh those guys just help Aragorn. Not as cool");
				helpers = true;
			switch (yourfavorite) {
		    case "Sauron":
			    System.out.println("Sauron is the very best because hes tougher than a t-rex. RAAAAAWWWR!");
				sauron = true;
			break;	
			default:
				chartalk();
			}
		   }
		lscan.close();
	     }
	    }
	   }
	  }
	 }
	}
	public static void nochar() {
		System.out.println("WOAH WOAH WOAH THATS NOT A CHARACTER!");
		startconv();
     } 
    public static void chartalk() {
		if(hobbit = true) {
			System.out.println("Hobbits are very dependable and surprising little guys. They beat Sauron and he could eat a t-rex!");
			System.out.println("Wanna hear about the shire?");
			Scanner tscan = new Scanner(System.in);
			String youra = tscan.nextLine();
			String[] acheck = youra.split("\\s+");
			if (acheck.length > 1) { 
				for(int i = 0; i < acheck.length; i++) {
					switch(acheck[i]) { 
					case "quit":	case "stop":	case "end": 	case "leave":	case "cease":
						System.out.println("Well too bad. Maybe Later?");
						chatBot.inputfield();
						break;
					default: 
						break;
					}
	
			}
		  nochar();
		}
		else if (acheck.length == 0) {
			System.out.println("Speak up please!");
			chartalk();
		}
		else {
			switch (youra) {
			case "yes":
				System.out.println("The shire is a wonderful place full of hobbits and relaxation.");
			switch (youra) {
			case "no":
				System.out.println("oh to bad.");
				tscan.close();
	  }
	}
  }
}
		else if(wizard = true) {
			System.out.println("I dont trust wizards. Not after sauroman betrayed everybody. But gandalf is a cool cool guy.");
			System.out.println("Wanna hear about the shire or isengard?");
			Scanner tscan = new Scanner(System.in);
			String youra = tscan.nextLine();
			String[] acheck = youra.split("\\s+");
			if (acheck.length > 1) { 
				for(int i = 0; i < acheck.length; i++) {
					switch(acheck[i]) { 
					case "quit":	case "stop":	case "end": 	case "leave":	case "cease":
						System.out.println("Well too bad. Maybe Later?");
						chatBot.inputfield();
						break;
					default: 
						break;
					}
	
			}
		  nochar();
		}
		else if (acheck.length == 0) {
			System.out.println("Speak up please!");
			chartalk();
		}
		else {
			switch (youra) {
			case "shire":
				System.out.println("The shire is a wonderful place full of hobbits and relaxation.");
			switch (youra) {
			case "no":
				System.out.println("oh to bad.");
				
			switch (youra) {
			case "isengard":
				System.out.println("isengard is sauromans home. it was once beautiful till he burned it down. silly guy.");
			default:
			tscan.close();
		}
	  }
	}
  }
}
		else if(aragorn = true) {
			System.out.println("This guy is unbelievable! He's almost tougher than a t-rex.");
			System.out.println("Wanna hear about Gondor?");
			Scanner tscan = new Scanner(System.in);
			String youra = tscan.nextLine();
			String[] acheck = youra.split("\\s+");
			if (acheck.length > 1) { 
				for(int i = 0; i < acheck.length; i++) {
					switch(acheck[i]) { 
					case "quit":	case "stop":	case "end": 	case "leave":	case "cease":
						System.out.println("Well too bad. Maybe Later?");
						chatBot.inputfield();
						break;
					default: 
						break;
					}
	
			}
		  nochar();
		}
		else if (acheck.length == 0) {
			System.out.println("Speak up please!");
			chartalk();
		}
		else {
			switch (youra) {
			case "yes":
				System.out.println("Gondor is the home of man. Its a good place to get a bite to eat. RAWR!");
			switch (youra) {
			case "no":
				System.out.println("oh to bad.");
				tscan.close();
	  }
	}
  }
}

		else if(helpers = true) {
			System.out.println("Both legolas and gimli are lame. Dinoasurs are way tougher.");
			System.out.println("Wanna hear about moria or rivendell?");
			Scanner tscan = new Scanner(System.in);
			String youra = tscan.nextLine();
			String[] acheck = youra.split("\\s+");
			if (acheck.length > 1) { 
				for(int i = 0; i < acheck.length; i++) {
					switch(acheck[i]) { 
					case "quit":	case "stop":	case "end": 	case "leave":	case "cease":
						System.out.println("Well too bad. Maybe Later?");
						chatBot.inputfield();
						break;
					default: 
						break;
					}
	
			}
		  nochar();
		}
		else if (acheck.length == 0) {
			System.out.println("Speak up please!");
			chartalk();
		}
		else {
			switch (youra) {
			case "rivendell":
				System.out.println("The elven city ruled by elrond, the guy from the matrix.");
			switch (youra) {
			case "moria":
				System.out.println("a mining capital of the dwarves that was destroyed by the balrog.");
			switch (youra) {
			case "no":
				System.out.println("oh to bad.");
				tscan.close();
	  }
	}
  }
}
		}
		else {
			System.out.println("My all time favorite character from anything. Tougher than any dinosaur even me!");
			System.out.println("Wanna hear about mordor?");
			Scanner tscan = new Scanner(System.in);
			String youra = tscan.nextLine();
			String[] acheck = youra.split("\\s+");
			if (acheck.length > 1) { 
				for(int i = 0; i < acheck.length; i++) {
					switch(acheck[i]) { 
					case "quit":	case "stop":	case "end": 	case "leave":	case "cease":
						System.out.println("Well too bad. Maybe Later?");
						chatBot.inputfield();
						break;
					default: 
						break;
					}
	
			}
		  nochar();
		}
		else if (acheck.length == 0) {
			System.out.println("Speak up please!");
			chartalk();
		}
		else {
			switch (youra) {
			case "yes":
				System.out.println("Mordor is the land of sauron and orcs. My ultimate dream vacation.");
			switch (youra) {
			case "no":
				System.out.println("oh to bad.");
				tscan.close();
	  }
	}
  }
			System.out.println("Wanna talk more?");
			Scanner bscan = new Scanner(System.in);
			String yourb = bscan.nextLine();
			String[] bcheck = yourb.split("\\s+");
			if (bcheck.length > 1) { 
				for(int i = 0; i < bcheck.length; i++) {
					switch(acheck[i]) { 
					case "quit":	case "stop":	case "end": 	case "leave":	case "cease":
						System.out.println("Well too bad. Maybe Later?");
						chatBot.inputfield();
						break;
					default: 
						break;
					}
	
			}
		  nochar();
		}
		else if (bcheck.length == 0) {
			System.out.println("Speak up please!");
			chatBot.inputfield();
		}
		else {
			switch (yourb) {
			case "yes":
				System.out.println("YAY RAWR YAY");
				startconv();
			switch (yourb) {
			case "no":
				System.out.println("oh to bad.");
				bscan.close();
				chatBot.inputfield();
 }
 }
 }
 }
 }
 }
   
 
