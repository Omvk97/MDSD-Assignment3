package math_expression;

public class Test31 {
	
	public int x;
	public int y;
	
	private External external;
	
	public Test31(External external) {
		this.external = external;
	}
	
	public void compute() {
		this.x = 5;
		this.y = 2 + this.external.pow((x) - 3, 3 * 2);
	}
	
	// External Method Interfaces
	public interface External {
		public int pow(int powInt0, int powInt1);
	}
}
