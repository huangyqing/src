package ������ģʽ;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure { 
	private List<Person> elements = new ArrayList<Person>();		
	// �Ƴ�	
	public void detach(Person p) {	
		elements.remove(p);	
		}	
	// ����	
	public void attach(Person p) {	
		elements.add(p);	
		}	
	// ��ʾ	
	public void display(Action visitor) {	
		for (Person p : elements) {	
			p.accept(visitor);		
			}	
		}
}

