package ְ����ģʽ;


public class ChainOfResponsibilityMain {
	public static void main(String[] args) {
		Manager commonManager = new CommonMannager();
		Manager majordemo = new Majordemo();
		Manager generalManager = new GeneralManager();
		// �����Լ����ϼ�
		commonManager.setSuperior(majordemo);
    	majordemo.setSuperior(generalManager);
		// ����Ա����������
		Request req1 = new Request("leave", 3);
		Request req2 = new Request("increase salary", 2000);
		// �����������
		commonManager.handleRequest(req1);
    	commonManager.handleRequest(req2);
	}
}
