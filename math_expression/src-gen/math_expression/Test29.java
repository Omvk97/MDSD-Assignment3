package math_expression;

public class Test29 {
	
	public int x;
	public int y;
	
	private External external;
	
	public Test29(External external) {
		this.external = external;
	}
	
	public void compute() {
		this.x = this.external.pow(4, 2);
		this.y = x - 2;
	}
	
	// External Method Interfaces
	public interface External {
		public int pow(int powInt0, int powInt1);
	}
}
