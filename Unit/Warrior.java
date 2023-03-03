package Unit;

public abstract class Warrior extends Default{
    protected int rage,maxRage;
    public Warrior(String name, int hp, int maxHp, int damage, int maxDamage, int att, int def, int rage, int maxRage,int speed,int x,int y) {
        super(name, hp, maxHp, damage, maxDamage, att, def, speed,x,y);
        this.rage = rage;
        this.maxRage = maxRage;
    }
}