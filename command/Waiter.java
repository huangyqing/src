package ����ģʽ;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Waiter { 
	public List<Command> orders = new ArrayList<Command>();   
	// ���ö���	
	public void setOrder(Command com) {	
		orders.add(com);	
		System.out.println("add an order " + new Date());
		}		
	// ȡ������	
	public void cancelOrder(Command com) {	
		orders.remove(com);
		System.out.println("Cancel the order " + new Date());	
		}	
	// ȫ��ִ��
	public void inform() {	
		for (Command c : orders) {	
			c.excuteCommand();	
			}	
		}
	
}

