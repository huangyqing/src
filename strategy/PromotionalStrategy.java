package ����ģʽ;
//200���ϲ��ִ�8�۴�������
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
