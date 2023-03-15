package Unit;

import java.util.ArrayList;

public abstract class SpellCaster extends Default{
    protected int mp,maxMp;
    protected float dist;
    protected int magic;
    public SpellCaster(int posX,int posY,String name,int hp, int maxHp, int damage, int maxDamage, int att, int def, int mp, int maxMp, float dist,int speed,int magic) {
        super(posX,posY,name, hp, maxHp, damage, maxDamage, att, def, speed);
        this.mp = mp;
        this.maxMp = maxMp;
        this.dist = dist;
        this.magic = magic;
    }
    public void step(ArrayList<Default> team1, ArrayList<Default> team2){
        if (state.equals("Die") || magic <= 0 ) return;
        ArrayList<Default> firstTeam;
        if (team1.contains(this)) {firstTeam = team1;}
        else {firstTeam = team2;}

        for(Default ally:firstTeam){
            if(ally.hp < ally.maxHp){
                ally.getDamage(this.damage);
                break;
            }
        }

    }
}
