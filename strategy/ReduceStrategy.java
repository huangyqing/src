package ����ģʽ;
//��1000��200��������
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
