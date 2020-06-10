package 策略模式;

import java.util.Random;

//消费者购物消费
public class Client {
	 public static void main(String[] args) {
		    // 创建上下问环境对象实例
		    // Context context = new Context();
		    // 随机数对象
		    Random random = new Random();
		    for (int i = 0; i < 10; i++) {
		      // 产生随机数的方式判断使用何种促销策略
		      int x = random.nextInt(3);
		      // 消费价格也是由随机数产生的（不能为0）
		      double consumPrice = 0;
		      while ((consumPrice = random.nextInt(2000)) == 0) {
		      }
		      double realPrice = consumPrice;
		      switch (x) {
		      case 0:
		        // 打八折商品
		        // context.setStrategy(new RebateStrategy());
		        realPrice = consumPrice * 0.8;
		        break;
		      case 1:
		        // 满200，高于200部分打八折 商品
		        // context.setStrategy(new PromotionalStrategy());
		        if (consumPrice > 200) {
		          realPrice = 200 + (consumPrice - 200) * 0.8;
		        }
		        break;
		      case 2:
		        // 满1000减200 商品
		        // context.setStrategy(new ReduceStrategy());
		        if (consumPrice >= 1000) {
		          realPrice = consumPrice - 200;
		        }
		        break;
		      }
		      System.out.print("【"
		          + (x == 0 ? "打八折" : (x == 1 ? "高于200部分打八折"
		              : (x == 2 ? "满1000减200" : ""))) + "】商品：");
		      System.out.println("原价：" + consumPrice + " - 优惠后价格：" + realPrice);
		    }
		  }

}
