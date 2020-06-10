package 工厂方法模式;


public class StudentFactory implements Factory{
	public LeiFeng createLeiFengFactory() {
		return new Student();
	}
}
