package 策略模式;

public interface IStrategy {
/**
 * 计算实际价格的方法*/
	public double realPrice(double consumPrice);
}
