package 简单工厂模式;

public class Operation {
	private double NumberA;
	private double NumberB;

	public double getNumberA() {
		return NumberA;
	} 
	public void setNumberA() {
		this.NumberA=NumberA;
	}
	public double getNumberB() {
		return NumberB;
	} 
	public void setNumberB() {
		this.NumberB=NumberB;
	}

	public  double GetResult(double NumberA,double NumberB) {
		double result = 0;
		return result;
	}

}
