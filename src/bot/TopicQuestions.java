package bot;

public interface TopicQuestions {
	public abstract void runTopic(String input);
	/***
	runTopic should will take in the String input,
	which will be the words /who / what/ where / when / why / how
	and run the respective question method
	**/
	
	public void whoQuestion(String input);
	public void whatQuestion(String input);
	public void whereQuestion(String input);
	public void whenQuestion(String input);
	public void whyQuestion(String input);
	public void howQuestion(String input);
	
}
