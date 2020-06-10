package 访问者模式;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure { 
	private List<Person> elements = new ArrayList<Person>();		
	// 移除	
	public void detach(Person p) {	
		elements.remove(p);	
		}	
	// 增加	
	public void attach(Person p) {	
		elements.add(p);	
		}	
	// 显示	
	public void display(Action visitor) {	
		for (Person p : elements) {	
			p.accept(visitor);		
			}	
		}
}

