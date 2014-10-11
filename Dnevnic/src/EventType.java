
public enum EventType {

	Work("Работа"),
	Stydy("Учеба"),
	Rest ("Отдых")
	;
	
	private String name;
	
	private EventType(String name) {
		this.name = name;
	}

}
