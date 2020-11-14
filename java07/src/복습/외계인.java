package 복습;

public class 외계인 {
	
	 public String name;
	 public int move;
	
	 //public 외계인() 만들어지지않음.
	 public 외계인(String name, int move) {
		this.name = name;
		this.move = move;
	}

	@Override
	public String toString() {
		return name + ", x=" + move ;
	}
	
	 
	 
	
}
