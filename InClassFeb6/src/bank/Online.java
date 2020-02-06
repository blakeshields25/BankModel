package bank;

public class Online extends Bank {
private String url;
/***
 * get url
 * @return
 */
public String getUrl() {
	return url;
}
/***
 * set url
 * @param url
 */
public void setUrl(String url) {
	this.url = url;
}
public String toString() {
	return "URL = " + url + super.toString();
}
}
