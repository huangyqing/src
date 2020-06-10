package 工厂方法模式;

public class test {
	public static void main(String[] args) {	
		//第一种方式：传统方式，直接new	
		//这个时候如果要把大学生给改成志愿者的话需要把三个类都给替换掉	
		//如果大学生多的话那替换就会变得很麻烦，而且代码不美观	
		LeiFeng f1=new Student();
		f1.wash();	
		LeiFeng f2=new Student();	
		f2.sweep();	
		LeiFeng f3=new Student();	
		f3.buyrice(); 	
		//第二种方式，简单工厂模式
		//这个时候你就会发现，这里有两句重复的代码,如果要改成	
		//志愿者，也要修改两次，如果数量多的话那修改也多
		LeiFeng f11=SimpleFactory.createLeiFeng("大学生");	
		f11.buyrice();	
		LeiFeng f22=SimpleFactory.createLeiFeng("大学生");
		f22.wash();		
		//第三种方式，使用工厂方法模式	
		Factory fac=new StudentFactory();
		//像这里的话只需要替换这个工厂类名即可	
		LeiFeng f4=fac.createLeiFengFactory();	
		f4.buyrice();	
		LeiFeng f5=fac.createLeiFengFactory();
		f5.wash();
	}

}
