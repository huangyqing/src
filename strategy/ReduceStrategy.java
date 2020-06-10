package 策略模式;
//满1000减200促销策略
public class ReduceStrategy implements IStrategy{

	@Override
	public double realPrice(double consumPrice) {
		// TODO Auto-generated method stub
		if(consumPrice>=1000) {
			return consumPrice-200;
		}else {
		return consumPrice;
		}
	}
	

}
