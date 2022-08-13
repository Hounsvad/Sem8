package interactive_fiction.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import interactive_fiction.common.Scenario;

public class ExamTest {
	PrintStream out;
	PrintStream originalOut = System.out;
	ByteArrayOutputStream story;
	
	String lineSeparator = System.getProperty("line.separator");
	
	@BeforeEach
	public void changeStream() {
		
		//Output terminal
		story = new ByteArrayOutputStream();
		out = new PrintStream(story);
		System.setOut(out);
		
	}
	
	@AfterEach
	public void originalStream() {
		out.flush();
		System.setOut(originalOut);
	}
	
	@Test
	public void p1() throws IOException {
		
		new interactive_fiction.short_story.Game().play();
		Assertions.assertEquals("This is the ending for a very short story", story.toString().trim());
	}
	
	@Test
	public void p2() throws IOException {
				
		new interactive_fiction.book.Game().play();

		StringBuilder storyExpected = new StringBuilder();
		storyExpected.append("Some stories can be longer");storyExpected.append(lineSeparator);
		storyExpected.append("But that does not mean they would be better");storyExpected.append(lineSeparator);
		storyExpected.append("Our goal is for you to choose a path");storyExpected.append(lineSeparator);
		storyExpected.append("But here, there is no path...");storyExpected.append(lineSeparator);
		storyExpected.append("If no path can be chosen, can this still be called 'interactive'?");storyExpected.append(lineSeparator);
		storyExpected.append("Probably not, but then again, that does not mean this is a bad story");storyExpected.append(lineSeparator);
		storyExpected.append("You would not call a book 'bad' because you cannot choose how to read it, right?");

		Assertions.assertEquals(storyExpected.toString(), story.toString().trim());
	}
	
	@Test
	public void p3() throws IOException {
		StringBuilder input = new StringBuilder();
		input.append("Anything I want?");input.append(lineSeparator);
		input.append(42);input.append(lineSeparator);
		setUpInput(input);
				
		new interactive_fiction.false_interaction.Game().play();
		
		StringBuilder storyExpected = new StringBuilder();
		storyExpected.append("Now, I want you to 'interact'");storyExpected.append(lineSeparator);
		storyExpected.append("Please, just type anything you want");storyExpected.append(lineSeparator);
		storyExpected.append("Now, answer me, what is your favorite number?");storyExpected.append(lineSeparator);
		storyExpected.append("Yes! Now you are interacting. This is fun! isn't it?");storyExpected.append(lineSeparator);
		storyExpected.append("Probably, that is not the best question... maybe you should ask yourself if it makes a story interactive if your questions are not going to be taken into consideration, what do you think?");storyExpected.append(lineSeparator);
		storyExpected.append("Yes, exactly... I think you are right. Or you may not. Who knows, I probably did not read your answer either");

		Assertions.assertEquals(storyExpected.toString(), story.toString().trim());
	}

	@Test
	public void p4() throws IOException {
		StringBuilder input = new StringBuilder();
		input.append("yes");input.append(lineSeparator);
		input.append(42);input.append(lineSeparator);
		setUpInput(input);
				
		new interactive_fiction.first_interaction.Game().play();
		
		StringBuilder storyExpected = new StringBuilder();
		storyExpected.append("So, you really want to interact...");storyExpected.append(lineSeparator);
		storyExpected.append("This is interesting, so, tell me, is it fun to interact with me?");storyExpected.append(lineSeparator);
		storyExpected.append("I am glad you find this fun. I do like to spend time here");storyExpected.append(lineSeparator);
		storyExpected.append("Now, I really want to know your favorite number, which is?");storyExpected.append(lineSeparator);
		storyExpected.append("So we have a positive person here, good to know. I hope your next game will be as fun as this one");

		Assertions.assertEquals(storyExpected.toString(), story.toString().trim());
	}

	@Test
	public void p5() throws IOException {
		StringBuilder input = new StringBuilder();
		input.append("Matt");input.append(lineSeparator);
		input.append(42);input.append(lineSeparator);
		input.append(100);input.append(lineSeparator);
		setUpInput(input);
				
		new interactive_fiction.remember.Game().play();
		
		StringBuilder storyExpected = new StringBuilder();
		storyExpected.append("I have a confession to make");storyExpected.append(lineSeparator);
		storyExpected.append("In our previous game, you chose your own path, but...");storyExpected.append(lineSeparator);
		storyExpected.append("But I totally forget your answers. I am sorry, my memory has never been so good");storyExpected.append(lineSeparator);
		storyExpected.append("I am trying to improve, I will do better, I promise!");storyExpected.append(lineSeparator);
		storyExpected.append("Look, I am going to prove it to you. Just let me know what your name is");storyExpected.append(lineSeparator);
		storyExpected.append("So, your name is Matt. I told you I would remember it!");storyExpected.append(lineSeparator);
		storyExpected.append("Now, your favorite number is?");storyExpected.append(lineSeparator);
		storyExpected.append("I like positive numbers too. I think they are so much fun, and I can think of so many ways to have fun");storyExpected.append(lineSeparator);
		storyExpected.append("I want to add a number to your favorite number. How much should we add to it?");storyExpected.append(lineSeparator);
		storyExpected.append("We ended up with a very big number, eh? I like it. This will be my favorite number");storyExpected.append(lineSeparator);
		storyExpected.append("This was so much fun, Matt (yes, I did this so you can know that I still remember your name). I hope we can play soon!");

		Assertions.assertEquals(storyExpected.toString(), story.toString().trim());
	}
	
	@Test
	public void p6() throws IOException {
		StringBuilder input = new StringBuilder();
		input.append(42);input.append(lineSeparator);
		setUpInput(input);
				
		new interactive_fiction.validate_input.Game().play();
		
		StringBuilder storyExpected = new StringBuilder();
		storyExpected.append("Hi again! This is going to be a short game, as I am just testing something out");storyExpected.append(lineSeparator);
		storyExpected.append("I promise this will be worthy for a future game");storyExpected.append(lineSeparator);
		storyExpected.append("What was your favorite number?");storyExpected.append(lineSeparator);
		storyExpected.append("I am sorry if you like negative numbers more, but positive numbers are going to give us a much better experience");

		Assertions.assertEquals(storyExpected.toString(), story.toString().trim());
	}
	
	@Test
	public void p7() throws IOException {
		StringBuilder input = new StringBuilder();
		input.append(42);input.append(lineSeparator);
		input.append("pizza");input.append(lineSeparator);
		setUpInput(input);
				
		new interactive_fiction.external_help.Game(new ExternalImplP7()).play();
		
		StringBuilder storyExpected = new StringBuilder();
		storyExpected.append("This time, you have to work a bit more before we can play, I hope you did your homework!");storyExpected.append(lineSeparator);
		storyExpected.append("Can you tell me your number again? (as you can notice, I forget easily)");storyExpected.append(lineSeparator);
		storyExpected.append("See? now I can know that your number is even!");storyExpected.append(lineSeparator);
		storyExpected.append("I will show you more! For this, just let me know one of your favorite things (yes, like the song, but only one!)");storyExpected.append(lineSeparator);
		storyExpected.append("Oh, that is why you took so long, that is a long name for a thing...");storyExpected.append(lineSeparator);
		storyExpected.append("Cool! so one of your favorite things is pizza. You have a refined taste");

		Assertions.assertEquals(storyExpected.toString(), story.toString().trim());
	}
	
//	@Test
//	public void p8() throws IOException {
//		StringBuilder input = new StringBuilder();
//		input.append(42);input.append(lineSeparator);
//		input.append("no");input.append(lineSeparator);
//		setUpInput(input);
//				
//		new interactive_fiction.multiple_scenarios.Game().play();
//		
//		StringBuilder storyExpected = new StringBuilder();
//		storyExpected.append("Finally, we are going to stick together for a long time");storyExpected.append(lineSeparator);
//		storyExpected.append("To start, you have to give me a number (it does not need to be your favorite number this time)");storyExpected.append(lineSeparator);
//		storyExpected.append("So you are choosing positive numbers this time");storyExpected.append(lineSeparator);
//		storyExpected.append("Are you doing this for me, or do you like positive numbers?");storyExpected.append(lineSeparator);
//		storyExpected.append("Next time, we will have more fun!");
//
//		Assertions.assertEquals(storyExpected.toString(), story.toString().trim());
//	}
//	
//	@Test
//	public void p9() throws IOException {
//		StringBuilder input = new StringBuilder();
//		input.append("Matt");input.append(lineSeparator);
//		input.append(42);input.append(lineSeparator);
//		setUpInput(input);
//				
//		new interactive_fiction.long_story.Game(new ExternalImplP9()).play();
//
//		StringBuilder storyExpected = new StringBuilder();
//		storyExpected.append("This will be our last game, and I do not want to forget you, my friend, ever again");storyExpected.append(lineSeparator);
//		storyExpected.append("Can you tell me your name again?");storyExpected.append(lineSeparator);
//		storyExpected.append("Thank you again, Matt");storyExpected.append(lineSeparator);
//		storyExpected.append("I want a number again. It can be anything you like (or dislike if you are that kind of person)");storyExpected.append(lineSeparator);
//		storyExpected.append("With this number I can actually check something myself, for example");storyExpected.append(lineSeparator);
//		storyExpected.append("You choose an even number! And wait! I can do more!");storyExpected.append(lineSeparator);
//		storyExpected.append("The difference between the length of your name and the number you gave me is 38. I am amazing, am I?");storyExpected.append(lineSeparator);
//		storyExpected.append("I am glad to be able to play with you, Matt! I hope we can do this again in the future");
//
//		Assertions.assertEquals(storyExpected.toString(), story.toString().trim());
//	}
//	
	private void setUpInput(StringBuilder input) {
		ByteArrayInputStream in = new ByteArrayInputStream(input.toString().getBytes());
		Scenario.changeInput(new InputStreamReader(in));
	}
}
