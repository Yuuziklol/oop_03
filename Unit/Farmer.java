package Unit;

import java.util.ArrayList;

public class Farmer extends Warrior{
    protected int delivery;
    public Farmer(int posX, int posY,String name, int hp, int maxHp, int damage, int maxDamage, int att, int def, int rage, int maxRage,int speed,int delivery) {
        super(posX,posY,name, hp, maxHp, damage, maxDamage, att, def, rage, maxRage, speed);
        this.delivery = delivery;
    }

    public Farmer(String name) {
        super(0,0,name, 1, 1, 1,1, 1, 1, 0, 100,3);
        this.delivery = 1;
    }

    // @Override
    // public void step(){

    // }

    @Override
    public String getInfo(){
        return "Я крестьянин";
    }
    @Override
    public void step(ArrayList<Default> team1, ArrayList<Default> team2){
        if (!this.state.equals("Die")) this.state = "Stand";
    }
}
