package �Ž�ģʽ;


public class NokiaMobile extends Mobile {
	public NokiaMobile(String brand) {
		super(brand);
	}
	@Override
	public void run() {
		System.out.print("Nokia Mobile: ");
		this.getSoft().run();
	}
}
