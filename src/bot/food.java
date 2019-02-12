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
