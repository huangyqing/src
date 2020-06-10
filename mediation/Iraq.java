package 中介者模式;


public class Iraq extends Country {
	public Iraq(UnionNations un) {
		super(un);
	}
	@Override
	public void declare(String message) {
		this.getUn().declare(message, this);
	}	
	@Override
	public void getMessage(String message) {
		System.out.println("Iraq has get the message: " + message);
	}
}
