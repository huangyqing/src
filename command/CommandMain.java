package ����ģʽ;

public class CommandMain { 
	public static void main(String[] args) {	
		// 1, ����ǰ��׼��		
		Barbecuer boy = new Barbecuer();	
		Command command1 = new BakeMuttonCommand(boy);	
		Command command2 = new BakeMuttonCommand(boy);	
		Command command3 = new BakeChickenWingCommand(boy);	
		// 2, ����Ӫҵ,�˿͵��	
		Waiter waiter = new Waiter();	
		waiter.setOrder(command1);		
		waiter.setOrder(command2);	
		waiter.setOrder(command3);		
		// 3, ������,֪ͨ����		
		waiter.inform();			
		// 4, ȡ������	
		waiter.cancelOrder(command2);		
		waiter.inform();	
		} 
	
	
}

