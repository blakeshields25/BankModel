package bank;

public class BrickAndMortar extends Bank {
private String address;
/***
 * get name of bank
 * @return
 */
public String getAddress() {
	return address;
}
/***
 * set name of bank
 * @param address
 */
public void setAddress(String address) {
	this.address = address;
}

public String toString() {
	return "Address = " + address + super.toString();
}
}
