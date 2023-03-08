package Unit;

public abstract class Warrior extends Default{
    protected int rage,maxRage;
    public Warrior(int posX,int posY,String name, int hp, int maxHp, int damage, int maxDamage, int att, int def, int rage, int maxRage,int speed) {
        super(posX,posY,name, hp, maxHp, damage, maxDamage, att, def, speed);
        this.rage = rage;
        this.maxRage = maxRage;
    }
}