
interface Dnevnik{

	void toWrite(Event event);
	void toDelete(Event event);
	void toUpdate();
	void toShow();
	
}