import java.util.UUID;

public class Project {

	public static void main(String[] args) {

		Dnevnic dn = new Dnevnic();
		Event rest = new Event(id = UUID.randomUUID(), EventType.Rest,"�����", 10, 11, 2007);
		dn.toWrite(rest);
	}
	private static UUID id;
}