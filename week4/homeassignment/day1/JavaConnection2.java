package week4.homeassignment.day1;

public class JavaConnection2 extends MySqlConnection{
	
	public void connect() {
		System.out.println("DB is connected");		
	}

	public void disconnect() {
		System.out.println("DB is disconnected");		
	}

	public void executeUpdate() {
		System.out.println("There is an execution update");		
	}

	@Override
	public void executeQuery() {
		System.out.println("Query is executed");		
	}

	public static void main(String[] args) {
		JavaConnection2 jc2 = new JavaConnection2();
		jc2.connect();
		jc2.disconnect();
		jc2.executeUpdate();
		jc2.executeQuery();

	}

	

}
