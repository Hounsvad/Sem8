package interactive_fiction.test;

import java.util.ArrayList;
import java.util.List;

public class ExternalImplP7 implements interactive_fiction.external_help.External{

	List<String> favorites;
	
	ExternalImplP7() {
		favorites = new ArrayList<String>();
		favorites.add("pizza");
		favorites.add("coffee");
		favorites.add("beer");
		favorites.add("pisco");
		favorites.add("music");
		favorites.add("sopaipilla");
		favorites.add("lake");
		favorites.add("mountain");
	}
	@Override
	public boolean isEven(int param0) {
		return param0 % 2 == 0;
	}

	@Override
	public boolean isFavorite(String param1) {
		return favorites.contains(param1);
	}

	@Override
	public int textLength(String param2) {
		return param2.length();
	}

}
