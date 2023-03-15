package Unit;

public class Monk extends SpellCaster{
    public Monk(int posX, int posY,String name,int hp, int maxHp, int damage, int maxDamage, int att, int def, int mp, int maxMp, float dist,int speed,int magic) {
        super(posX,posY,name, hp, maxHp, damage, maxDamage, att, def, mp, maxMp, dist, speed, magic);
    }

    public Monk(String name) {
        super(0,0,name, 30, 30, -4, -4, 12,7,300, 300,2.5f,5,1);
    }

    // @Override
    // public void step(){

    // }

    @Override
    public String getInfo(){
        return "Я монах";
    }
}