package bot;

public interface TopicQuestions {
	public abstract void runTopic(String input);
	/***
	runTopic should will take in the String input,
	which will be the words /who / what/ where / when / why / how
	and run the respective question method
	**/
	
	public void whoQuestion();
	public void whatQuestion();
	public void whereQuestion();
	public void whenQuestion();
	public void whyQuestion();
	public void howQuestion();
	
}
