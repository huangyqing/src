package 代理模式;

public class Test{
    public static void main(String[] args){
        Girl mm=new Girl();
        mm.setName("小美");
        Proxy daili=new Proxy(mm);
        daili.GiveDolls();
        daili.GiveFlowers();
        daili.GiveChocolate();
    }
}
