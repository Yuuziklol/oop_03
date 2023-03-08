package Unit;

public abstract class SpellCaster extends Default{
    protected int mp,maxMp;
    protected float dist;
    protected int magic;
    public SpellCaster(int posX,int posY,String name,int hp, int maxHp, int damage, int maxDamage, int att, int def, int mp, int maxMp, float dist,int speed,int magic) {
        super(posX,posY,name, hp, maxHp, damage, maxDamage, att, def, speed);
        this.mp = mp;
        this.maxMp = maxMp;
        this.dist = dist;
        this.magic = magic;
    }
}
