import java.util.UUID;


public class Event {

	private UUID id = UUID.randomUUID();
	
	private EventType eventType;

	public Event(UUID id) {
		this.id = id;
	}

	//TODO �������� ������ ����  
	
	public EventType getEventType() {
		return eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}
	
	
	
}
