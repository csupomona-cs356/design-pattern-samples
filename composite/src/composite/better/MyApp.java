package composite.better;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyApp {

	public static List<Widget> allRootWidgets = new ArrayList<>();
	
	public static void main(String[] args) {
		Button b1 = new Button();
		Button b2 = new Button();		
		TextArea t1 = new TextArea();		
		Menu m1 = new Menu();
		
		Window w1 = new Window();
		w1.setWidgets(Arrays.asList(new Widget[]{b1, b2, t1, m1}));
		w1.display();
		
		
		Widget b3 = new Button();
		b3.display();
		
		MyApp.allRootWidgets.add(w1);
		MyApp.allRootWidgets.add(b3);
		
		for(Widget w : MyApp.allRootWidgets) {
			w.display();
		}
		
	}

}
