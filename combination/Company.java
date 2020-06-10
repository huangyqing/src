package 组合模式;


public abstract class Company {
	private String name;
	public Company(String name) {
		this.name = name;
		}

 	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	// 增加
	public abstract void add(Company c);
	// 移除
	public abstract void remove(Company c);
	// 显示
	public abstract void display(int depth);
	// 履行职责
	public abstract void lineOfDuty();
}
