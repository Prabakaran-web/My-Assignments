package week4.day1;

public class Javaconnection implements DatabaseConnection{

	
	// Implementing all methods from Interface
	@Override
	public void connect() {
		
		System.out.println("Connected");
		
	}

	@Override
	public void disconnect() {
		
		System.out.println("Disconnected");
		
		
	}

	@Override
	public void executeUpdate() {
		
		System.out.println("Executed");
		
		
	}

	
	public static void main(String[]args)
	{
		Javaconnection connection=new Javaconnection();
		
		connection.connect();
		connection.disconnect();
		connection.executeUpdate();
	}
}
