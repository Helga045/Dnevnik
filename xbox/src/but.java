
public class but {

	but(String but) {
		
	}
	
	private String but;
	private boolean press;

	public void press(String aButt, boolean aPress){
		but = aButt;
		press = aPress;
	}
	
	public void release(){
		
	}
}

enum butt {

	back("back"),
	start("start"),
	x("x"),
	y("y"),
	a("a"),
	b("b"),
	lt("lt"),
	lb("lb"),
	rt("rt"),
	rb("rb"),
	main("main"),
	rjoi("rjoi"),
	ljoi("ljoi"),
	dpad("dpad");
	
	private String button;
	
	butt(String aButton){
		button = aButton;
	}	
}