package 策略模式;
//八折促销
public class RebateStrategy implements IStrategy{
	private final double rate;//构造方法设置打折率
    public RebateStrategy() {
    	this.rate=0.8;
    }
	@Override
	public double realPrice(double consumPrice) {
		// TODO Auto-generated method stub
		return consumPrice;
	}

}
