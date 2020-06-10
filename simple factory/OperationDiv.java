package 简单工厂模式;

public class OperationDiv extends Operation{
	public  double GetResult(double NumberA,double NumberB) 
	{
		double result=0;
		if (NumberB==0) {
			try {
				throw new Exception("除数不能为0。");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;
		}else {
		result=NumberA/NumberB;
		return result;
		}
	}
}