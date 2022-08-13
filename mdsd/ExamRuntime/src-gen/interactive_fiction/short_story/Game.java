package interactive_fiction.short_story;

import java.io.IOException;
import interactive_fiction.common.*;

public class Game{
	public Scenario start;
	
	;
	public Game(){
		this.start = new ScenarioSimple();
	}
	
	public void play() throws IOException {
		start.interact();	
	}
}
