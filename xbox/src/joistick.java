
class joistick {

	joistick(char aside) {
		
		side = aside;
	}
	
	public char side(){
		
		if(side == 'n'){
			side = 'n';
		}
		else if(side == 's'){
			side = 's';
		}
		else if(side == 'w'){
			side = 'w';
		}
		else if(side == 'e'){
			side = 'e';
		}
		
		else{
			side = ' ';
		}
		return side;
	}
	
	private char side;
}
