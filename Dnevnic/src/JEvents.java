
public enum JEvents {

	work("������"),
	help("������ �����"),
	prepare("���������� � ���������"),
	
	math("������� �� ����������"),
	phis("������� �� ������"),
	eng("������� �� �����������"),
	rus("������� �� ��������"),
	
	game("���� �� ����������"),
	guitar("���� �� ������"),
	rest("�����"),
	read("������ �����"),
	sleep("���"),
	music("������������� ������"),
	shopping("����� �� ���������")
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
	
	String work ="������";
	String help = "������ �����";
	String prepare = "���������� � ���������";
	
	String math = "������� �� ����������";
	String phis = "������� �� ������";
	String eng = "������� �� �����������";
	String rus = "������� �� ��������";
	
	String game = "���� �� ����������";
	String guitar = "���� �� ������";
	String rest = "�����";
	String read = "������ �����";
	String sleep = "���";
	String music = "������������� ������";
	String shopping = "����� �� ���������";
	
	String[] event = {work, help, prepare, math, phis, eng, rus, game, guitar,
			rest, read, sleep, music, shopping};
	List<Event> eventList = new ArrayList<Event>();
*/