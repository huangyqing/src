package 建造者模式;

import java.util.ArrayList;
import java.util.List;
public class Product {
	List<String> parts = new ArrayList<>();
	public void add(String part) {
		parts.add(part);
	}
	public void Show() {
		System.out.println("\nProduce created----");
		for (String part : parts) {
			System.out.println(part);
		}
	}

}
