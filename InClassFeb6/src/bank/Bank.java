package bank;
//model a bank corporation like 5/3rd
public class Bank {
private String name;
/***
 * get name of bank
 * @return
 */
public String getName() {
	return name;
}
/***
 * set name of bank
 * @param name
 */
public void setName(String name) {
	this.name = name;
}

public String toString() {
	return "Name = " + name + super.toString();
}
}

