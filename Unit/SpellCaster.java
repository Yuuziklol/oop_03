package Unit;

public abstract class SpellCaster extends Default{
    protected int mp,maxMp;
    protected float dist;
    protected int magic;
    public SpellCaster(String name,int hp, int maxHp, int damage, int maxDamage, int att, int def, int mp, int maxMp, float dist,int speed,int x, int y,int magic) {
        super(name, hp, maxHp, damage, maxDamage, att, def, speed,x,y);
        this.mp = mp;
        this.maxMp = maxMp;
        this.dist = dist;
        this.magic = magic;
    }
}
