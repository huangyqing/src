package �򵥹���ģʽ;

public class OperationDiv extends Operation{
	public  double GetResult(double NumberA,double NumberB) 
	{
		double result=0;
		if (NumberB==0) {
			try {
				throw new Exception("��������Ϊ0��");
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