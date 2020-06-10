package 代理模式;

public class Proxy implements IGiveGift{
    Pursuit gg;
    public Proxy (Girl mm){
        this.gg=new Pursuit(mm);
    }
    @Override
    public void GiveDolls(){
        // TODO Auto-generated method stub
        gg.GiveDolls();
    }
    @Override
    public void GiveFlowers(){
        // TODO Auto-generated method stub
        gg.GiveFlowers();
    }
    @Override
    public void GiveChocolate(){
        // TODO Auto-generated method stub
        gg.GiveChocolate();
    }
}
