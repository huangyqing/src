package 中介者模式;


public abstract class Country {
	private UnionNations un;
	public Country(UnionNations un) {
		this.un = un;
	}
	public UnionNations getUn() {
		return un;
	}
	public void setUn(UnionNations un) {
		this.un = un;
	}
	public abstract void declare(String message);
	public abstract void getMessage(String message);
}
