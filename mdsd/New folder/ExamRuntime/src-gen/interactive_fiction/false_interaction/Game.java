package interactive_fiction.false_interaction;

import java.io.IOException;
import interactive_fiction.common.*;

public class Game{
	public Scenario start;
	
	public Game(){
		this.start = new ScenarioFreewill();
	}
	
	public void play() throws IOException {
		start.interact();	
	}
}
