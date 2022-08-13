package interactive_fiction.common;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public abstract class Scenario {
	protected static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	protected String nextInteraction;
	protected String calledScenarioEnd;
	
	public abstract String interact() throws IOException ;
	
	public static void changeInput(InputStreamReader streamReader) {
		br = new BufferedReader(streamReader);
	}
}
