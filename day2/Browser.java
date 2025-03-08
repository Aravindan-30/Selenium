package week1.day2;

public class Browser {
String launchBrowser(String browserName) {
	System.out.println("Browser launched successfully");
	return browserName;
}
String loadUrl() {
	return("Application url loaded successfully");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Browser call= new Browser();
System.out.println(call.launchBrowser("Chrome Browser"));
System.out.println(call.loadUrl());
	}

}
