package interactive_fiction.first_interaction;

import java.io.IOException;
import interactive_fiction.common.*;

class ScenarioAlternatePaths extends Scenario {
public String interact() throws IOException {
	nextInteraction = "Start";
	while(true){
		switch(nextInteraction){
			

			case "Start":
				System.out.println("So, you really want to interact...");
				nextInteraction="S1";
				break;

			case "S1":
				System.out.println("This is interesting, so, tell me, is it fun to interact with me?");

					String __S1 = br.readLine();

						if(((__S1) == "yes")){
							nextInteraction="YesAnswer";
							break ;
						}

						if(((__S1) == "no")){
							nextInteraction="NoAnswer";
							break ;
						}

						nextInteraction="YesAnswer";
						break;

			case "YesAnswer":
				System.out.println("I am glad you find this fun. I do like to spend time here");
				nextInteraction="NumberQuestion";
				break;

			case "NoAnswer":
				System.out.println("Oh no, I am sorry you are stuck with me but believe me, it will get fun!");
				nextInteraction="NumberQuestion";
				break;

			case "NumberQuestion":
				System.out.println("Now, I really want to know your favorite number, which is?");

					try{		
						int __NumberQuestion = Integer.parseInt(br.readLine());

						if(((__NumberQuestion) > (0))){
							nextInteraction="PositiveAnswer";
							break ;
						}

						if(((__NumberQuestion) <= (0))){
							nextInteraction="NegativeAnswer";
							break ;
						}
		
}catch(Exception ex){
	break;
}

			case "PositiveAnswer":
				System.out.println("So we have a positive person here, good to know. I hope your next game will be as fun as this one");
				return "PositiveAnswer";

			case "NegativeAnswer":
				System.out.println("Really? Do you try to be smart, or do you really like a number like that? We are going to have so much fun from now on...");
				return "NegativeAnswer";

			case "WrongAnswerEnd":
				System.out.println("Oh, so you like to play outside the rules? Well, I do not like how you play...");
				return "WrongAnswerEnd";
		
			}
		}
	}
}
