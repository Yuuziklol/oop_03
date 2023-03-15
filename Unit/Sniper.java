package Unit;

public class Sniper extends Archer {
    public Sniper(int posX, int posY,String name, int hp, int maxHp, int damage,int maxDamage, int att,  int def, int ammo, float dist, int speed) {
        super(posX,posY,name, hp, maxHp, damage,maxDamage, att,  def, ammo, dist, speed);
    }

    public Sniper(String name) {
        super(0,0,name, 15, 15, 8, 10, 12, 10, 32,4.5f,9);
    }
    
    // @Override
    // public void step(){

    // }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Снайпер:\t").append(Sniper.super.name)
                .append("\t| АТК: \t").append(Sniper.super.att)
                .append("\t| HP: \t").append(Sniper.super.hp)
                .append("\t| Arrows: \t").append(Sniper.super.ammo)
                .append("\t|").append("\t| (X.Y) :").append(Sniper.super.coords.posX).append(".").append(Sniper.super.coords.posY);
    }    
}