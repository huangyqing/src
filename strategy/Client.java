package ����ģʽ;

import java.util.Random;

//�����߹�������
public class Client {
	 public static void main(String[] args) {
		    // ���������ʻ�������ʵ��
		    // Context context = new Context();
		    // ���������
		    Random random = new Random();
		    for (int i = 0; i < 10; i++) {
		      // ����������ķ�ʽ�ж�ʹ�ú��ִ�������
		      int x = random.nextInt(3);
		      // ���Ѽ۸�Ҳ��������������ģ�����Ϊ0��
		      double consumPrice = 0;
		      while ((consumPrice = random.nextInt(2000)) == 0) {
		      }
		      double realPrice = consumPrice;
		      switch (x) {
		      case 0:
		        // �������Ʒ
		        // context.setStrategy(new RebateStrategy());
		        realPrice = consumPrice * 0.8;
		        break;
		      case 1:
		        // ��200������200���ִ���� ��Ʒ
		        // context.setStrategy(new PromotionalStrategy());
		        if (consumPrice > 200) {
		          realPrice = 200 + (consumPrice - 200) * 0.8;
		        }
		        break;
		      case 2:
		        // ��1000��200 ��Ʒ
		        // context.setStrategy(new ReduceStrategy());
		        if (consumPrice >= 1000) {
		          realPrice = consumPrice - 200;
		        }
		        break;
		      }
		      System.out.print("��"
		          + (x == 0 ? "�����" : (x == 1 ? "����200���ִ����"
		              : (x == 2 ? "��1000��200" : ""))) + "����Ʒ��");
		      System.out.println("ԭ�ۣ�" + consumPrice + " - �Żݺ�۸�" + realPrice);
		    }
		  }

}
