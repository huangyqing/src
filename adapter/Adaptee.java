package 适配器模式;


public class Adaptee extends Target

{
	public void specificRequest()
	{
		System.out.println("特殊请求！");
	}
}
