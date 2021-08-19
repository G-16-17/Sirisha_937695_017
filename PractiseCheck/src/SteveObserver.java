
public class SteveObserver implements INotificationObserver {
	private String name="Steve";
	
	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void OnServerDown() {
		System.out.println("Server Down message received by "+name);
		
	}

}
