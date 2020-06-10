package 策略模式;

import java.math.BigDecimal;
// 创建上下文环境
public class Context {
	// 当前策略
	  private IStrategy strategy;
	  // 设置当前策略
	  public void setStrategy(IStrategy strategy) {
	    this.strategy = strategy;
	  }
	  // 使用策略计算价格
	  public double cul(double consumPrice) {
	    // 使用具体商品促销策略获得实际消费金额
	    double realPrice = this.strategy.realPrice(consumPrice);
	    // 格式化保留小数点后1位，即：精确到角
	    BigDecimal bd = new BigDecimal(realPrice);
	    bd = bd.setScale(1, BigDecimal.ROUND_DOWN);
	    return bd.doubleValue();
	  }

}
