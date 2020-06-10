package 中介者模式;


public class MediatorMain {
	public static void main(String[] args) {
		UnionNationsSecurityCouncil unsc = new UnionNationsSecurityCouncil();
		// 具体对象记住中介者
		USA usa = new USA(unsc);
		Iraq iraq = new Iraq(unsc);
		// 中介者记住具体对象
		unsc.setIraq(iraq);
		unsc.setUsa(usa);
		// 中介者负责转发消息
		usa.declare("stop the unclear weapon's development!");
		iraq.declare("I have no nuclear wapons!");
	}
}
