package interactive_fiction.remember;

import java.io.IOException;
import interactive_fiction.common.*;

class ScenarioAskingData extends Scenario {
	String name;
	int favNumber;
public String interact() throws IOException {
	nextInteraction = "Start";
	while(true){
		switch(nextInteraction){
			

			case "Start":
				System.out.println("I have a confession to make");
				nextInteraction="Confession";
				break;

			case "Confession":
				System.out.println("In our previous game, you chose your own path, but...");
				nextInteraction="Forget";
				break;

			case "Forget":
				System.out.println("But I totally forget your answers. I am sorry, my memory has never been so good");
				nextInteraction="Improving";
				break;

			case "Improving":
				System.out.println("I am trying to improve, I will do better, I promise!");
				nextInteraction="AskName";
				break;

			case "AskName":
				System.out.println("Look, I am going to prove it to you. Just let me know what your name is");

					name = br.readLine();

						nextInteraction="RepeatName";
						break;

			case "RepeatName":
				System.out.println("So, your name is "+name+". I told you I would remember it!");
				nextInteraction="AskNumber";
				break;

			case "AskNumber":
				System.out.println("Now, your favorite number is?");

					try{		
						favNumber = Integer.parseInt(br.readLine());

						if((favNumber == (0))){
							nextInteraction="NumberZero";
							break ;
						}

						if((favNumber < (0))){
							nextInteraction="NumberNegative";
							break ;
						}

						if((favNumber > (0))){
							nextInteraction="NumberPositive";
							break ;
						}
		
}catch(Exception ex){
	break;
}

			case "NumberZero":
				System.out.println("0... Zero... Nul... such a problematic number, but I will make this work... somehow");
				nextInteraction="MathOperation";
				break;

			case "NumberNegative":
				System.out.println("A negative person... do not worry, we still will have fun!");
				nextInteraction="MathOperation";
				break;

			case "NumberPositive":
				System.out.println("I like positive numbers too. I think they are so much fun, and I can think of so many ways to have fun");
				nextInteraction="MathOperation";
				break;

			case "MathOperation":
				System.out.println("I want to add a number to your favorite number. How much should we add to it?");

					try{		
						int __MathOperation = Integer.parseInt(br.readLine());

						if((((__MathOperation) + favNumber) > (100))){
							nextInteraction="BigNumber";
							break ;
						}

						if(((__MathOperation) > (0))){
							nextInteraction="PositiveAdd";
							break ;
						}

						nextInteraction="BigNumber";
						break;
		
}catch(Exception ex){
	break;
}

			case "BigNumber":
				System.out.println("We ended up with a very big number, eh? I like it. This will be my favorite number");
				nextInteraction="End";
				break;

			case "PositiveAdd":
				System.out.println("I kind of like this new number. I will make it my favorite number from now on");
				nextInteraction="End";
				break;

			case "NegativeAdd":
				System.out.println("Oh, we did not even get a positive number. Well, what can we do, right? Sometimes life does not give you what you want...");
				nextInteraction="End";
				break;

			case "End":
				System.out.println("This was so much fun, "+name+" (yes, I did this so you can know that I still remember your name). I hope we can play soon!");
				return "End";
		
			}
		}
	}
}
