package 职责链模式;


public class ChainOfResponsibilityMain {
	public static void main(String[] args) {
		Manager commonManager = new CommonMannager();
		Manager majordemo = new Majordemo();
		Manager generalManager = new GeneralManager();
		// 设置自己的上级
		commonManager.setSuperior(majordemo);
    	majordemo.setSuperior(generalManager);
		// 设置员工请求内容
		Request req1 = new Request("leave", 3);
		Request req2 = new Request("increase salary", 2000);
		// 经理接受请求
		commonManager.handleRequest(req1);
    	commonManager.handleRequest(req2);
	}
}
