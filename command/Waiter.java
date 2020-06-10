package 命令模式;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Waiter { 
	public List<Command> orders = new ArrayList<Command>();   
	// 设置订单	
	public void setOrder(Command com) {	
		orders.add(com);	
		System.out.println("add an order " + new Date());
		}		
	// 取消订单	
	public void cancelOrder(Command com) {	
		orders.remove(com);
		System.out.println("Cancel the order " + new Date());	
		}	
	// 全部执行
	public void inform() {	
		for (Command c : orders) {	
			c.excuteCommand();	
			}	
		}
	
}

