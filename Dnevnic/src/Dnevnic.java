import java.lang.*;
import java.util.Scanner;
import java.util.UUID;

class Dnevnic implements Dnevnik {
	
	Dnevnic(){
		
	}

	private Event e1, e2;
	private DayEvent d, d1, d2;
	private MonthEvent m, m1, m2;
	private EventList l;
	private UUID uuid;
	
	public void toWrite(Event event) {
		e1=event;
		d.add(e1);
		m.add(d);
		l.add(m);
		System.out.println("Вы создали запись в ежедневнике^^");
	}

	public void toDelete(Event event) {
		e1=event;
		if(e1!=null){
		d.remove(e1);
		m.remove(d);
		l.remove(m);
		System.out.println("Вы удалили запись из ежедневника");
		}
		System.out.println("Запись действий некорректна((");
	}

	public void toUpdate(Event eventR, Event eventA) {
		e1=eventR;
		e2=eventA;
		if(e1!=null & e2!=null){
		uuid=e1.getID();
		e2.setID(uuid);

		d.update(e1, e2);
		m.update(e1, e2);
		l.update(e1, e2);
		System.out.println("Вы изменили запись в ежедневнике");}
		else System.out.println("Запись действий некорректна(");
	}
	
	public void toShow(Event event){
		e1=event;
		System.out.println("Тип: "+e1.getEventType()+"/nВркмяпровождение: "+e1.getEvent()+
				"/nДата"+e1.getDate());
	}
}