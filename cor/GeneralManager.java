package 职责链模式;

public class GeneralManager extends Manager {

	@Override
	public void handleRequest(Request req) {
		if (req.getType().equals("leave")) {
			System.out.println("GereralManager: I agree the leave request");
		} else if (req.getType().equals("increase salary") && req.getNum() <= 1000) {
			System.out.println("GereralManager: I agree the salary increase request");
		} else {
			System.out.println("GereralManager: pls request next time");
		}
	}
}
