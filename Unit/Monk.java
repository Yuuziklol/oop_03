package Unit;

public abstract class Monk extends SpellCaster{
    public Monk(String name,int hp, int maxHp, int damage, int maxDamage, int att, int def, int mp, int maxMp, float dist,int speed,int x, int y,int magic) {
        super(name, hp, maxHp, damage, maxDamage, att, def, mp, maxMp, dist, speed, x, y,magic);
    }

    public Monk(String name) {
        super(name, 30, 30, -4, -4, 12,7,300, 300,2.5f,5,0,0,1);
    }

    @Override
    public void step(){

    }

    @Override
    public String getInfo(){
        return "Я монах";
    }
}