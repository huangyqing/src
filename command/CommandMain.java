package 命令模式;

public class CommandMain { 
	public static void main(String[] args) {	
		// 1, 开店前的准备		
		Barbecuer boy = new Barbecuer();	
		Command command1 = new BakeMuttonCommand(boy);	
		Command command2 = new BakeMuttonCommand(boy);	
		Command command3 = new BakeChickenWingCommand(boy);	
		// 2, 开门营业,顾客点菜	
		Waiter waiter = new Waiter();	
		waiter.setOrder(command1);		
		waiter.setOrder(command2);	
		waiter.setOrder(command3);		
		// 3, 点菜完毕,通知厨房		
		waiter.inform();			
		// 4, 取消订单	
		waiter.cancelOrder(command2);		
		waiter.inform();	
		} 
	
	
}

