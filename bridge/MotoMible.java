package ге╫сдёй╫;

public class MotoMible extends Mobile {
	public MotoMible(String brand) {
		super(brand);
	}
	@Override
	public void run() {
		System.out.print("Moto Mobile: ");
		this.getSoft().run();
	}
}
