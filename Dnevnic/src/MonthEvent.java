import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

class MonthEvent {

	MonthEvent(UUID uuid){
	id = uuid;
	}
	DayEvent e;
	Event e1, e2;
	UUID id;
	
	static List<DayEvent> monthList = new ArrayList<DayEvent>();
	
	public void add(DayEvent event) {
		e=event;
		monthList.add(e);
		System.out.println("��������� ����� ������");
	}
	
	public void remove(DayEvent event) {
		e=event;
		if (monthList == null) {
		System.out.println("���������� ����");
		}
		else {
		monthList.remove(e);
		System.out.println("������ �������");
		}
	}
	
	public void update(DayEvent e1, DayEvent e2){
		if (monthList == null) {
		System.out.println("���������� ����");
		}
		else {
		monthList.remove(e1);
		monthList.add(e2);
		System.out.println("������ ��������");
		}
	}
}