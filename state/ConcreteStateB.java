package ״̬ģʽ;

public class ConcreteStateB implements State
{
	public void handle(Context context)
	{
		context.setState(new ConcreteStateA());

	}

}
