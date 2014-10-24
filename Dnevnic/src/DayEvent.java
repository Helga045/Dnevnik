import java.util.Date;
import java.util.List;


class DayEvent {

	List<DayEvent> dayList; 
	DayEvent(EventType type, JEvents event, Date date){
		this.type = type;
		this.event = event;
		this.date = date;
	}
	
	private Date date;
	private JEvents event;
	private EventType type; 
}