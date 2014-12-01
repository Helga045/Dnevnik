import java.util.UUID;

interface Dnevnik{

	void toWrite(Event event);
	void toDelete(Event event);
	void toUpdate(Event eventR, Event eventA);
	void toShow(Event event);
	
}