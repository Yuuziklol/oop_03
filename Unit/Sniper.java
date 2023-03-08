package Unit;

public abstract class Sniper extends Archer {
    public Sniper(int posX, int posY,String name, int hp, int maxHp, int damage,int maxDamage, int att,  int def, int shots, int maxShots, float dist, int speed) {
        super(posX,posY,name, hp, maxHp, damage,maxDamage, att,  def, shots, maxShots, dist, speed);
    }

    public Sniper(String name) {
        super(0,0,name, 15, 15, 8, 10, 12, 10, 32, 32,4.5f,9);
    }
    
    // @Override
    // public void step(){

    // }

    @Override
    public String getInfo(){
        return "Я снайпер";
    }
}