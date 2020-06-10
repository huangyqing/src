package 装饰模式;
public class MainClass {
	public static void main(String[] args) {		
		// TODO Auto-generated method stub		
		Person xc = new Person("jack");		
		System.out.println("First decoration");		
		Sneakers sneakers = new Sneakers();		
		BigTrouser bigTrouser = new BigTrouser();	
		TShirts tShirts = new TShirts();			
		sneakers.Decorate(xc);	
		bigTrouser.Decorate(sneakers);	
		tShirts.Decorate(bigTrouser);	
		tShirts.Show();
		}
}
//ConcreteComponent class
class Person {	
	public Person() {}	
	private String name;	
	public Person(String name) {		
		this.name = name;
		}		
	public void Show() {		
		System.out.println("装扮的"+this.name);	
		}
	} 
//Decorator
class Finery extends Person {
	protected Person component;		
	public void Decorate(Person component) {	
		this.component = component;	
		} 
	@Override
	public void Show() {	
		// TODO Auto-generated method stub	
		if (component != null) {		
			component.Show();	
			}	
		}
//ConcreteDecorator



class Suit extends Finery {
		@Override	
		public void Show() {	
			System.out.println("suit");		
			super.Show();	
			}
		} 
class Tie extends Finery {	
		@Override
		public void Show() {
			System.out.println("Tie");	
			super.Show();	
			}
		} 
class LeatherShoes extends Finery {
			@Override	public void Show() {
				System.out.println("leatherShoes");	
				super.Show();	
				}
			}
}



