package 策略模式;
//200以上部分打8折促销策略
public class PromotionalStrategy implements IStrategy{

	@Override
	public double realPrice(double consumPrice) {
		if (consumPrice > 200) {
		      return 200 + (consumPrice - 200) * 0.8;
		    } else {
		      return consumPrice;
		    }
	}
	

}
