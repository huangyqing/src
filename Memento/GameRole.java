package 备忘录模式;

public class GameRole {  
	private String name;  
	private int vitality;
	// 生命力  
	private int attrack;  
	// 攻击力
	private int defence; 
	// 防御力   
	public GameRole(String name) {   
		this.name = name;  
		} 
	public String getName() {    
		return name; 
		}  
	public void setName(String name) {    
		this.name = name;
		} 
	public int getVitality() { 
		return vitality;
		}   
	public void setVitality(int vitality) {  
		this.vitality = vitality;  
		}   
	public int getAttrack() {  
		return attrack;  
		}   
	public void setAttrack(int attrack) { 
		this.attrack = attrack; 
		}   
	public int getDefence() { 
		return defence; 
		}   
	public void setDefence(int defence) { 
  this.defence = defence;
  }  
	// 初始状态 
	public void init() { 
		this.vitality = 100;  
		this.attrack = 50;   
		this.defence = 30;  
		}   
	// 与boss大战后状态 
public void Fight() {  
	this.vitality = 0;   
    this.attrack = 0;   
    this.defence = 0; 
 } 
	public void show(){  
		System.out.println("Name: "+name); 
		System.out.println("Vitality: "+this.vitality);
		System.out.println("Attrack: "+this.attrack);
		System.out.println("Defence: "+this.defence); 
		}   
	public Memento createMemento(){   
		return new Memento(this.vitality,this.attrack,this.defence); 
		}  
	public void backupFromMemento(Memento m){ 
		this.vitality = m.getVitality();  
		this.attrack = m.getAttrack();   
		this.defence = m.getDefence(); 
		}
	}


