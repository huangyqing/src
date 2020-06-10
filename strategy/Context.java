package ����ģʽ;

import java.math.BigDecimal;
// ���������Ļ���
public class Context {
	// ��ǰ����
	  private IStrategy strategy;
	  // ���õ�ǰ����
	  public void setStrategy(IStrategy strategy) {
	    this.strategy = strategy;
	  }
	  // ʹ�ò��Լ���۸�
	  public double cul(double consumPrice) {
	    // ʹ�þ�����Ʒ�������Ի��ʵ�����ѽ��
	    double realPrice = this.strategy.realPrice(consumPrice);
	    // ��ʽ������С�����1λ��������ȷ����
	    BigDecimal bd = new BigDecimal(realPrice);
	    bd = bd.setScale(1, BigDecimal.ROUND_DOWN);
	    return bd.doubleValue();
	  }

}
