package week3.homeassignments.methodoverloading;

public class APIClient {
	
	public String sendRequest(String endpoint) {
		
		System.out.println("This is the sendRequest method with single parameter");
		return endpoint;
	}

	public void sendRequest(String endpoint,String requestBody, boolean requestStatus) {
		
		System.out.println("This is the sendRequest method with multiple parameter");
	}
	
	public static void main(String[] args) {
		APIClient api = new APIClient();
		api.sendRequest("API end point");
		api.sendRequest("api endpoint", "api requestbody", true);		
	}
}
