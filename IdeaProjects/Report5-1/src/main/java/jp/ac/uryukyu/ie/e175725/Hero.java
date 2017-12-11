package jp.ac.uryukyu.ie.e175725;


public class Hero extends LivingThing{

    public Hero(String name,int maximumHP,int attack){
        super(name,maximumHP,attack);
    }
    int HP = getHitPoint();
    @Override
    public void wounded(int damage){
        HP -= getHitPoint();
        if( HP < 0 ) {
            setDead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n",getName());
        }
    }
}
