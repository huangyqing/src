package 工厂方法模式;

public class ValuatorFactory implements Factory{
	public LeiFeng createLeiFengFactory() {
		return new Valuator();
	}
}
