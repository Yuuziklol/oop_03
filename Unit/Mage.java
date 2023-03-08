package Unit;

public abstract class Mage extends SpellCaster{
    public Mage(int posX, int posY,String name,int hp, int maxHp, int damage, int maxDamage, int att, int def, int mp, int maxMp, float dist,int speed,int magic) {
        super(posX,posY,name, hp, maxHp, damage, maxDamage, att, def, mp, maxMp, dist, speed,magic);
    }

    public Mage(String name) {
        super(0,0,name, 30, 30, -5,-5, 17, 12, 250, 250,2.2f,9,1);
    }

    // @Override
    // public void step(){

    // }

    @Override
    public String getInfo(){
        return "Я маг";
    }
}