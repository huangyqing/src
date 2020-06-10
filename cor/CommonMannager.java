package 职责链模式;

public class CommonMannager extends Manager {
	@Override
	public void handleRequest(Request req) {
		if (req.getType().equals("leave") && req.getNum() <= 2) {
			System.out.println("CommonManager: I agree the leave request");
		} else {
			System.out.println("CommonManager: I has no right to handle it, Pls ask help from Majordemo!");
			// 申请转到上级处理
			this.getSuperior().handleRequest(req);
		}
	}
}
