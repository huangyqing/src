package 简单工厂模式;

public class OperationAdd extends Operation{
	public  double GetResult(double NumberA,double NumberB) 
	{
		double result=0;
		result=NumberA+NumberB;
		return result;
	}
}
