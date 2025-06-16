package week3.day2;

public class Chrome extends Browser{

	
	public void openIncognito()
	
	{
		
		System.out.println("Incognito Window opened");
	}
	
	public void clearCache() {
		
		
	System.out.println("ClearCache Done");
	}
	
	public static void main(String[] args) {
		Chrome options= new Chrome();
		options.clearCache();
		options.openIncognito();
		options.openURL();
		options.closeBrowser();
		options.navigateback();
	}
}

