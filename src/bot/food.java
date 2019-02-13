package bot;

public class food implements TopicQuestions {
	public static void main(String args[]) {
		String[] what = {"Meat, like human", "Human, just like you", "Bubble Tea", "It's a delisious drink."};
		String[] where = {"In my cave", "In Taiwan"};
		String[] who = {"Sometimes with myself", "Sometimes with other dinosaurs", "by myself", "The owner."};
		String[] how = {"four times", "It's so delicious", "By my hand", "It's a combination of tea and milk and tapioca balls.", "I like it half sweet."};
		String[] why = {"because it's so delicious"};
		String[] when = {};		
	}

	
	@Override
	public void runTopic(String input) {
		// TODO Auto-generated method stub
		switch (input) {
		case "what": 
			whatQuestion(input);
			break;
		case "where":
			whereQuestion(input);
			break;
		case "when":
			whenQuestion(input);
			break;
		case "why":
			whyQuestion(input);
			break;
		case "how":
			howQuestion(input);
			break;	
		}
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
