package week3.day2;

public class Edge extends Chrome{

	public void takeSnap() {
		
		System.out.println("Snap Taken");
		
	}
	
	public void clearCookies()
	
	{
		System.out.println("Cookies Cleared");
		}
	
	public static void main(String[]args)
	{
		Edge options=new Edge();
		options.clearCookies();
		options.takeSnap();
		options.clearCache();
		options.openIncognito();
		options.openURL();
		options.closeBrowser();
		options.navigateback();
		options.openURL();		
	}
}
