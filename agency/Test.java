package ����ģʽ;

public class Test{
    public static void main(String[] args){
        Girl mm=new Girl();
        mm.setName("С��");
        Proxy daili=new Proxy(mm);
        daili.GiveDolls();
        daili.GiveFlowers();
        daili.GiveChocolate();
    }
}
