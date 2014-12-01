import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

class MonthEvent {

	DayEvent e1, e2;
	static List<DayEvent> monthList = new ArrayList<DayEvent>();
	
	MonthEvent(){}
	
	public void add(DayEvent event) {
		e1=event;
		monthList.add(e1);
		System.out.println("Добавлена новая запись");
	}
	
	public void remove(DayEvent event) {
		e1=event;
		if (monthList == null) {
		System.out.println("Ежедневник пуст");
		}
		else {
		monthList.remove(e1);
		System.out.println("Запись удалена");
		}
	}
	
	public void update(DayEvent eventR, DayEvent eventA){
		e1=eventR;
		e2=eventA;
		if (monthList == null) {
		System.out.println("Ежедневник пуст");
		}
		else {
		monthList.remove(eventR);
		monthList.add(eventA);
		System.out.println("Запись изменена");
		}
	}
	
//	public void update(DayEvent dayEvent) {
//		if (dayList == null) {
//			dayList = new ArrayList<DayEvent>();
//		}
//		dayList.remove(dayEvent);
//		dayList.add(dayEvent);
//	}
}