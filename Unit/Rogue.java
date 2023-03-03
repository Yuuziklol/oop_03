package Unit;

public abstract class Rogue extends Warrior{
    public Rogue(String name, int hp, int maxHp, int damage, int maxDamage, int att, int def, int rage, int maxRage,int speed,int x,int y) {
        super(name, hp, maxHp, damage, maxDamage, att, def, rage, maxRage, speed, x, y);
    }
    public Rogue(String name) {
        super(name, 10, 10, 2,4, 8, 3, 100, 100,6,0,0);
    }
    
    @Override
    public void step(){

    }

    @Override
    public String getInfo(){
        return "Я разбойник";
    }
}