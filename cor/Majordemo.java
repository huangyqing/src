package ְ����ģʽ;


public class Majordemo extends Manager {

	@Override
	public void handleRequest(Request req) {
		if (req.getType().equals("leave") && req.getNum() <= 5) {
			System.out.println("Majordemo: I agree the leave request");
		} else {
			System.out.println("Majordemo: I has no right to handle it, Pls ask help from GereralManager!");
			// ����ת���ϼ�����
			this.getSuperior().handleRequest(req);
		}
	}
}
