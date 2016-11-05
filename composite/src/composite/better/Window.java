package composite.better;

import java.util.List;

public class Window implements Widget {

	private List<Widget> widgets;
	
	public List<Widget> getWidgets() {
		return widgets;
	}

	public void setWidgets(List<Widget> widgets) {
		this.widgets = widgets;
	}

	@Override
	public void display() {
		System.out.println("Display window");		
		for(Widget w : widgets) {
			w.display();
		}				
	}
}
