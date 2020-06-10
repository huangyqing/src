package 访问者模式;


public abstract class Person {

	// 接受一个'访问者'为参数
	public abstract void accept(Action visitor);
}
