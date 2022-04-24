package math_expression;

public class Test27 {
	
	public int x;
	public int y;
	
	private External external;
	
	public Test27(External external) {
		this.external = external;
	}
	
	public void compute() {
		this.x = this.external.pi();
		this.y = x + 2;
	}
	
	// External Method Interfaces
	public interface External {
		public int pi();
	}
}
