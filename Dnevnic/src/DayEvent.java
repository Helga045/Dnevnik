import java.util.Date;
import java.util.List;


class DayEvent {

	
	DayEvent(EventType type, Events event, Date date){
		this.type = type;
		this.event = event;
		this.date = date;
	}
	
	private Date date;
	private Events event;
	private EventType type; 
}