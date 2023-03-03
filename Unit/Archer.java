package Unit;

public abstract class Archer extends Default{
    protected int shots, maxShots;
    protected float dist;

    public Archer(String name, int hp, int maxHp, int damage, int maxDamage, int att,  int def, int shots, int maxShots, float dist, int speed,int x,int y) {
        super(name, hp, maxHp, damage, maxDamage, att, def, speed,x,y);
        this.dist = dist;
        this.shots = shots;
        this.maxShots = maxShots;
    }

    public float getDist() {return dist;}
}