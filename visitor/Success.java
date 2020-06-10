package 访问者模式;

public class Success extends Action { 	
	@Override	
	public void getManReflection(Man m) {	
		System.out.println("When a man successed , there will be a great women behind him! ");
		} 	
	@Override	
	public void getWomanReaction(Woman w) {	
		System.out.println("When a woman successed , there will be a bad man behind him! ");	
		}
	}

