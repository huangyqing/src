package ����ģʽ;
//���۴���
public class RebateStrategy implements IStrategy{
	private final double rate;//���췽�����ô�����
    public RebateStrategy() {
    	this.rate=0.8;
    }
	@Override
	public double realPrice(double consumPrice) {
		// TODO Auto-generated method stub
		return consumPrice;
	}

}
