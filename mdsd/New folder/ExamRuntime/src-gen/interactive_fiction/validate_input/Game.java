package interactive_fiction.validate_input;

import java.io.IOException;
import interactive_fiction.common.*;

public class Game{
	public Scenario start;
	
	;
	public Game(){
		this.start = new ScenarioValidation();
	}
	
	public void play() throws IOException {
		start.interact();	
	}
}
