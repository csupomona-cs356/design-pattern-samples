package composite;

import java.util.List;

public class Window {

	private List<Button> buttons;
	private List<Menu> menus;
	private List<TextArea> textAreas;
	
	private List<CheckBox> checkboxes;
	
	private List<Window> windows;
	
	public void openWindow() {
		System.out.println("Display window");
		for(Button button : buttons) {
			button.displayButton();
		}
		for(Menu menu : menus) {
			menu.showMenu();
		}
		for(TextArea textarea : textAreas) {
			textarea.renderTextArea();
		}
		for(CheckBox cb : checkboxes) {
			cb.displayCheckBox();
		}
	}

	public List<Button> getButtons() {
		return buttons;
	}

	public void setButtons(List<Button> buttons) {
		this.buttons = buttons;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public List<TextArea> getTextAreas() {
		return textAreas;
	}

	public void setTextAreas(List<TextArea> textAreas) {
		this.textAreas = textAreas;
	}

	public List<Window> getWindows() {
		return windows;
	}

	public void setWindows(List<Window> windows) {
		this.windows = windows;
	}

	public List<CheckBox> getCheckboxes() {
		return checkboxes;
	}

	public void setCheckboxes(List<CheckBox> checkboxes) {
		this.checkboxes = checkboxes;
	}
}
