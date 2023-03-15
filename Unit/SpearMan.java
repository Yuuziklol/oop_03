package Unit;

public class SpearMan extends Warrior{
    public SpearMan(int posX, int posY,String name, int hp, int maxHp, int damage, int maxDamage, int att, int def, int rage, int maxRage,int speed) {
        super(posX,posY,name, hp, maxHp, damage, maxDamage, att, def, rage, maxRage, speed);
    }

    public SpearMan(String name) {
        super(0,0,name, 10, 10, 1, 3, 4, 5, 40, 100, 4);
    }

    // @Override
    // public void step(){

    // }

    @Override
    public String getInfo(){
        return "Я копейщик";
    }
}