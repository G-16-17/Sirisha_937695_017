import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {
	private List<INotificationObserver> observer_list= new ArrayList<INotificationObserver>();
	
	@Override
	public void addSubscriber(INotificationObserver observer) {
		observer_list.add(observer);
		System.out.println("Observers are:");
		for(INotificationObserver l:observer_list) {
			System.out.println(l.getName());
		}
	}

	@Override
	public void removeSubscriber(INotificationObserver observer) {
		observer_list.remove(observer);
		System.out.println("Observers are:");
		for(INotificationObserver l:observer_list) {
			System.out.println(l.getName());
		}

	}

	@Override
	public void notifySubscriber() {
		for(INotificationObserver l:observer_list) {
			l.OnServerDown();
		}

	}

}
