package ���󹤳�ģʽ;

public class SmsSendFactory implements AbstractFactory {  
    @Override  
    public Sender produce() {  
        return new SmsSender();  
    }  
}  
