package math_expression;

public class Test34 {
	
	public int sideA;
	public int sideB;
	public int sideC;
	public int perimeterTriangle;
	public int radius;
	public int perimeterCircle;
	
	private External external;
	
	public Test34(External external) {
		this.external = external;
	}
	
	public void compute() {
		this.sideA = 3;
		this.sideB = 4;
		this.sideC = this.external.sqrt((this.external.pow(sideA, 2)) + (this.external.pow(sideB, 2)));
		this.perimeterTriangle = sideA + sideB + sideC;
		this.radius = 5;
		this.perimeterCircle = (2 * radius) * this.external.pi();
	}
	
	// External Method Interfaces
	public interface External {
		public int pow(int powInt0, int powInt1);
		public int sqrt(int sqrtInt0);
		public int pi();
	}
}
