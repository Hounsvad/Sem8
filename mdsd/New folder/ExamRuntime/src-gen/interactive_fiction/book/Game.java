package interactive_fiction.book;

import java.io.IOException;
import interactive_fiction.common.*;

public class Game{
	public Scenario start;
	
	public Game(){
		this.start = new ScenarioLinear();
	}
	
	public void play() throws IOException {
		start.interact();	
	}
}
