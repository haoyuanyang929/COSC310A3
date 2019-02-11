package bot;

public class MeandYouEric implements TopicQuestions {
	
	String[] who = {"I am a dinosaur.", "I am Tee-Tee.", "I am a T-rex. You can call me Tee-Tee.", "I am a ancient giant chicken.", "You are my lunch.", "You are a human and also my lunch.", "You are " /*user name*/}; 
	String[] what = {"I am a dinosaur.", "I am Tee-Tee.", "I am a T-rex. You can call me Tee-Tee.", "I am a ancient giant chicken.", "I can eat, eat, and… Talk to you.", "I like food and other things."};
	String[] when = {"During luchtime", "Durig dinner time.", "Perhaps during breakfest time.", "Two days ago.", "It’s Triassic Period.","It's "/*today date*/, "It's " /*today's day*/, "250 million years later."};
	String[] where = {"You are at my place.", "You are in my stomach.", "You are in the midddle of a big continent."};
	String[] how = {"I am starving", "I am good.", "How rude! I am 35 years old", "My age is a secret.", "I am 40 ft tall.", "I am 12.3 meters tall.", "He died from a fireball from the sky."};
	String[] why = {"I have no idea.", "Because I am hungry.","Because you look delicious and juicy.","Because I am adorable.","Because I am a hardworking, and talented T-rex.","Because you are here." ,"Because… Because… Because…. What did you ask me again?",	"Because I am a dinosaur."};
	
	
	@Override
	public void whoQuestion() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void whatQuestion() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void whereQuestion() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void whenQuestion() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void whyQuestion() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void howQuestion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void runTopic(String input) {
		// TODO Auto-generated method stub
		switch (input) {
			case "what": 
				whatQuestion();
				break;
			case "where":
				whereQuestion();
				break;
			case "when":
				whenQuestion();
				break;
			case "why":
				whyQuestion();
				break;
			case "how":
				howQuestion();
				break;	
		}
		
	}

}
