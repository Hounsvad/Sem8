package interactive_fiction.short_story;

import java.io.IOException;
import interactive_fiction.common.*;

class ScenarioSimple extends Scenario {
	
	public String interact() throws IOException {
		nextInteraction = "End";
		while(true){
			switch(nextInteraction){


			case "End":
				System.out.println("This is the ending for a very short story");
				return "End";
		
			}
		}
	}
}
