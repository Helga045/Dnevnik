import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;


public class Event {

	private UUID id;
	
	private EventType eventType;
	private String event, date;
	private int day, year, month;

	public Event(UUID id, EventType type, String event, int ayear, int amonth, int aday) {
		this.id = id;
		eventType=type;
		this.event=event;
		year=ayear;
		month=amonth;
		day=aday;
	}
		
		//this.month=month+1;
		//this.year=year;
		
//		calendar = new GregorianCalendar();
//		Date dat = calendar.getTime();
//		calendar.setTime(dat);
//		calendar.get(Calendar.DAY_OF_MONTH);
//		dat.getMonth();
//		dat.getDay();
		
	//TODO �������� ������ ����  
	
	public UUID getID(){
		return id;
	}
	
	public UUID setID(UUID aid){
		id=aid;
		return id;
	}
		
	public EventType getEventType() {
		return eventType;
	}

//	public void setEventType(EventType eventType) {
//		this.eventType = eventType;
//	}	
	
	public String getEvent(){
	return event;
	}
		
	public String getDate(){
		date=year+"/"+month+"/"+day;
		return date;
	}
	
//	public int getMonth(){
//		return month;
//	}
//	
//	public int getYear(){
//		return year;
//	}
//	
//	public void setDate(int date, int month, int year){
//		this.date=date;
//		this.month=month+1;
//		this.year=year;	
//	}
//	
//	
//	public void setEvents(String event){
//		this.event=event;
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Event other = (Event) obj;
//		if (id == null) {
//			if (other.id != null)
//				return false;
//		} else if (!id.equals(other.id))
//			return false;
//		return true;
//	}
}