package ���󹤳�ģʽ;

public class EmailSendFactory implements AbstractFactory {  
    @Override  
    public Sender produce() {  
        return new EmailSender();  
    }  
}  
