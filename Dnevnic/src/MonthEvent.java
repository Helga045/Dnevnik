import java.util.ArrayList;
import java.util.Date;
import java.util.List;


class MonthEvent {

	List<DayEvent> dayList; 
	
	MonthEvent(){	}
	
	public void add(DayEvent dayEvent) {
		if (dayList == null) {
			dayList = new ArrayList<DayEvent>();
		}
		dayList.add(dayEvent);
	}
	


	private DayEvent day;
}