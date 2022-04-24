package math_expression;

public class Test30 {
	
	public int x;
	
	private External external;
	
	public Test30(External external) {
		this.external = external;
	}
	
	public void compute() {
		this.x = this.external.sqrt(this.external.pow(this.external.pi(), 2));
	}
	
	// External Method Interfaces
	public interface External {
		public int pow(int powInt0, int powInt1);
		public int sqrt(int sqrtInt0);
		public int pi();
	}
}
