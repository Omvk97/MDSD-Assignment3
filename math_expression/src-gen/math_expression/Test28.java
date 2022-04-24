package math_expression;

public class Test28 {
	
	public int x;
	public int y;
	
	private External external;
	
	public Test28(External external) {
		this.external = external;
	}
	
	public void compute() {
		this.x = this.external.sqrt(4);
		this.y = x * 2;
	}
	
	// External Method Interfaces
	public interface External {
		public int sqrt(int sqrtInt0);
	}
}
