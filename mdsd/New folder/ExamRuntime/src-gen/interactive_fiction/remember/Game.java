package interactive_fiction.remember;

import java.io.IOException;
import interactive_fiction.common.*;

public class Game{
	public Scenario start;
	
	public Game(){
		this.start = new ScenarioAskingData();
	}
	
	public void play() throws IOException {
		start.interact();	
	}
}
