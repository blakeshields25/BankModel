package bank;

public class CafeBranch extends Bank {
	private String menu;
/***
 * get menu
 * @return
 */
	public String getMenu() {
		return menu;
	}
/***
 * set menu
 * @param menu
 */
	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String toString() {
		return "Menu = " + menu + super.toString();
	}
}
