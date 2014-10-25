import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.lang.String;


public enum EventType {

	Work("Работа"),
	Rest("Отдых"),
	Study("Учеба");
	
	private String name;
	
	EventType(String name){
		this.name = name;
	}
	
}
