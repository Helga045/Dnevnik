
public enum JEvents {

	work("Работа"),
	help("Помощь боссу"),
	prepare("Подготовка к совещанию"),
	
	math("Занятие по математике"),
	phis("Занятие по физике"),
	eng("Занятие по английскому"),
	rus("Занятие по русскому"),
	
	game("Игры на компьютере"),
	guitar("Игра на гитаре"),
	rest("Отдых"),
	read("Чтение книги"),
	sleep("Сон"),
	music("Прослушивание музыки"),
	shopping("Поход по магазинам")
	;
	
	private String name;
	
	private JEvents(String name) {
		this.name = name;
	}

}

/*
	Events(String aType){
		type = aType;
	}
	
	public EventType type;
	
	String work ="Работа";
	String help = "Помощь боссу";
	String prepare = "Подготовка к совещанию";
	
	String math = "Занятие по математике";
	String phis = "Занятие по физике";
	String eng = "Занятие по английскому";
	String rus = "Занятие по русскому";
	
	String game = "Игры на компьютере";
	String guitar = "Игра на гитаре";
	String rest = "Отдых";
	String read = "Чтение книги";
	String sleep = "Сон";
	String music = "Прослушивание музыки";
	String shopping = "Поход по магазинам";
	
	String[] event = {work, help, prepare, math, phis, eng, rus, game, guitar,
			rest, read, sleep, music, shopping};
	List<Event> eventList = new ArrayList<Event>();
*/