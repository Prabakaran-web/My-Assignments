package week3.day2;

public class APIClient {

	public void sendRequest(String endpoint)
	{
		
		System.out.println("Endpoint is "+endpoint);
	}
	
	public void sendRequest(String endpoint,String requestBody,boolean requeststatus) {
		
		System.out.println("Endpoint is "+endpoint);
		System.out.println("RequestBody is"+requestBody);
	    if(requeststatus)
	    {
	    	System.out.println("Request status is successful");
	    }
	    else
	    	
	    	System.out.println("Request failed");
		
	}
	
	public static void main(String[] args)
	{
		APIClient options=new APIClient();
		options.sendRequest("users");
		
		options.sendRequest("Users"," two", true);
		
		//System.out.println("hello "+ options);
		
		
				}
}
