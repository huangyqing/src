package 模板方法模式;

public abstract class AbstractClass{	
	public abstract void primitiveOperation1(); 	
	public abstract void primitiveOperation2(); 	
	public void templateMethod()	{		
		primitiveOperation1();	
        primitiveOperation2();	
}
	}

