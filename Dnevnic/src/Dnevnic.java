import java.lang.*;
import java.util.UUID;

class Dnevnic implements Dnevnik {

	public void toWrite(Event event) {
		
	}

	public void toDelete(UUID id) {
		System.out.println("�������");
	}

	public void toUpdate(Event event) {
		System.out.println("��������");
	}

	public void toShow() {
		System.out.println("��������");
	}

}