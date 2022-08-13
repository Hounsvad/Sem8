package interactive_fiction.false_interaction;

import java.io.IOException;
import interactive_fiction.common.*;

class ScenarioFreewill extends Scenario {
public String interact() throws IOException {
	nextInteraction = "Start";
	while(true){
		switch(nextInteraction){
			

			case "Start":
				System.out.println("Now, I want you to 'interact'");
				nextInteraction="S1";
				break;

			case "S1":
				System.out.println("Please, just type anything you want");

					String __S1 = br.readLine();

						nextInteraction="S2";
						break;

			case "S2":
				System.out.println("Now, answer me, what is your favorite number?");

					try{		
						int __S2 = Integer.parseInt(br.readLine());

						nextInteraction="S3";
						break;
		
}catch(Exception ex){
	break;
}

			case "S3":
				System.out.println("Yes! Now you are interacting. This is fun! isn't it?");
				nextInteraction="S4";
				break;

			case "S4":
				System.out.println("Probably, that is not the best question... maybe you should ask yourself if it makes a story interactive if your questions are not going to be taken into consideration, what do you think?");

					String __S4 = br.readLine();

						nextInteraction="End";
						break;

			case "End":
				System.out.println("Yes, exactly... I think you are right. Or you may not. Who knows, I probably did not read your answer either");
				return "End";
		
			}
		}
	}
}
