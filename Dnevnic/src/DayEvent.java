import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

class DayEvent {

	private Event e1, e2;
	static List<Event> dayList = new ArrayList<Event>();
	
	DayEvent(){}
	
	public void add(Event event) {
		e1=event;
		dayList.add(event);
		System.out.println("��������� ����� ������");
	}

	public void remove(Event event){
		e1=event;
		if (dayList == null) {
		System.out.println("���������� ����");
		}
		dayList.remove(event);
		System.out.println("������ �������");
	}
	
	public void update(Event eventR, Event eventA){
		e1=eventR;
		e2=eventA;
		if (dayList == null) {
		System.out.println("���������� ����");
		}
		dayList.remove(e1);
		dayList.add(e2);
		System.out.println("������ ��������");
	}
}