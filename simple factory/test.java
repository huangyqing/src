package 简单工厂模式;

public class test {
	public static void main(String[] args) {
		Operation add = OperationFactory.createOperation("+");
		Operation sub = OperationFactory.createOperation("-");
		Operation mul = OperationFactory.createOperation("*");
		Operation div = OperationFactory.createOperation("/");
		System.out.println(add.GetResult(1, 2));
		System.out.println(sub.GetResult(2, 1));
		System.out.println(mul.GetResult(1, 2));
		System.out.println(div.GetResult(2, 1));
	}

}
