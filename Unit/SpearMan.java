package Unit;

public abstract class SpearMan extends Warrior{
    public SpearMan(String name, int hp, int maxHp, int damage, int maxDamage, int att, int def, int rage, int maxRage,int speed,int x,int y) {
        super(name, hp, maxHp, damage, maxDamage, att, def, rage, maxRage, speed, x, y);
    }

    public SpearMan(String name) {
        super(name, 10, 10, 1, 3, 4, 5, 40, 100, 4, 0, 0);
    }

    @Override
    public void step(){

    }

    @Override
    public String getInfo(){
        return "Я копейщик";
    }
}