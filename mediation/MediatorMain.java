package �н���ģʽ;


public class MediatorMain {
	public static void main(String[] args) {
		UnionNationsSecurityCouncil unsc = new UnionNationsSecurityCouncil();
		// ��������ס�н���
		USA usa = new USA(unsc);
		Iraq iraq = new Iraq(unsc);
		// �н��߼�ס�������
		unsc.setIraq(iraq);
		unsc.setUsa(usa);
		// �н��߸���ת����Ϣ
		usa.declare("stop the unclear weapon's development!");
		iraq.declare("I have no nuclear wapons!");
	}
}
