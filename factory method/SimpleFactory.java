package 工厂方法模式;
public class SimpleFactory {		
	public static LeiFeng createLeiFeng(String type){
		if("大学生".equals(type)){		
			return new Student();		
			}else if("志愿者".equals(type)){		
				return new Valuator();	
				}	
		return null;	
		}
	}

