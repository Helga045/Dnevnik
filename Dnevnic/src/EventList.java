import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class EventList {
	
	MonthEvent e1, e2;
	
	static List<MonthEvent> eventList = new ArrayList<MonthEvent>();
	
	EventList(){}
	
	public void add(MonthEvent event) {
		e1=event;
		eventList.add(e1);
		System.out.println("Добавлена новая запись");
	}
	
	public void remove(MonthEvent event) {
		e1=event;
		if (eventList == null) {
			System.out.println("Ежедневник пуст");
		}
		else {
		eventList.remove(e1);
		System.out.println("Запись удалена");
		}
		}

		public void update(MonthEvent eventR, MonthEvent eventA){
			e1=eventR;
			e2=eventA;
		if (eventList == null) {
			System.out.println("Ежедневник пуст");
		}
		else{
		eventList.remove(e1);
		eventList.add(e2);
		System.out.println("Запись изменена");
		}
	}
//	public void update(MonthEvent monthEvent) {
//		if (dayList == null) {
//			dayList = new ArrayList<MonthEvent>();
//		}
//		dayList.remove(monthEvent);
//		dayList.add(monthEvent);
//	}
}