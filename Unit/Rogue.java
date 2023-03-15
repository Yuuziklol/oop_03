package Unit;

public class Rogue extends Warrior{
    public Rogue(int posX, int posY,String name, int hp, int maxHp, int damage, int maxDamage, int att, int def, int rage, int maxRage,int speed) {
        super(posX,posY,name, hp, maxHp, damage, maxDamage, att, def, rage, maxRage, speed);
    }
    public Rogue(String name) {
        super(0,0,name, 10, 10, 2,4, 8, 3, 100, 100,6);
    }
    
    // @Override
    // public void step(){

    // }

    @Override
    public String getInfo(){
        return "Я разбойник";
    }
}