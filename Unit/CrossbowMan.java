package Unit;

public class CrossbowMan extends Archer {
    public CrossbowMan(int posX,int posY,String name, int hp, int maxHp, int damage,int maxDamage, int att,  int def, int shots, int maxShots, float dist, int speed) {
        super(posX,posY,name, hp, maxHp, damage,maxDamage, att,  def, shots, maxShots, dist, speed);
    }

    public CrossbowMan(String name) {
        super(0,0,name, 10, 10, 2,3, 6, 3, 16, 16, 2.5f, 4);
    }

    // @Override
    // public void step(){

    // }

    @Override
    public String getInfo(){
        return "Я арбалетчик";
    }
}