package 建造者模式;

public class ConcreteBuilder1 extends Builder {
	private Product product = new Product();
	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.add("Part A");
	}
	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		product.add("Part B");
	}
	@Override
	public Product getResult() {
		// TODO Auto-generated method stub
		return product;
	}
}
