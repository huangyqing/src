package ��������ģʽ;

public class test {
	public static void main(String[] args) {	
		//��һ�ַ�ʽ����ͳ��ʽ��ֱ��new	
		//���ʱ�����Ҫ�Ѵ�ѧ�����ĳ�־Ը�ߵĻ���Ҫ�������඼���滻��	
		//�����ѧ����Ļ����滻�ͻ��ú��鷳�����Ҵ��벻����	
		LeiFeng f1=new Student();
		f1.wash();	
		LeiFeng f2=new Student();	
		f2.sweep();	
		LeiFeng f3=new Student();	
		f3.buyrice(); 	
		//�ڶ��ַ�ʽ���򵥹���ģʽ
		//���ʱ����ͻᷢ�֣������������ظ��Ĵ���,���Ҫ�ĳ�	
		//־Ը�ߣ�ҲҪ�޸����Σ����������Ļ����޸�Ҳ��
		LeiFeng f11=SimpleFactory.createLeiFeng("��ѧ��");	
		f11.buyrice();	
		LeiFeng f22=SimpleFactory.createLeiFeng("��ѧ��");
		f22.wash();		
		//�����ַ�ʽ��ʹ�ù�������ģʽ	
		Factory fac=new StudentFactory();
		//������Ļ�ֻ��Ҫ�滻���������������	
		LeiFeng f4=fac.createLeiFengFactory();	
		f4.buyrice();	
		LeiFeng f5=fac.createLeiFengFactory();
		f5.wash();
	}

}
