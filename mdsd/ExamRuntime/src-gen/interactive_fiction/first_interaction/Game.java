package interactive_fiction.first_interaction;

import java.io.IOException;
import interactive_fiction.common.*;

public class Game{
	public Scenario start;
	
	public Game(){
		this.start = new ScenarioAlternatePaths();
	}
	
	public void play() throws IOException {
		start.interact();	
	}
}
