package 职责链模式;


public abstract class Manager {
	// 当前管理者的上级
	private Manager superior;
	public Manager getSuperior() {
		return superior;
	}
	public void setSuperior(Manager superior) {
		this.superior = superior;
	}
	// 处理员工请求
	public abstract void handleRequest(Request req);
}
