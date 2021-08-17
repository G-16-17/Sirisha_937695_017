package gof_singletonhandson;

public class Main {

	public static void main(String[] args) {
		DBConn object = DBConn.getInstance();
		
	     object.showMessage();

	}

}
