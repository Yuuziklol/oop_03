package Unit;

import java.util.ArrayList;

public abstract class Archer extends Default{
    protected int shots, maxShots;
    protected float dist;

    public Archer(int posX, int posY,String name, int hp, int maxHp, int damage, int maxDamage, int att,  int def, int shots, int maxShots, float dist, int speed) {
        super(posX, posY, name, hp, maxHp, damage, maxDamage, att, def, speed);
        this.dist = dist;
        this.shots = shots;
        this.maxShots = maxShots;
    }

    public float getDist() {return dist;}
    @Override
    public void step(ArrayList<Default> team1, ArrayList<Default> team2){
        int index = super.findNearest(team2);
    }
}