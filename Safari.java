package week3.day2;

public class Safari extends Edge {
	
	public void readerMode()
	{
		System.out.println("ReaderMode Activated");
	}
	
	public void fullScreenMode()
	{
		System.out.println("Full Screen mode activated");
	}

	
	public static void main(String[]args)
	{
		Safari options=new Safari();
		options.fullScreenMode();
		options.readerMode();
		options.clearCache();
		options.openIncognito();
		options.clearCookies();
		options.takeSnap();
		options.closeBrowser();
		options.navigateback();
		options.openURL();
		
	}
}
