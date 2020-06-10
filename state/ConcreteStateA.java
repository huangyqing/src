package ״̬ģʽ;

public class ConcreteStateA implements State
{
	public void handle(Context context)
	{
		context.setState(new ConcreteStateB());
	}

}
