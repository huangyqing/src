package ְ����ģʽ;


public abstract class Manager {
	// ��ǰ�����ߵ��ϼ�
	private Manager superior;
	public Manager getSuperior() {
		return superior;
	}
	public void setSuperior(Manager superior) {
		this.superior = superior;
	}
	// ����Ա������
	public abstract void handleRequest(Request req);
}
