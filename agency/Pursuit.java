package 代理模式;

public class Pursuit implements IGiveGift{
	 Girl mm;
     public Pursuit(Girl mm){
         this.mm=mm;
     }
     @Override
     public void GiveDolls(){
         // TODO Auto-generated method stub
         System.out.println(mm.name+"送你洋娃娃。");
     }
     @Override
     public void GiveFlowers(){
         // TODO Auto-generated method stub
         System.out.println(mm.name+"送你鲜花。");
     }
     @Override
     public void GiveChocolate(){
         // TODO Auto-generated method stub
         System.out.println(mm.name+"送你巧克力。");
     }

}
