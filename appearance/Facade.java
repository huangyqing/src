package 外观模式;

public class Facade {	    
	SubSystemOne one;	   
	SubSystemTwo two;	   
	SubSystemThree three;	     
	public Facade() {	          
		one = new SubSystemOne();	       
		two = new SubSystemTwo();	      
		three = new SubSystemThree();	  
		}	
	    public void MethodA(){	   
	    	System.out.println("方法组A（）");	
	    	one.MethodOne();	              
	    	two.MethodTwo();	       
	    	}	        
	    public void MethodB(){	        
	    	System.out.println("方法组B（）");
	    	two.MethodTwo();	           
	    	three.MethodThree();	      
	    	}	

}

