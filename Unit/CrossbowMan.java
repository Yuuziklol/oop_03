package Unit;

public abstract class CrossbowMan extends Archer {
    public CrossbowMan(String name, int hp, int maxHp, int damage,int maxDamage, int att,  int def, int shots, int maxShots, float dist, int speed,int x,int y) {
        super(name, hp, maxHp, damage,maxDamage, att,  def, shots, maxShots, dist, speed, x, y);
    }

    public CrossbowMan(String name) {
        super(name, 10, 10, 2,3, 6, 3, 16, 16, 2.5f, 4, 0, 0);
    }

    @Override
    public void step(){

    }

    @Override
    public String getInfo(){
        return "Я арбалетчик";
    }
}