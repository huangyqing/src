package ���󹤳�ģʽ;

public class Test {  
    public static void main(String[] args) {  
        /** 
         * �������� 
         */  
        AbstractFactory factory = new SmsSendFactory();  
        /** 
         * ������Ʒ 
         */  
        Sender sender = factory.produce();  
        /** 
         * ִ��ҵ���߼� 
         */  
        sender.send();  
    }  
  
}  
