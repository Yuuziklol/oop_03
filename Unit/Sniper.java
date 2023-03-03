package Unit;

public abstract class Sniper extends Archer {
    public Sniper(String name, int hp, int maxHp, int damage,int maxDamage, int att,  int def, int shots, int maxShots, float dist, int speed,int x,int y) {
        super(name, hp, maxHp, damage,maxDamage, att,  def, shots, maxShots, dist, speed, x, y);
    }

    public Sniper(String name) {
        super(name, 15, 15, 8, 10, 12, 10, 32, 32,4.5f,9,0,0);
    }
    
    @Override
    public void step(){

    }

    @Override
    public String getInfo(){
        return "Я снайпер";
    }
}