package ��������ģʽ;
public class SimpleFactory {		
	public static LeiFeng createLeiFeng(String type){
		if("��ѧ��".equals(type)){		
			return new Student();		
			}else if("־Ը��".equals(type)){		
				return new Valuator();	
				}	
		return null;	
		}
	}

