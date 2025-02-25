package week4.homeassignment.day1;

public interface DatabaseConnection {
	
	public abstract void connect();
	
	public abstract void disconnect();
	
	public abstract void executeUpdate();

}
