package 中介者模式;


public class USA extends Country {
	public USA(UnionNations un) {
		super(un);
	}
	@Override
	public void declare(String message) {
		this.getUn().declare(message, this);
	}
	@Override
	public void getMessage(String message) {
	   System.out.println("USA has get the message: " + message);
	}
}
