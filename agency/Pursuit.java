package ����ģʽ;

public class Pursuit implements IGiveGift{
	 Girl mm;
     public Pursuit(Girl mm){
         this.mm=mm;
     }
     @Override
     public void GiveDolls(){
         // TODO Auto-generated method stub
         System.out.println(mm.name+"���������ޡ�");
     }
     @Override
     public void GiveFlowers(){
         // TODO Auto-generated method stub
         System.out.println(mm.name+"�����ʻ���");
     }
     @Override
     public void GiveChocolate(){
         // TODO Auto-generated method stub
         System.out.println(mm.name+"�����ɿ�����");
     }

}
