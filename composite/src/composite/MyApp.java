package composite;

import java.util.Arrays;

public class MyApp {

	public static void main(String[] args) {
		Button b1 = new Button();
		Button b2 = new Button();
		
		TextArea t1 = new TextArea();
		
		Menu m1 = new Menu();
		
		Window w1 = new Window();
		w1.setButtons(Arrays.asList(new Button[]{b1, b2}));
		w1.setTextAreas(Arrays.asList(new TextArea[]{t1}));
		w1.setMenus(Arrays.asList(new Menu[]{m1}));

		w1.openWindow();
	}

}
