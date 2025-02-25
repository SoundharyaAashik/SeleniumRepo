package week4.homeassignment.day1;

public class JavaConnection implements DatabaseConnection{
		
	public void connect() {
		System.out.println("Connected to Java");		
	}

	public void disconnect() {
		System.out.println("Disconnected Java");		
	}

	public void executeUpdate() {
		System.out.println("Execution Update");		
	}
	
	public void dbconnection() {
		System.out.println("DB is connected");
	}

	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.dbconnection();
	}

	

}
