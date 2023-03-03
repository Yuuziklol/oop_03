package Unit;

public abstract class Farmer extends Warrior{
    protected int delivery;
    public Farmer(String name, int hp, int maxHp, int damage, int maxDamage, int att, int def, int rage, int maxRage,int speed,int x,int y,int delivery) {
        super(name, hp, maxHp, damage, maxDamage, att, def, rage, maxRage, speed, x, y);
        this.delivery = delivery;
    }

    public Farmer(String name) {
        super(name, 1, 1, 1,1, 1, 1, 0, 100,3,0,0);
        this.delivery = 1;
    }

    @Override
    public void step(){

    }

    @Override
    public String getInfo(){
        return "Я крестьянин";
    }
}
